package task1;

public class Square extends Figure implements Calculate{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double height, double base, double radius, double side1) {
        super(side, height, base, radius);
        this.side = side1;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(double height, double base) {
        return 0;
    }

    @Override
    public double calculateArea(double side) {
        if(side>0) return side*side;
        else {
            System.out.println("Side must be > 0");
            return 0;
        }
    }
    public double getArea(){
        return  calculateArea(getSide());
    }

}
