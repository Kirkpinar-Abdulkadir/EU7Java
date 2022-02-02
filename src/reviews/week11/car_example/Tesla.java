package reviews.week11.car_example;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year) {
        super(model,color, year);
        super.make = "Tesla";
    }


    public void start() {

        System.out.println("Say start");

    }
}
