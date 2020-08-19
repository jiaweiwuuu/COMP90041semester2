package week3;

import java.util.Scanner;

public class Additional2 {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final double EPSILON = 0.000001;
        // variables to store the change and amount left to be paid.
        double change, remainder;

        // keep track of notes
        int fifties, twenties, tens, fives, twos, ones;

        // keep track of coins
        int fifty_cents, twenty_cents, ten_cents, five_cents;

        System.out.print("Please enter the change (without $): ");
        change = keyboard.nextDouble();

        // to tackle any rounding off errors
        // change = change + EPOSILON

        change += EPSILON;


        // 100.0 / 50  =  2.0  ->   1.9999999999
        // 100.0/ 50 = 2.0 -> 2.0000000001
        //
        // 1.99999999 -> int -> 1;



        // 100.0000000001 / 50  =  2.0000000001 -> 2;


        // 123
        // fifties = 2, ramainder = 23


        fifties = (int)(change / 50);
        remainder = change % 50;

        twenties = (int)(remainder / 20);
        remainder = remainder % 20;

        tens = (int)(remainder / 10);
        remainder = remainder % 10;

        fives = (int)(remainder / 5);
        remainder = remainder % 5;

        twos = (int)(remainder / 2);
        remainder = remainder % 2;

        ones = (int)(remainder / 1);
        remainder = remainder % 1;

        fifty_cents = (int)(remainder / 0.5);
        remainder = remainder % 0.5;

        twenty_cents = (int)(remainder / 0.2);
        remainder = remainder % 0.2;

        ten_cents = (int)(remainder / 0.10);
        remainder = remainder % 0.10;

        five_cents = (int)(remainder / 0.05);
        remainder = remainder % 0.05;

        System.out.println("Please give the customer: ");
        System.out.println("$50 " + fifties);
        System.out.println("$20 " + twenties);
        System.out.println("$10 " + tens);
        System.out.println("$5 " + fives);
        System.out.println("$2 " + twos);
        System.out.println("$1 " + ones);
        System.out.println("50c " + fifty_cents);
        System.out.println("20c " + twenty_cents);
        System.out.println("10c " + ten_cents);
        System.out.println("5c " + five_cents);
    }
}
