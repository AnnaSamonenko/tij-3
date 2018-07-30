package as.detecting_types.ex12;

import java.util.ArrayList;

/**
 * Implement the rotate(Shape) method described in this
 * chapter, such that it checks to see if it is rotating a Circle (and, if so, doesn’t perform the operation).
 */

class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    void rotate() {
        if (this instanceof Circle)
            return;
        System.out.println(this + " rotated");
    }
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        for (Shape shape : shapes)
            shape.rotate();
    }
}

