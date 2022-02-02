package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_9 {

    /*n this task, you need to swap the first name with the last name in the email.
    If the email doesn't contain underscore - do not anything.
Sample Output:
     input: mike_tyson@gmail.com
     output: tyson_mike@gmail.com

     input: barakobama@gmail.com
     output: barakobama@gmail.com*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email!");
        String email = sc.next();

        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf("_") + 1, email.indexOf("@")) + "_" +
                    email.substring(0, email.indexOf("_")) + email.substring(email.indexOf("@")));
        }else{
            System.out.println(email);
        }
    }
}
