package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_5 {

    /*You have 2 words, both of them have 3 characters. If either of them does not have exactly 3 characters,
     print "cannot merge" Merge their characters one by one and print together like below:

Sample Output:

     aok
     lol
     alookl

     ear
     pie
    epaire

    java
    wow
    cannot merge*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if(word1.length()!=3 || word2.length()!=3){
            System.out.println("Can not merge");
        }else{
            String word3="";
            for (int i = 0; i < 3; i++) {
                word3 = word3+word1.charAt(i)+word2.charAt(i);
            }
            System.out.println(word3);
        }


    }
}
