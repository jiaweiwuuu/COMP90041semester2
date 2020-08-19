package week3;

import java.util.Scanner;

public class Additional1 {
    private static final double PRICE_CANDYBARS = 10.0;
    private static final double PRICE_GUMBALLS = 3.0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numCoupons = 0;
        int numCandybars = 0;
        int numGumballs = 0;
        int remainderCoupons = 0;

        System.out.print("How many coupons do you have: ");
        numCoupons = keyboard.nextInt();

        numCandybars = (int)(numCoupons / PRICE_CANDYBARS);
        remainderCoupons = (int) (numCoupons % PRICE_CANDYBARS);
        numGumballs = (int)(remainderCoupons / PRICE_GUMBALLS);
        remainderCoupons = (int) (remainderCoupons % PRICE_GUMBALLS);


        System.out.println("With " + numCoupons + " coupon(s) " +
                " you can get " + numCandybars + " candy bar(s) and " + numGumballs + " gumball(s).");

        System.out.println("This will leave you with " + remainderCoupons + " coupon(s).");
    }
}
