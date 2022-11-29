package task2;

public class Barrier {

    private String name;
    private double lengthOrHeight;


    public Barrier() {

    }

    public Barrier(String name, double lengthOrHeight) {
        this.name = name;
        this.lengthOrHeight = lengthOrHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthOrHeight() {
        return lengthOrHeight;
    }

    public void setLengthOrHeight(double lengthOrHeight) {
        this.lengthOrHeight = lengthOrHeight;
    }
}
