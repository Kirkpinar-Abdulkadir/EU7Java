package day48_collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> items2 = new ArrayList<>();
        items2.add(10);
        System.out.println("items2.get(0) = " + items2.get(0));// to get the object

        Map<String,Double> items = new HashMap<>();//(key,value)
        items.put("Apple", 3.49); //collection methodlari mapde yok.  object eklemek icin put() kullaniliyor
        items.put("Flowers",10.99);
        items.put("Eggs",4.99);
        items.put("Milk",6.99);
        items.put("Cherries",5.99);
        items.put("Apple",5.49); //that does not create a new object but updates the apple. Keys are unique.

        System.out.println("items.size() = " + items.size());
        System.out.println(items.toString());
        System.out.println(items.isEmpty());

        System.out.println(items.get("Apple"));
        System.out.println(items.get("Milk"));

        items.remove("Flowers"); //removes object
        System.out.println(items.toString());

        System.out.println("Is apples there  " + items.containsKey("Apple"));
        System.out.println("Is flowers there  " + items.containsKey("Flowers"));

        items.replace("Eggs", 3.99 );
        System.out.println("Price of Eggs: " + items.get("Eggs"));

        items.put("Milk", 2.6);
        System.out.println("Price of Milk: " + items.get("Milk")); //replace ile ayni isi yapiyor.

        //increase price of Cherries by 2 dollars.
        items.replace("Cherries",items.get("Cherries")+2);
        System.out.println("Price of Cherries: " + items.get("Cherries"));


    }
}
