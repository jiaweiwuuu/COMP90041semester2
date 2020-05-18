package week10.Q5;

/**
 * Figure.java
 *
 *
 * Created: Tue Jan 13 19:41:56 2004
 *
 * @author Adrienne Decker
 * @version
 */

public class Figure 
{
   public Figure ()
   {
      System.out.println("Creating a figure with no parameters.");
   }

   public void erase()
   {
      System.out.println("Call to Figure's erase method.");
   }

   public void draw()
   {
      System.out.println("Call to Figure's draw method.");
   }

   public void center()
   {
      System.out.println("Calling Figure's center method.");
      this.erase();
      this.draw();
   }

}// Figure
