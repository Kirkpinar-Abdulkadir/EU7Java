package day36_staticClassMembers;

public class CalculatorTest {
    public static void main(String[] args) {

        double result = Calculator.plus(55,7);
        System.out.println("Result = " + result);

        Calculator c = new Calculator();
        System.out.println("Result = " + c.plus(55,7));

        int i = Integer.parseInt("33");
        System.out.println(Character.isDigit('5'));

        //1
        CalculatorTest.mA();
        //2
        CalculatorTest ct = new CalculatorTest();
        ct.mA();
        //3
        mA();


    }

    public static void mA() {
        System.out.println("Hello");
    }
}
