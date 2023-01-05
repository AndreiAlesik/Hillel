package phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PhoneBook {
    private List<Record> records = new ArrayList<>();
    public List<Record> getRecords() {
        return records;
    }

    public Record find(String name) {
        for (Record item : getRecords()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }


    public void add(String name, String phoneNumber) {
        if (!name.isEmpty() && !phoneNumber.isEmpty())
            getRecords().add(new Record(name, phoneNumber));
    }
    public List<Record> findAll(String name){
        List<Record> outputList=new ArrayList<>();
        for(Record items: getRecords()){
            if(items.getName().equals(name))
                outputList.add(items);
        }
        return outputList;
    }
}
