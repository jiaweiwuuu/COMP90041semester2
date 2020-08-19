package week3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double radius = keyboard.nextDouble();


        System.out.println("Volume : " + 4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
        System.out.println("Surface area: " + 4 * Math.PI * radius * radius);


        //System.out.printf("%.2f",1.23456);
    }
}
