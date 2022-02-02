package day44_oopreview.shapes;

import java.util.List;

public class ShapeManager {

    /*public static Shape buildShape(String type){
        Shape shape = new Shape();
        type.toLowerCase();
        switch(type) {
            case "square":
                ((Square)shape).draw();
                break;
            case "diamond":
                ((Diamond)shape).draw();
                break;
            case "shape":
                shape.draw();
                break;
        }
        return shape;
    }*/

    public static Shape buildShape(String type){
        Shape shape = null;

        switch(type.toLowerCase()) {
            case "square":
                shape = new Square();
                break;
            case "diamond":
                shape = new Diamond();
                break;
            case "shape":
                shape = new Shape();
                break;
        }
        return shape;
    }

    public static void drawSquare(Square squareObject){
        squareObject.draw();
    }
    public static void drawShape(Shape shapeObject){
        shapeObject.draw();
    }
    public static void drawShape(List<Shape> shapeList){
        //i want to run each draw method
        for (Shape each : shapeList) {
            each.draw();
        }
    }


}
