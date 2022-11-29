public class Cat extends Animal implements Running, Swimming {

    private static int Counter;
    private String name;

    private String color;

    public boolean isAgressive() {
        return isAgressive;
    }

    public void setAgressive(boolean agressive) {
        isAgressive = agressive;
    }

    private boolean isAgressive;


    public Cat(int numbersOfLegs, boolean isVegeratian, String name, String color, boolean isAgressive) {
        super(numbersOfLegs, isVegeratian);
        this.name = name;
        this.color = color;
        this.isAgressive = isAgressive;
        Counter++;
    }

    public static int getCounter() {
        return Counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void run(int distance) {
        if(distance<=200)  System.out.println(getName()+" ran "+ distance+" meters.");
        else System.out.println(getName() +" tired and chilling.");
    }

    @Override
    public void swim(int distance) {
        if(distance==0) System.out.println("You saved"+ getName()+"'s live");
        else System.out.println(getName()+ " drowned(((");
    }
}
