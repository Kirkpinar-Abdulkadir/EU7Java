package day45_exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {

        String str = "Selenium";

        try {
            System.out.println(str.length());
            System.out.println(str.charAt(100));

        }catch (Exception e){
            System.out.println("Enter correct index");
            // return;  if we stop the main method, finally runs anyway but the rest will not run.
        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Bye..");

        System.out.println("------------------");

        try {
            System.out.println(str.length());
            System.out.println(str.charAt(2));

        }catch (Exception e){
            System.out.println("Enter correct index");
        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Bye..");
    }
}
