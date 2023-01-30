package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        List<String> paths=new ArrayList<>();

        paths.add("Documents\\GitHub\\Hillel\\Homework10");
        paths.add("Documents\\GitHub\\Hillel\\Homework9");
        paths.add("Documents\\GitHub\\Databases");
        paths.add("Documents\\GitHub\\Databases\\put-db-project");
        //---add files
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("File1", 3, "Documents\\GitHub\\Hillel\\Homework10"), paths.get(0));
        fileNavigator.add(new FileData("File2", 7, "Documents\\GitHub\\Hillel\\Homework9"), paths.get(1));
        fileNavigator.add(new FileData("File3", 15, "Documents\\GitHub\\Hillel\\Homework9"), paths.get(1));
        fileNavigator.add(new FileData("File4", 20, "Documents\\GitHub\\Hillel\\Homework9"), paths.get(1));
        fileNavigator.add(new FileData("File5", 112, "Documents\\GitHub\\Databases\\put-db-project"), paths.get(3));
        fileNavigator.add(new FileData("File6", 184, "Documents\\GitHub\\Databases\\put-db-project"),paths.get(3));

        //ex 7
        //fileNavigator.add(new FileData("File7", 200, "Documents\\GitHub\\Hillel\\Homework9"), paths.get(2));
        System.out.println("find: ");
        System.out.println(fileNavigator.find(paths.get(0)));
        System.out.println("--------------------------------------------");
        System.out.println("filterBySize: ");
        System.out.println(fileNavigator.filterBySize(30));
        System.out.println("--------------------------------------------");
        System.out.println("sortBySize: ");
        System.out.println(fileNavigator.sortBySize());
        System.out.println("---------------------------------------------");
        System.out.println("remove: ");
        System.out.println(fileNavigator.remove(paths.get(0)));
        System.out.println(fileNavigator);
    }
}