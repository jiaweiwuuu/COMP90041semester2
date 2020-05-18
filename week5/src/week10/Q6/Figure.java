package week10.Q6;

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
   }

   public Figure(Figure figure)
   {
   }

   public void erase()
   {
      for ( int i = 0; i < 15; i++) {
		System.out.println();
      } // end of for ()
   }

   public void draw()
   {
   }

   public void center()
   {
      this.erase();
      this.draw();
   }

}// Figure