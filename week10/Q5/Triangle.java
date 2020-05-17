package week10.Q5;

/**
 * Triangle.java
 * <p>
 * <p>
 * Created: Tue Jan 13 19:44:15 2004
 *
 * @author Adrienne Decker
 */

public class Triangle extends Figure {

    private int height;

    public Triangle() {
        System.out.println("Creating Triangle Class with no parameters.");

        this.height = 0;
    }

    public Triangle(Triangle other) {
        System.out.println("Creating Triangle Class from another Triangle.");
        this.height = other.height;
    }

    public Triangle(int height) {
        System.out.println("Creating Triangle Class given base and height.");
        this.height = height;
    }

    public void draw() {
        System.out.println("Calling Triangle's draw method.");
    }

    public void erase() {
        System.out.println("Calling Triangle's erase method.");
    }

}// Triangle