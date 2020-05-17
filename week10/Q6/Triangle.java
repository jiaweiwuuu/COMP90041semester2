package week10.Q6;

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
        height = 0;
    }

    public Triangle(Triangle other) {
        super(other);
        this.height = other.height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            } // end of for ()
            System.out.println();
        } // end of for ()
    }

    public void erase() {
        super.erase();
    }

}// Triangle