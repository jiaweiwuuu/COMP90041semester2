package week10.Q5;

/**
 * Question5.java
 *
 *
 * Created: Fri Jan 09 20:07:39 2004
 *
 * @author Adrienne Decker
 * @version
 */

public class Question5
{
   public static void main(String[] args)
   {
      Figure f1 = new Figure();
      f1.draw();
      f1.erase();
      f1.center();

      Triangle t1 = new Triangle();
      t1.draw();
      t1.erase();
      t1.center();

      Rectangle r1 = new Rectangle();
      r1.draw();
      r1.erase();
      r1.center();
   }
} // Question5