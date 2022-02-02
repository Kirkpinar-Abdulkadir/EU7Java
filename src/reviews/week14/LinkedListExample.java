package reviews.week14;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10,100,50,500));
        // List<Integer> list = new LinkedList<>(Arrays.asList(10, 100, 50, 500)); ikisi ayni

        System.out.println(((LinkedList<Integer>) list).getFirst());
        //downcasting so I can use methods of LinkedList
        //QUEUE: FIFO first in first out

        System.out.println(((LinkedList<Integer>) list).peek());
        //if this was astack, with the peek() i could get 500.

        ((LinkedList<Integer>) list).addFirst(1);
        System.out.println(((LinkedList<Integer>) list).peek()); //peek() gets the first index

        ((LinkedList<Integer>) list).addLast(10000);
        System.out.println(list);
        System.out.println(((LinkedList<Integer>) list).peek());

        //when you testing, one of the features that you will use is Index.
        // get(indexNumber) : top method you will use

        System.out.println(list.get(0)); // first element
        System.out.println(list.get(list.size()-1)); // last element

        //


    }
}
