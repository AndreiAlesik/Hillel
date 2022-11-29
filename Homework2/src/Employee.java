public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee() {
    }

    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(!fullName.isEmpty() && fullName.contains(" ")) this.fullName = fullName;
        else System.out.println("Write fullname");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if(!position.isEmpty()) this.position = position;
        else System.out.println("Write position!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")) this.email = email;
        else System.out.println("This isn't an email adress");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.contains("+")){
        this.phoneNumber = phoneNumber;}
        else System.out.println("Phone number must be written with +");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>16 && age<100) this.age = age;
        else System.out.println("Invalid age");
    }
}
