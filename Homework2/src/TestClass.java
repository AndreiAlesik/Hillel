import samename1.SameName1;
import samename2.SameName2;

public class TestClass implements check{
    @Override
    public void checkEmployee(){
        Employee employee=new Employee();
        System.out.println("Employee\n");
        employee.setFullName("");
        employee.setFullName("Oleg");
        employee.setFullName("Oleg Kaluzny");
        System.out.println(employee.getFullName()+"\n");


        employee.setPosition("");
        employee.setPosition("Programmer");
        System.out.println(employee.getPosition()+"\n");


        employee.setEmail("olegkaluzny");
        employee.setEmail("olegkaluzny@gmail.com");
        System.out.println(employee.getEmail()+"\n");


        employee.setPhoneNumber("12345567");
        employee.setPhoneNumber("+1234567");
        System.out.println(employee.getPhoneNumber()+"\n");

        employee.setAge(1);
        employee.setAge(19);
        System.out.println(employee.getAge()+"\n"+"\n");




    }

    @Override
    public void checkCar() {
        System.out.println("Car");
        Car car=new Car();
        car.start();
        System.out.println();
        car.stop();
        System.out.println("\n"+"\n");
    }

    @Override
    public void checkSameName1() {
        System.out.println("SameName 1");
        SameName1 sameName1=new SameName1("Andrew","Alesik");
        System.out.println(sameName1.getFirstName());
        System.out.println(sameName1.getSurname());
        System.out.println("\n"+"\n");
    }

    @Override
    public void checkSameName2() {
        System.out.println("SameName 2");
        SameName2 sameName2= new SameName2("Oleg","Kaluzny");
        System.out.println(sameName2.getFirstName());
        System.out.println(sameName2.getSurname());
        System.out.println("\n"+"\n");

    }
}
