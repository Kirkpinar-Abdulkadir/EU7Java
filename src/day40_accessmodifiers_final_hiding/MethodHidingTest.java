package day40_accessmodifiers_final_hiding;

public class MethodHidingTest {
    public static void main(String[] args) {

    }
}

class Bear{

    public static void eat(){
        System.out.println("Bear is eating");
    }
    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }
    public void hibernate(){
        System.out.println("Bear is hibernating");
    }
}

class Panda extends Bear{

    //Hiding
    public static void eat(){
        System.out.println("Panda is eating");
    }

    /*public void sneeze(){
        System.out.println("Panda is sneezing");
    }
    The method defined in the child class must be marked as static if it is marked as static in the
    parent class (method hiding). Likewise, the method must not be marked as static in the child class
    if it is not marked as static in the parent class (method overriding)
    */

    @Override
    public void hibernate(){
        System.out.println("Panda is hibernating");
    }

}
