package assignments.StringsAndMethods;

import java.util.Locale;
import java.util.Scanner;

public class Question_1 {
    /*Create a method called tipCalculator which accepts parameters:  boolean isSplit,
    int numberPeople, double checkAmount,String serviceQuality
    Ask the user to enter each value.
    User should select service quality that will correspond to tip percent.
    Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
    The program should display the following information based on the user input:
    Split or No split
    Number of people entered: &&&&
    Service Quality:
    Total to pay:
    Total tip:
    Total per person:
    Tip per person:
    Input:
    Split:Yes
    Number of people:4
    Check amount:476.0
    Service Quality:Excellent
    Output:
    Number of people entered: &&&&
    Total to pay: 595.0
    Total tip: 119.0
    Total per person: 148.75
    Tip per person: 29.75*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Split (y/n)?");
        String split = sc.next();
        boolean isSplit = true;
        if(split.equalsIgnoreCase("n")){isSplit = false;}
        System.out.println("Number of People?");
        int numberPeople = sc.nextInt();
        System.out.println("Check amount?");
        double checkAmount = sc.nextDouble();
        System.out.println("Service quality?(Poor,Fair,Good,Great,Excellent)");
        String serviceQuality = sc.next();

        tipCalculator(isSplit,numberPeople,checkAmount,serviceQuality);
    }
    public static void tipCalculator(boolean isSplit, int numberPeople,double checkAmount, String serviceQuality){
        System.out.println("Number of people entered: " + numberPeople);

        double totalTip = 0;
        switch (serviceQuality.toLowerCase()){
            case "poor":
                totalTip = checkAmount*0.05;
                break;
            case "fair":
                totalTip = checkAmount*0.10;
                break;
            case "good":
                totalTip = checkAmount*0.15;
                break;
            case "great":
                totalTip = checkAmount*0.20;
                break;
            case "excellent":
                totalTip = checkAmount*0.25;
                break;
        }
        System.out.println("Total to pay: $" + (checkAmount+totalTip));
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total per person: $" + (totalTip + checkAmount) / numberPeople);
        System.out.println("Tip per person: $" + totalTip / numberPeople);

    }

}
