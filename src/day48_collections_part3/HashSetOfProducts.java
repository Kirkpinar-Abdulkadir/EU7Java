package day48_collections_part3;

import day42_interface.SelfDriving;
import day46_collection_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {
    public static void main(String[] args) {

        //create set of collection and add new products.

        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book",20.99));
        prodSet.add(new Product("book",17.99));
        prodSet.add(new Product("magazine",7.99));

        //print each product by using for each loop
        for (Product product : prodSet) {
            System.out.println("product price = " + product.getPrice()); //getter for product object
        }

        //print each product by using for each method
        prodSet.forEach(product -> System.out.println(product.getName()));

    }
}
