package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of questions:");
        int questions = sc.nextInt();

        System.out.println("Enter how many questions did you miss:");
        int missed = sc.nextInt();

        FinalExam scr = new FinalExam(questions,missed);
        System.out.println("Your grade is: " + scr.getGrade());


    }
}
