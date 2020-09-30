package week9.tutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println("please input two integers");
            try{
                // 1, a

                // 1 a
                int i1 = keyboard.nextInt();

                // a

                int i2 = keyboard.nextInt();

                System.out.println("i1: "+i1 + "  i2: "+i2);

                if(i1 <=0 || i2<= 0){
                    throw new NegativeNumberException();
                }

                flag = true;
            }
            catch (InputMismatchException e){
                System.out.println("you are not input integers");

                // to clean the input buffer;
                keyboard.nextLine();
            }
            catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
