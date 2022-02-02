package reviews.week14;

import java.util.*;


public class SetExample {
    public static void main(String[] args) {

        //no duplicates, does not care about insertion order, no index, allows null value.
        Set<Integer> listSet = new HashSet<>();
        listSet.addAll(Arrays.asList(100,1,2,8,99,100,null,null));
        System.out.println(listSet);

        //LinkedHashSet: keeps the insertion order, takes null, no duplicate
        Set<Integer> listSet2 = new LinkedHashSet<>();
        listSet2.addAll(Arrays.asList(100,1,2,3,4,5,100,null,null));
        System.out.println(listSet2);

        //TreeSet: does not accept null, sorts the list, no duplicate
        Set<Integer> listSet3 = new TreeSet<>();
        listSet3.addAll(Arrays.asList(100,1,2,3,4,5,100,null,null));
        System.out.println(listSet3);


        //if I want to use Collections.sort() with HashSet, can I use it?

        Set<Integer> listSet4 = new HashSet<>();
        listSet4.addAll(Arrays.asList(100,1,2,8,99,100));
        System.out.println(listSet4);

        Set<Integer> listSet5 = new LinkedHashSet<>();
        listSet5.addAll(Arrays.asList(100,1,2,3,4,5,100,null,null));
        System.out.println(listSet5);

        Set<Integer> listSet6 = new TreeSet<>();
        listSet6.addAll(Arrays.asList(100,1,2,3,4,5,100));
        System.out.println(listSet6);

        //Collections.sort(listSet4); compile error
        //Collections.sort(listSet5); compile error

        // Collections.sort(listSet6); compile error.
        // in order to use sort(), our class has to implement Comparable interface

    }
}
