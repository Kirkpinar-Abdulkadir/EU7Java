package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_10 {

    /*Write a program that will print out information about the user based on email.
    Print first and last name from the upper case.
Sample Output:
     Input: craig_federighi@apple.com
    Output:
           First name: Craig
           Last name: Federighi
           Domain: apple
           Top-Level Domain: com*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email!");
        String email = sc.next();

        String name = email.substring(0,email.indexOf("_"));
        System.out.println("First name:" + name.substring(0,1).toUpperCase()+name.substring(1));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println("Last name:" + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain:" + email.substring(email.indexOf("@")+1,email.indexOf(".")));

    }
}
