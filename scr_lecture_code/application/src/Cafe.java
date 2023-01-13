import java.util.Objects;

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
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getDrinks() {
        return drinks;
    }
    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", drinks=" + drinks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cafe)) return false;
        Cafe cafe = (Cafe) o;
        return drinks == cafe.drinks && name.equals(cafe.name) && address.equals(cafe.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, drinks);
    }
}
