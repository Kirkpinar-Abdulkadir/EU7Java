package day40_accessmodifiers_final_hiding;

public class FinalVariables {

    /*• When instance variable is final, we need to initialize it in:
    • same statement
    • constructor
    • init block*/

    public final int ROADSTER_MAX_RANGE = 600; // initialize in the same statement
    public final int MODEL_3_MAXSPEED ;
    public final int MODEL_X_PASSANGERS;
    public static final String ADMIN_USER; //Where this variable will be initialized?

    public FinalVariables() { // initialize in the constructor
        MODEL_3_MAXSPEED = 200;
    }

    { // initialize in the init block.
        //instance block only executes when we create object and before constructor
        MODEL_X_PASSANGERS = 7;
    }

    static { //static block runs once whenever we load class
        ADMIN_USER = "MIKE"; //constant variable
    }


    public static void main(String[] args) {

        final int MAX_PASSENGERS_COUNT = 5;
        final int SSN; //local variable oldugundan initialize hemen gerekli degil
                        //public falan koyamayiz. local variables can not have access-modifiers.
        SSN=66;

        FinalVariables finalVars = new FinalVariables();
        System.out.println(finalVars.ROADSTER_MAX_RANGE);
        System.out.println(finalVars.MODEL_3_MAXSPEED);
        System.out.println(ADMIN_USER);
        System.out.println(FinalVariables.ADMIN_USER);


    }
}
