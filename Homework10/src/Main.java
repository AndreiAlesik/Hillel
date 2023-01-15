import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
public class Main {
    static Map<Product,Company> products=new HashMap<>();
    public static void main(String[] args) throws Exception {

        Product product1 = new Product("13", 7000, Company.Apple);
        Product product2 = new Product("14", 8000, Company.Apple);
        Product product3 = new Product("S13", 8000, Company.Samsung);
        Product product4 = new Product("S15", 9000, Company.Samsung);
        Product product5 = new Product("Model X", 40000, Company.Tesla);
        Product product6 = new Product("Model Y", 100000, Company.Tesla);

        products.put(product1, Company.Apple);
        products.put(product2, Company.Apple);
        products.put(product3, Company.Samsung);
        products.put(product4, Company.Samsung);
        products.put(product5, Company.Tesla);
        products.put(product6, Company.Tesla);

        //System.out.println(products);
//        addProduct("13");
//        addProduct("BMW");

        System.out.println("All products: ");
        products.keySet().forEach(System.out::println);

        System.out.println("\nProducts sorted by price in ascending order: ");
        getSortedProducts(Comparator.comparing(Product::getPrice))
                .ifPresent(l -> l.forEach(System.out::println));

        System.out.println("\nProducts made by Samsung: ");
        getProductsByCompany(Company.Samsung)
                .ifPresent(l -> l.forEach(System.out::println));

        getRemovedProducts(Company.Samsung)
                .ifPresent(p->p.forEach(System.out::println));
        System.out.println("\nAll products after removing Samsung products:");
        products.keySet().forEach(System.out::println);

    }

//    public static Product addProduct(String name) throws Exception{
//        Product product;
//        if(name!=null){
//            product=new Product(name);
//            if(isExist(product))
//                throw new Exception("Object is already exist");
//        }
//        else
//            product=new Product(Product.showMessage());
//        return product;
//    }
//    public static boolean isExist(Product product){
//
//        return products.containsKey(product);
//    }
    public static Optional<List<Product>> getRemovedProducts(Company company) {
        List<Product> removedProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue() == company)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        removedProducts.forEach(p-> products.remove(p));
        return Optional.of(removedProducts);
    }


    public static Optional<List<Product>> getSortedProducts(Comparator<Product> comparator) {
        return Optional.of(products.keySet().stream()
                .sorted(comparator)
                .collect(Collectors.toList()));
    }

    public static Optional<List<Product>> getProductsByCompany(Company company) {
        return Optional.of(products.keySet().stream()
                .filter(product -> product.getCompany() == company)
                .collect(Collectors.toList()));
    }



}