package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {
    public static void main(String[] args) {

        Car c = new Car();
        //c.model = "M3"; //default can not be reached from different package
        c.year = 2017; //public can be reached from different package
        // c.door = 4; private sadece ayni classda
        //c.engine = 5.3; //protected can not be reached from different package. inheritance ile ulasilabilir.

        c.hashCode();



    }
}
