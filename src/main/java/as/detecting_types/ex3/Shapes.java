package as.detecting_types.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Modify Shapes.java so that it can “highlight” (set a flag) in all shapes of a particular type.
 * The toString( ) method for each derived Shape should indicate whether that Shape is “highlighted.”
 */

class Shape {
    protected boolean highlight = false;

    Shape(boolean highlight) {
        this.highlight = highlight;
    }

    void draw() {
        System.out.println(this + ".draw()");
    }
}

class Rhomboid extends Shape {

    public Rhomboid(boolean highlight) {
        super(highlight);
    }

    public String toString() {
        if (highlight)
            return "Rhomboid(highlighted)";
        return "Rhomboid";
    }
}

class Circle extends Shape {

    public Circle(boolean highlight) {
        super(highlight);
    }

    public String toString() {
        if (highlight)
            return "Circle(highlighted)";
        return "Circle";
    }
}

class Square extends Shape {

    public Square(boolean highlight) {
        super(highlight);
    }

    public String toString() {
        if (highlight)
            return "Square(highlighted)";
        return "Square";
    }
}

class Triangle extends Shape {

    Triangle(boolean highlight) {
        super(highlight);
    }

    public String toString() {
        if (highlight)
            return "Triangle(highlighted)";
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(true));
        shapes.add(new Circle(false));
        shapes.add(new Square(true));

        for (Shape shape : shapes)
            System.out.println(shape);

    }
}
