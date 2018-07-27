package as.detecting_types.task3;

/**
 * Modify Shapes.java so that it can “highlight” (set a flag) in all shapes of a particular type.
 * The toString( ) method for each derived Shape should indicate whether that Shape is “highlighted.”
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

    }
}
