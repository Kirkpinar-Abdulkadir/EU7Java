package day40_accessmodifiers_final_hiding_2;


import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car {

    public  Car2(){
        //model = "M3"; default
        year = 2017; //public
        //door = 4; private
        engine = 5.3; //protected (inherited)

    }

}
