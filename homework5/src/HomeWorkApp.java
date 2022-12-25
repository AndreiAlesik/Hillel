public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();


        checkSumSign(1, 2);
        checkSumSign(-1, 1);
        checkSumSign(-1, -1);


        printColor(-10);
        printColor(0);

        printColor(50);
        printColor(100);

        printColor(101);

        compareNumbers(1, 2);
        compareNumbers(2, 2);
        compareNumbers(2, 1);

        System.out.println(checkSumInterval(9, 10));
        System.out.println(checkSumInterval(1, 2));
        System.out.println(checkSumInterval(2, 20) + "\n");

        checkPositiveOrNegative(0);
        checkPositiveOrNegative(-10);

        isNegative(-10);
        isNegative(5);

        printString("Hello", 3);
        System.out.println();

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2014));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0)
            System.out.println("Sum is positive\n");
        else
            System.out.println("Sum is negative\n");
    }

    public static void printColor(int value) {
        if (value <= 0)
            System.out.println("Red\n");
        else if (value > 0 && value <= 100)
            System.out.println("Yellow\n");
        else
            System.out.println("Green\n");
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b)
            System.out.println("a>=b\n");
        else
            System.out.println("a<b\n");
    }

    public static boolean checkSumInterval(int a, int b) {
        if (a + b > 10 && a + b <= 20)
            return true;
        else
            return false;
    }

    public static void checkPositiveOrNegative(int number) {
        if (number >= 0)
            System.out.println("Number " + number + " is positive\n");
        else
            System.out.println("Number " + number + " is negative\n");
    }

    public static boolean isNegative(int number) {
        return number < 0 ? true : false;
    }

    public static void printString(String str, int counter) {
        while (counter > 0) {
            System.out.println(str);
            counter--;
        }
    }

    public static boolean isLeapYear(int year) {
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400, year is a leap
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            // if the year is not century
            else
                return true;
        } else
            return false;
    }
}