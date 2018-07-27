package as.detecting_types.ex2;

/**
 * Modify Exercise 1 so that it uses instanceof to check the type before performing the downcast.
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
        Rhomboid rhomboid;
        if (shape instanceof Rhomboid)
            rhomboid = (Rhomboid) shape;
        //! Circle circle = (Rhomboid) shape;
    }
}
