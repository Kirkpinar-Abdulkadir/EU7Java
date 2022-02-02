package day40_accessmodifiers_final_hiding;

public class TestParentChild {
    public static void main(String[] args) {

        Child s = new Child();
        System.out.println("Value of x before increment " + s.x);

        s.increment();
        System.out.println("Value of x after increment " + s.x);

        Parent p = new Parent();
        System.out.println("Value of x before increment " + p.x);

        p.increment();
        System.out.println("Value of x after increment " + p.x);

        /*Hiding Variables
        • Variable hiding happens when we define a variable with the same name as a variable in a parent class.
        • This creates 2 copies of the variable within an instance of the child class: one instance defined for
        the parent reference and another defined for the child reference.
        • If you are referencing the variable from within the parent class, the variable defined in the parent class is used.
        • If you are referencing the variable from within the child class, the variable defined in the child class is used.
        */




    }
}
