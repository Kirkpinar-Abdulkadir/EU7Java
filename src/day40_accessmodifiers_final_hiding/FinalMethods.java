package day40_accessmodifiers_final_hiding;

public class FinalMethods {

    public final void method1(){
        System.out.println("Method-1");
    }
    public static final void staticMethod(String word){
        System.out.println("Static Method");
    }

}
class Sub extends FinalMethods{

    //inherited olan final oldugundan can not be overridden
    /*@Override
    public void method1(){
        System.out.println("Method-1 in sub class");
    }*/

    /*public static void staticMethod(String w){
        System.out.println("Static Method in sub class");
    }*/






}