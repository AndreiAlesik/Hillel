public class Dog extends Animal implements Running, Swimming{

    private static int Counter;
    private int barkingVolume;
    private String color;
    private String name;


    public Dog(int numbersOfLegs, boolean isVegeratian, int barkingVolume, String color, String name) {
        super(numbersOfLegs, isVegeratian);
        this.barkingVolume = barkingVolume;
        this.color = color;
        this.name = name;
        Counter++;
    }

    public static int getCounter() {
        return Counter;
    }

    public int getBarkingVolume() {
        return barkingVolume;
    }

    public void setBarkingVolume(int barkingVolume) {
        this.barkingVolume = barkingVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if(distance<=500)  System.out.println(getName()+" ran "+ distance+" meters.");
        else System.out.println(getName() +" tired and chilling.");
    }

    @Override
    public void swim(int distance) {
        if(distance<=10) System.out.println(getName()+" swam "+ distance+" meters.");
        else System.out.println(getName()+ " drowned(((");
    }
}
