package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static List<Product> productList=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        productList.add(new Product("Book", 251,true, LocalDate.now()));
        productList.add(new Product("Book", 253,true, LocalDate.now()));
        productList.add(new Product("Book", 249,false, LocalDate.of(2023,1,12)));
        productList.add(new Product("Magazine", 255,false, LocalDate.of(2022,2,12)));
        System.out.println(filterByPriceAndCategory(productList,"Book", 250));
//        System.out.println(filterByPriceAndCategory(productList,"Magazine", 260));
//        System.out.println(productList);
        System.out.println(listWithDiscount(productList,"Book",10));
        System.out.println(listOfLastProducts(productList,3));
        System.out.println(groupByCategory(productList));
    }
    public static List<Product> filterByPriceAndCategory(List<Product> inputList, String filterCategory, double inputPrice) throws Exception {
        List<Product> filteredList=inputList.stream()
                .filter(c->c.getCategory().equals(filterCategory))
                .filter(p->p.getPrice()>inputPrice)
                .collect(Collectors.toList());
        if(filteredList.isEmpty())
            throw new Exception("No products with price > "+inputPrice +" or type "+filterCategory+" found");
        else
            return filteredList;
    }

    public static List<Product> listWithDiscount(List<Product> inputList, String filterCategory, double discount){
        List<Product> discountList=inputList.stream()
                .filter(p->p.isDiscountable())
                .filter(c->c.getCategory().equals(filterCategory))
                        .collect(Collectors.toList());
        discountList.forEach(dis-> {
            dis.setPrice(dis.getPrice() * ((100-discount)/100));

        });
        return discountList;
    }

    public static List<Product> listOfLastProducts(List<Product> inputList, int quantityOfProducts){
        return inputList.stream()
                .sorted(Comparator.comparing(Product::getLocalDate).reversed())
                .collect(Collectors.toList()).subList(0,quantityOfProducts);
    }

    public static double sumOfPriceFilteredProducts(List<Product> inputList, String filterCategory,LocalDate startDate, LocalDate endDate, double filterPrice) {
        List<Product> filteredList=inputList.stream()
                .filter(category->category.getCategory().equals(filterCategory))
                .filter(price->price.getPrice()>filterPrice)
                .filter(date->date.getLocalDate().isAfter(startDate))
                .filter(date->date.getLocalDate().isBefore(endDate))
                .collect(Collectors.toList());
        double returningPrice = 0;
        for (Product products: filteredList)
            returningPrice+=products.getPrice();
        return returningPrice;
    }

    public static Map<String, List<Product>> groupByCategory(List<Product> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(Product::getCategory));
    }
}