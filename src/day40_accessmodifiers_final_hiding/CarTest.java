package day40_accessmodifiers_final_hiding;

public class CarTest {
    public static void main(String[] args) {

        Car c = new Car();
        c.model = "M3"; //default
        c.year = 2017; //public
        // c.door = 4; private sadece ayni classda
        c.engine = 5.3; //protected

        System.out.println(c.toString());


    }
}
