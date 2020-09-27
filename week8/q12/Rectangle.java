package week8.q12;

public class Rectangle extends Figure{
    private int height;
    private int width;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
