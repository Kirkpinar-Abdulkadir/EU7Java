package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingAList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("C++");

        System.out.println("Before sorting");
        System.out.println(list.toString());

        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list.toString());

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("spoon",13.99));
        prodList.add(new Product("bag",100.00));
        prodList.add(new Product("shoes",59.99));
        prodList.add(new Product("computer",2199.00));

        System.out.println(prodList.toString());

        //must use comparable interface to sort (in product class)
        Collections.sort(prodList);

        System.out.println("After sorting");
        System.out.println(prodList.toString());

        Product p1 = new Product("spoon",25.40);
        Product p2 = new Product("chair",19.00);
        System.out.println(p1.compareTo(p2));


    }
}
