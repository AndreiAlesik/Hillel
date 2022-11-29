public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal(4, false);
        System.out.println(animal.getIsVegeratian());

        Cat cat1=new Cat(4,false,"Barsik","White",false);
        cat1.run(150);
        cat1.swim(0);

        System.out.println();

        Cat cat2=new Cat(4, false,"Tishka", "Black", true);
        cat2.run(500);
        cat2.swim(10);

        System.out.println();

        Dog dog1=new Dog(4, false, 120, "golden", "Charlie");
        dog1.run(250);
        dog1.swim(5);
        System.out.println();

        Dog dog2=new Dog(4, false,150, "White", "Lola");
        dog2.run(600);
        dog2.swim(11);
        System.out.println();

        System.out.println("Animals created: "+Animal.getCounter());
        System.out.println("Cats created: "+ Cat.getCounter());
        System.out.println("Dogs created: "+Dog.getCounter());
        System.out.println();
    }
}