package day36_staticClassMembers;

public class StaticMethods {

    static  String name = "Apple";
    int age=10;


    public static void show1(){
        //show2(); //u can not call instance method/variable from static method
        //System.out.println(age);
        show4(); //u can call static method from static method
        System.out.println(name);
    }
    public void show2() {
        show1(); //u can call static from instance method
        System.out.println(name);
        System.out.println(age);
    }
    public void show3() {
        show2();
        show1();
    }
    public static void show4(){

    }
}
