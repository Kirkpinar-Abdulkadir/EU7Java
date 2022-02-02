package day42_interface;

public interface Electric {

    public static final boolean HAS_BATTERIES = true;
    boolean HAS_BATTERIES2 = false; //public static final (kafadan böyle geliyor)

    public abstract void charge();
    void charge2(); //public abstract (yazmasak da böyle. default degil)

    public default void methodA(){
        //code
    }
    public static void methodB(){
        //code
    }

//interfaces CAN NOT have instance methods. they can only have ABSTRACT, DEFAULT and STATIC methods
}
