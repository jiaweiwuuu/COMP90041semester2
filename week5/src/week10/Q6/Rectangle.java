package week10.Q6;

/**
 * Rectangle.java
 * <p>
 * <p>
 * Created: Tue Jan 13 19:48:48 2004
 *
 * @author Adrienne Decker
 */

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            } // end of for ()
            System.out.println();
        } // end of for ()

    }

}// Rectangle