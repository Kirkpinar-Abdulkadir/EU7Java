package day33_classObject_Constructors;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle(5.4, 3.2); //calling constructor

        Rectangle R2 = new Rectangle(); //when i create the class a default constructor is created without arguments and it can not be seen

        Rectangle R3 = new Rectangle();




        System.out.println(R1.length);
        System.out.println(R1.width);
        R1.getArea();

        /*new keyword invokes the constructor
        Which constructor?
        accepting 2 arguments which are doubles
         */

        /*
        //new call the constructor and create the object
        //initialize object variables

        System.out.println(R1.length); //who gives me default values?
        System.out.println(R1.width);

        R1.length = 5.4;
        R1.width = 3.2;
        R1.getArea();

        Rectangle R2 = new Rectangle();
        R2.length = 2.7;
        R2.width = 12.5;
        R2.getArea();
         */


    }
}
