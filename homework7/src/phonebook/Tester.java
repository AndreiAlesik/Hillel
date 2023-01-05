package phonebook;

import javax.sound.midi.Soundbank;

public class Tester {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();

        phoneBook.add("Andrew Alesik","123");
        phoneBook.add("Andrew Alesik", "789");
        phoneBook.add("Oleg Kaluzny", "456");
        phoneBook.add("Oleg Kaluzny", "234");

        System.out.println(phoneBook.find("Oleg Kaluzny"));
        System.out.println(phoneBook.findAll("Andrew Alesik"));
    }
}
