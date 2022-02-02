package assignments.StringsAndMethods;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {

        double premium = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        int age = 0;
        int driveExp = 0;
        int accidentsAmount = 0;
        String continuousInsurance = "";
        String education = "";
        String referenceNumber = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Do you have US driver license?");
        String licence = sc.nextLine();
        if(licence.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }


        System.out.println("Enter your zip code");
        int zipCode = sc.nextInt();
        sc.nextLine();
        if(zipCode==20910 || zipCode==20740){
            premium = premium+60;
        }else if(zipCode==22102 || zipCode==22103){
            premium = premium+30;
        }else{
            premium = premium+50;
        }


        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String vehicleOwnership = sc.nextLine();
        if (vehicleOwnership.equalsIgnoreCase("owned")){
            premium = premium+10;
        }else{
            premium = premium+20;
        }


        System.out.println("How is this vehicle primarily used?");
        String vehicleUsage = sc.nextLine();
        if(vehicleOwnership.equalsIgnoreCase("business")){
            premium = premium+50;
        }else if(vehicleOwnership.equalsIgnoreCase("pleasure")){
            premium = premium+10;
        }else if(vehicleOwnership.equalsIgnoreCase("commute")){
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = sc.nextInt();
            sc.nextLine();
            premium = premium + daysDrivenToWorkOrSchool*5;
        }

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = sc.nextInt();
        sc.nextLine();
        premium = premium + milesToWorkOrSchool;


        System.out.println("How old are you?");
        age = sc.nextInt();
        sc.nextLine();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16 && age<18){
            premium = premium * 20;
        }else if(age>=18 && age<21){
            premium = premium * 6;
        }else if(age>=21 && age<25){
            premium = premium * 2;
        }


        System.out.println("How many years you've been driving?");
        driveExp = sc.nextInt();
        sc.nextLine();
        if(driveExp<0 || (age-driveExp)<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium = premium-driveExp*5;
        }


        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = sc.nextLine();
        if(accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = sc.nextInt();
            sc.nextLine();
           premium = premium + (premium*0.2)*accidentsAmount;
        }


        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = sc.nextLine();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium = premium*2;
        }


        System.out.println("What is the highest level of education you have completed?");
        education = sc.nextLine();
        if(education.equalsIgnoreCase("Phd")||education.equalsIgnoreCase("Bachelors")||
                education.equalsIgnoreCase("Masters")){
            premium = premium*0.05;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium = premium*0.1;
        }else if(education.equalsIgnoreCase("less tha high school")){
            premium = premium*0.05;
        }


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        referenceNumber = name.substring(0,2)+age+name.substring(name.length()-2)+zipCode+education.replace(" ","");
        System.out.println(referenceNumber.toUpperCase());




    }
}
