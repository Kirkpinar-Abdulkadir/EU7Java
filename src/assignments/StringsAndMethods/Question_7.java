package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_7 {

    /*Write a program that will print out the first half of the word twice.
Sample Output:
     input: java
     output: jaja
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word!");
        String word = sc.next();
        for (int i = 0; i < 2; i++) {
            System.out.print(word.substring(0, word.length() / 2));
        }


    }
}
