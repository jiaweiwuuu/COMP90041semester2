package week3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String hoursStr = args[0];
        //int hours = Integer.parseInt(hoursStr);
        double hours = Double.parseDouble(hoursStr);

        double wages;

        if(hours <= 40){
            wages = hours * 8.25;
        }
        else{
            wages = 40 * 8.25 + (hours-40)*8.25*1.5;
        }

        System.out.println(wages);
    }
}
