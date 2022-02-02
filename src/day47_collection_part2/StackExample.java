package day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample { //LIFO
    public static void main(String[] args) {

        Stack<Integer> numsStack = new Stack<>();

        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(100);
        numsStack.add(70); //duplicates are allowed and in order
        System.out.println(numsStack.toString());


        //check value on top of Stack
        System.out.println(numsStack.peek());

        //read value on top of stack then remove it
        System.out.println(numsStack.pop()); //removes it
        System.out.println(numsStack.toString());

        System.out.println(numsStack.peek());
        System.out.println(numsStack.get(0)); //all the methods are usable


        //ayni kodun polimorfik yazimi
        //creating object
        //regular way - Class - Class
        //polymorphic way - Parent/Interface - Class
        //who decides what to access? - reference - Vector
        System.out.println("--------------");

        Vector<Integer> numsStack1 = new Stack<>();

        numsStack1.add(50);
        numsStack1.add(70);
        numsStack1.add(100);
        numsStack1.add(70); //duplicates are allowed and in order
        System.out.println(numsStack1.toString());


        //check value on top of Stack
        System.out.println(((Stack<Integer>) numsStack1).peek()); // down casting

        //read value on top of stack then remove it
        System.out.println(((Stack<Integer>) numsStack1).pop()); //removes it //down casting
        System.out.println(numsStack1.toString());

        System.out.println(((Stack<Integer>) numsStack1).peek()); //down casting
        System.out.println(numsStack1.get(0)); //all the methods are usable

    }
}
