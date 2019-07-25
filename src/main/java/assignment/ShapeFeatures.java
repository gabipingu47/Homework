package assignment;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class ShapeFeatures extends Shape {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double calcPerimeter(Shape shape) {
        switch (Shape shape) {
            case "triangle":
                System.out.println("Triangle perimeter is " + Triangle.side1 + Triangle.side2 + Shape.base);
                break;
            case "square":
                System.out.println("Square perimeter is " + Shape.base*4);
                break;
            case "rectangle":
                System.out.println("Rectangle perimeter is " + Shape.base*2 + Shape.height*2);
                break;
            case "pentagon":
                System.out.println("Pentagon perimeter is " + Shape.base*5);
                break;
            default:
            System.out.println("Please specify a valid shape!");
    }

    public double calcArea (Shape shape) {
            case "triangle":
                System.out.println("Triangle area is " + (Shape.base*Shape.height)/2);
                break;
            case "square":
                System.out.println("Square area is " + Math.pow(Shape.base, 2);
                break;
            case "rectangle":
                System.out.println("Rectangle area is " + Shape.base*2 + Shape.height*2);
                break;
            case "pentagon":
                System.out.println("Pentagon perimeter is " + (((Shape.base*5)*Shape.height)/2);
                break;
            default:
                System.out.println("Please specify a valid shape!");
        }

}
