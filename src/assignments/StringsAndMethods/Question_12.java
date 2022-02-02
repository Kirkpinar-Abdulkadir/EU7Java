package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_12 {
    /*Given a string word, if the first or last chars are 'x' or 'X',
    print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
Sample output:
     input: xHiX
     output: Hi

     input: apple
     output: apple

     input: xUxL
     output: UxL

     input: JavaX
     output: Java
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word!");
        String word = sc.next();

        if(word.charAt(0)=='x' || word.charAt(0)=='X'){
            word=word.substring(1);
        }
        if(word.charAt(word.length()-1)=='x' || word.charAt(word.length()-1)=='X'){
            word=word.substring(0,word.length()-1);
        }
        System.out.println(word);
    }
}
