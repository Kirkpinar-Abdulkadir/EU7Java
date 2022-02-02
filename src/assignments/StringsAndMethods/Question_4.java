package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_4 {

    /*You have a word, do the following:
        If the word has odd number of characters and has 5 or more characters,
        print the middle three characters of the word. Otherwise, print "invalid".
   Sample Output:
       fifteen ==> fte
       apple ==> ppl
       hey ==> invalid
       java ==> invalid
      whatsup ==> ats
      $ ==> invalid*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if(word.length()%2==1 && word.length()>=5){
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
        }else{
            System.out.println("Invalid");
        }

    }
}
