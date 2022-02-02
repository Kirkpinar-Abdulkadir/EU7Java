package reviews.week14;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(50,76,200,3,1000,550));

        //let's iterate or traverse the lidt with Iterator object
        Iterator<Integer> it = nums.iterator(); //Polymorphism

        //call hasNext method
        //returns true if there is still a value
        //returns false if it is at the end of the list
        System.out.println(it.hasNext()); //we put a pointer and moves each time, true

        System.out.println("Without loop: " + it.next()); // moves the cursor to next element and
        System.out.println("Without loop: " + it.next()); // moves the cursor to next element and

        while (it.hasNext()){
            System.out.println(it.next());
        }
        //System.out.println(it.next()); //no such element exception--> because it is at the end.
        // if we want to loop through again, create an iterator again

        Iterator<Integer> it2 = nums.iterator();

        //what is the difference between for each loop and iterator.
        //we can remove objects while looping.
        while (it2.hasNext()){ //remove if it is equal or more than hundert.
            if (it2.next()>=100){
                it2.remove();
            }
        }

        System.out.println(nums);

        System.out.println("******************with for each loop******************");

        /*List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(50,76,200,3,1000,550));
        Iterator<Integer> it3 = nums2.iterator();
        int i=0;
        for (int val : nums2) {
            if (val>=100){
                nums2.remove(i);
            }
            i++;
        }
        System.out.println(nums2);
        CAN NOT
                Exception in thread "main" java.util.ConcurrentModificationException
        */

    }
}
