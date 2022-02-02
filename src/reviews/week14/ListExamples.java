package reviews.week14;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>(); //polymorphism
        listOne.add("oscar");

        List<String> listTwo = new Stack<>();
        listTwo.add("oscar");
        listTwo.add("enes");
        listTwo.add("zehra");
        listTwo.add("melek");

        //list can have multiple null values, keeps the insertion order has index.
        listTwo.add(null);
        //listTwo.add(null);

        System.out.println("listTwo"+listTwo);
        //stack: last in first out structure LIFO
        //peek(): takes a look at the last value.
        System.out.println(((Stack<String>) listTwo).peek()); // i need to downcast to use peek()

        System.out.println(listOne instanceof List); //true
        System.out.println("Listone before putting info in it" + listOne);
        listOne = listTwo; //possible. assigning listTwo to listOne.
        System.out.println("listOne"+listOne);

        //iteration with Stack.

        //Can I sort the list with Collections.sort() method?
        // i can not sort it if it has null values.
        if(!listTwo.contains(null)) {
            Collections.sort(listTwo);
        }
        System.out.println(listTwo);


    }
}
