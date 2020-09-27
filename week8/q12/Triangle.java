package week8.q12;

public class Triangle extends Figure{
    private int height;
    public Triangle(int height){
        this.height = height;
    }

    public void draw(){
        for(int i =0; i < height; i++){
            for(int j =0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
