public class Cafe {
    private String name;
    private String address;
    private int drinks;

    public Cafe() {
    }

    public Cafe(String name, String address, int drinks) {
        this.name = name;
        this.address = address;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", drinks=" + drinks +
                '}';
    }
}
