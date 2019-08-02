package assignment;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data

public class ShapeFeatures extends Shape {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    //interesanta abordarea cu switch-ul, dar el face exact ce ar fi facut polimorfismul pt tine
    public double calcPerimeter(Shape shape) {
        //aici mai aveai nevoie de asta
        String shapeType = shape.getClass().getSimpleName().toLowerCase();

        double perimeter = 0;
        switch (shapeType) {
            case "triangle":
                perimeter = Triangle.side1 + Triangle.side2 + Shape.base;
                System.out.println("Triangle perimeter is " + perimeter);
                break;
            case "square":
                perimeter = Shape.base * 4;
                System.out.println("Square perimeter is " + perimeter);
                break;
            case "rectangle":
                System.out.println("Rectangle perimeter is " + Shape.base * 2 + Shape.height * 2);
                break;
            case "pentagon":
                System.out.println("Pentagon perimeter is " + Shape.base * 5);
                break;
            default:
                System.out.println("Please specify a valid shape!");
        }
    }

    public double calcArea(Shape shape) {
        String shapeType = shape.getClass().getSimpleName().toLowerCase();
        switch (shapeType) {
            case "triangle":
                System.out.println("Triangle area is " + (Shape.base * Shape.height) / 2);
                break;
            case "square":
                System.out.println("Square area is " + Math.pow(Shape.base, 2);
                break;
            case "rectangle":
                System.out.println("Rectangle area is " + Shape.base * 2 + Shape.height * 2);
                break;
            case "pentagon":
                System.out.println("Pentagon perimeter is " + (((Shape.base * 5) * Shape.height) / 2);
                break;
            default:
                System.out.println("Please specify a valid shape!");
        }

    }
}