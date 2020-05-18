package week10.Q5;

/**
 * Rectangle.java
 *
 *
 * Created: Tue Jan 13 19:48:48 2004
 *
 * @author Adrienne Decker
 * @version
 */

public class Rectangle extends Figure
{
   private int width;
   private int height;

   public Rectangle ()
   {
      System.out.println("Creating Rectangle Class with no parameters.");
      this.width = 0;
      this.height = 0;
   }

   public Rectangle(Rectangle other)
   {
      System.out.println("Creating Rectangle Class from another " 
			 + "Rectangle.");
      this.width = other.width;
      this.height = other.height;
   }

   public Rectangle(int width, int height)
   {
      System.out.println("Creating Rectangle Class given width and " +
			 "height.");
      this.width = width;
      this.height = height;
   }

   public void draw()
   {
      System.out.println("Calling Rectangle's draw method.");
   }

   public void erase()
   {
      System.out.println("Calling Rectangle's erase method.");
   }

}// Rectangle