public class Animal {
    private static int Counter;
    private int numbersOfLegs;
    private boolean isVegeratian;

    public Animal(int numbersOfLegs, boolean isVegeratian) {
        this.numbersOfLegs = numbersOfLegs;
        this.isVegeratian = isVegeratian;
        Counter++;
    }

    public static int getCounter() {
        return Counter;
    }

    public int getNumbersOfLegs() {
        return numbersOfLegs;
    }

    public void setNumbersOfLegs(int numbersOfLegs) {
        this.numbersOfLegs = numbersOfLegs;
    }

    public boolean getIsVegeratian() {
        return isVegeratian;
    }

    public void setVegeratian(boolean vegeratian) {
        isVegeratian = vegeratian;
    }
}
