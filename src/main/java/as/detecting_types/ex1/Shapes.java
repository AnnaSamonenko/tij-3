package as.detecting_types.ex1;

/**
 * Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
 * Try downcasting to a Circle and see what happens.
 */

class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
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
        Shape shape = new Rhomboid();
        Rhomboid rhomboid = (Rhomboid) shape;
        //! Circle circle = (Rhomboid) shape;
    }
}

