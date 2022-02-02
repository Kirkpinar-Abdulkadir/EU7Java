package day44_oopreview.shapes;

import java.util.ArrayList;
import java.util.List;

import static day44_oopreview.shapes.ShapeManager.*;

public class ShapeActions {
    public static void main(String[] args) {

        //run drawSquare
        drawSquare((Square)buildShape("Square"));
        drawShape(buildShape("shape"));

        System.out.println("-------------------------");

        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diamond());

        drawShape(myList);



    }
}
