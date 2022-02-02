package day44_oopreview.callcenter;

public interface VoiceCallable {

    boolean CAN_CALL = false; //final static public

    //abstract method
    void call(String contact);

    //static method
    public static void decline(){
        System.out.println("Mike declined voice call...");
    }

    //default method
    public default void accept(){
        System.out.println("Mike finally accept the voice call...");
    }




}
