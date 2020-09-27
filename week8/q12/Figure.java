package week8.q12;

public abstract class Figure {
    public void erase(){
        for(int i =0; i < 20; i++){
            System.out.println();
        }
    }

    public abstract void draw();


    public static void main(String[] args) {
        Figure[] a = new Figure[2];
        a[0] = new Triangle(5);
        a[1] = new Rectangle(5,3);

        for(Figure f : a){
            f.draw();
        }
    }
}
