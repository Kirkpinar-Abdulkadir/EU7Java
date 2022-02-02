package day44_oopreview.shapes;

public class ShapeTest {
    public static void main(String[] args) {

        //create 3 shapes using polymorphism

        Shape diamond = new Diamond();
        Shape square = new Square();
        Object shapeObject = new Shape();

        square.draw();
        diamond.draw();
        ((Square)square).squareMethod();

    }
}
