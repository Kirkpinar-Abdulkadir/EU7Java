package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_11 {
    /*We have a message variable already declared and assigned value in this format
    Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

    Declare variables: sender, phoneNumber, messageBody
    By using String methods: retrieve related information from SMS message string
    and assign it to those 3 variables and print each variable in a separate line
    Sample Output:

    Sender: Mike Smith
    Phone Number: 202-123-3456
    Message body: I love programming and problem solving*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        System.out.println("Sender: " + msg.substring(msg.indexOf("<") + 1, msg.indexOf(">")));
        System.out.println("Phone Number: " + msg.substring(msg.indexOf("[") + 1, msg.indexOf("]")));
        System.out.println("Message body: " + msg.substring(msg.indexOf("{") + 1, msg.indexOf("}")));

    }
}
