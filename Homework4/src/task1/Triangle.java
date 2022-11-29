package task1;

public class Triangle extends Figure implements Calculate{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(double side, double height, double base, double radius, double height1, double base1) {
        super(side, height, base, radius);
        this.height = height1;
        this.base = base1;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea(double height, double base) {
        if(height>0 && base>0) return height*base*0.5;
        else {
            System.out.println("Height and base must be > 0");
            return 0;
        }
    }

    @Override
    public double calculateArea(double side) {
        return 0;
    }
    public double getArea(){
        return calculateArea(getHeight(),getBase());
    }
}
