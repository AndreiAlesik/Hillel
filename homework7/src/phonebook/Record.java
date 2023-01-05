package phonebook;

import java.util.Objects;

public class Record {
    private String name;
    private String phoneNumber;

    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;
        Record record = (Record) o;
        return getName().equals(record.getName()) && getPhoneNumber().equals(record.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
