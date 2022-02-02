package day47_collection_part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(50);
        nums.add(543);
        nums.add(1150);
        nums.add(550);
        nums.add(570);
        nums.add(93);
        nums.add(5000);
        nums.add(950);

        //looping using for each loop
        for (Integer n : nums) {
            System.out.print(n + " | ");
        }

        System.out.println();

        //looping using for iterator loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " | ");
        }

        System.out.println();

        // looping using for each method. Lambda expression.
        nums.forEach(n -> System.out.print(n + " | ")); // -> isareti lambda expression.

        System.out.println();

        nums.removeIf(n -> n<100); //parantezin icine action yaziliyor. burda birer birer elemanlari kontrol edip
                                    // 100 den kücük olanlari kaldiriyor.
        nums.forEach(n -> System.out.print(n + " | "));



    }
}
