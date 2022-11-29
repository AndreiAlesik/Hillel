package task1;

public class Circle extends Figure implements Calculate{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double side, double height, double base, double radius, double radius1) {
        super(side, height, base, radius);
        this.radius = radius1;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(double height, double base) {
        return 0;
    }

    @Override
    public double calculateArea(double radius) {
        if(radius>0) return Math.PI*radius*radius;
        else {
            System.out.println("Radius must be > 0");
            return 0;
        }
    }
    public double getArea(){
        return calculateArea(getRadius());
    }
}
