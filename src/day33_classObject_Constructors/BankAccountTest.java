package day33_classObject_Constructors;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("what is your starting balance:");
        input = sc.next();
        BankAccount1 account1 = new BankAccount1(input);

        System.out.println("How much were you paid this month:");
        input = sc.next();
        account1.deposit(input);

        System.out.println("Your pay has been deposited and your current balance is: " + account1.getBalance1());


    }
}
