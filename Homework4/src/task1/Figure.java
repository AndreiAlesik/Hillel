package task1;

public class Figure {
    private double side;
    private double height;
    private double base;
    private double radius;

    public Figure() {
    }

    public Figure(double side, double height, double base, double radius) {
        this.side = side;
        this.height = height;
        this.base = base;
        this.radius = radius;
    }

    public double getSide() {        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
