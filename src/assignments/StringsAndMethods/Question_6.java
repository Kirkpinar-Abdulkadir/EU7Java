package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_6 {

    /*Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
    If the word is shorter, display message: "Too short!". If the word is longer, display the message: "Too long!".
    Otherwise, reverse this word and print out the result into the console.
Sample Output:
     input: cat
     output: Too short!

     input: singularity
     output: Too long!

     input: apple
     output: elppa*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word!");
        String word = sc.next();

        if(word.length()==5){
            String reverse = "";
            for (int i = 4; i >=0; i--) {
                reverse = reverse+word.charAt(i);
            }
            System.out.println(reverse);
        }else if(word.length()<5){
            System.out.println("Too short!");
        }else {
            System.out.println("Too long!");
        }

    }
}
