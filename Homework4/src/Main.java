import task1.Calculate;
import task1.Circle;
import task1.Square;
import task1.Triangle;
import task2.*;

public class Main {
    public static void main(String[] args) {
        Calculate[] figures = new Calculate[]{
                new Triangle(5, 10),
                new Square(10),
                new Circle(15)
        };
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Area of figure " + figures[i].getClass().getName() + " = " + figures[i].getArea() + "\n");
            sum += figures[i].getArea();
        }
        System.out.println("Total areas sum is " + sum);

        Participant[] participants = {
                new Cat("Tishka", 100, 3),
                new Robot("R2-D2", 30, 1),
                new Human("Borya", 1000, 1.3)
        };
        Barrier[] barriers = {
                new Treadmill("Treadmill 1", 10),
                new Wall("Wall 2", 0.5),
                new Treadmill("Treadmill 3", 50),
                new Wall("Wall 4", 1),
                new Wall("Wall 5", 1),
                new Treadmill("Treadmill 6", 40)
        };
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if(!participants[i].overcomeTreadmill(barriers[j]).contains("Fail"))
                    System.out.println(participants[i].overcomeTreadmill(barriers[j]));
                else{
                    System.out.println(participants[i].overcomeTreadmill(barriers[j]));
                    break;
                }
            }

            System.out.println();
        }
    }
}