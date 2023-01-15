import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private Company company;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int price, Company company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static String showMessage(){
        return "Name cannot be a null";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() && getName().equals(product.getName()) && getCompany() == product.getCompany();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCompany());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}
