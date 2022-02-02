package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample { //FIFO
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Mike");
        queue.add("Ozzy");
        queue.add("Jamal");
        queue.add("Asiya");
        System.out.println(queue.toString());
        System.out.println("*********");

        String name = queue.remove(); //Retrieves and removes the head of this queue...FIFO if the queue is empty
                                      //Throws an exception
        System.out.println(name);
        System.out.println(queue.toString());

        System.out.println("*********");
        name = queue.poll(); //Retrieves and removes the head of this queue. if the queue is empty it returns null
        System.out.println(name);
        System.out.println(queue.toString());

        System.out.println("*********");
        //get the element at the front of the queue without removing it using peek()
        name = queue.peek();
        System.out.println(name);
        System.out.println(queue.toString());



    }
}
