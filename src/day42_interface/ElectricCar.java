package day42_interface;

public abstract class ElectricCar {

    private String model;
    private double price;
    private String color;

    public ElectricCar(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public abstract void start(); //WHAT tod do instead how to do
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car stops by pushing the brake.");
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
