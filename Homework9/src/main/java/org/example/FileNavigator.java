package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {
    private Map<String, List<FileData>> filesMap=new HashMap<>();

    public FileNavigator() {
    }

    public FileNavigator(Map<String, List<FileData>> filesMap) {
        this.filesMap = filesMap;
    }

    public Map<String, List<FileData>> getFilesMap() {
        return filesMap;
    }

    public void add(FileData fileData, String path) throws Exception {
        List<FileData> tmpFiles=new ArrayList<>();
        if(!path.equals(fileData.getPath()))
            throw new Exception("Wrong path");
        if(filesMap.containsKey(fileData.getPath())){
            tmpFiles=getFilesMap().get(fileData.getPath());
            tmpFiles.add(fileData);
        }
        else {
            tmpFiles.add(fileData);
            getFilesMap().put(fileData.getPath(),tmpFiles);
        }
    }
    public List<FileData> find(String path){
        return getFilesMap().getOrDefault(path, Collections.emptyList());
    }
    public List<FileData> filterBySize(int size) {
        return getFilesMap().values().stream()
                .flatMap(List::stream)
                .filter(el -> el.getSize() >= size)
                .collect(Collectors.toList());
    }

    public boolean remove(String path) {
        return getFilesMap().remove(path) != null;
    }

    public List<FileData> sortBySize() {
        return getFilesMap().values().stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparing(FileData::getSize))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "filesMap=" + filesMap +
                '}';
    }
}
