package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_15 {

    /*Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Sample Output:
     input: catdog
     output: true

     input: catcat
     output: false

     input: cat-cheetah-dog-cat
     output: false*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int countOfDogs=0;
        int countOfCats=0;

        for (int i = 0; i < word.length()-2; i++) {
            if(word.substring(i,i+3).equals("cat")){
                countOfCats++;
            }
            if(word.substring(i,i+3).equals("dog")){
                countOfDogs++;
            }
        }
        if (countOfCats==countOfDogs){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
