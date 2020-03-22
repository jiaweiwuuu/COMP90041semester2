/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturers: Prof. Rui Zhang and Dr. Tilman Dingler
   Semester 1, 2020, Week 4
   Workshop Sample Solution
   Copyright The University of Melbourne 2020
*/

import java.util.Scanner;


class TrafficInfringementSimple{

	public static void main(String[] args){
		final int SPEED_LIMIT = 60, RANGE1_LOW = 60, RANGE1_HIGH=65, 
				  RANGE2_LOW = 65, RANGE2_HIGH=70, RANGE3_LOW = 70;
		final double FINE_STEP1 = 5.0, FINE_STEP2 = 7.0, FINE_STEP3 = 10.0, FINE_STEP4 = 15.0;
		
		Scanner keyboard = new Scanner(System.in);

        double speed;
		boolean drunk;
		double fine = 0.0;
        String message = "";
		System.out.print("Please enter speed: ");		
        speed = keyboard.nextDouble();
		
		System.out.print("Is the driver drunk? ('Y' for drunk, 'N' otherwise): ");
        drunk = keyboard.next().charAt(0) == 'Y'?true:false;
		
        if(speed > RANGE1_LOW && speed < RANGE1_HIGH && !drunk)
			message = "Warning";		
		else if (speed > RANGE1_LOW && speed < RANGE1_HIGH && drunk)
			message = "Warning + Take a shower";
		else if (speed > RANGE2_LOW && speed <= RANGE2_HIGH && !drunk){
			message = "$" + FINE_STEP1 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
			fine = (speed - SPEED_LIMIT) * FINE_STEP1;		
		}
		else if (speed > RANGE2_LOW && speed <= RANGE2_HIGH && drunk){
			message = "$" + FINE_STEP2 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
			fine = (speed - SPEED_LIMIT) * FINE_STEP2;		
		}
		else if (speed > RANGE3_LOW && !drunk){
			message = "$" + FINE_STEP3 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
			fine = (speed - SPEED_LIMIT) * FINE_STEP3;		
		}
		else if (speed > RANGE3_LOW && drunk){
			message = "$" + FINE_STEP4 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr" + 
					  "\n\nSpend the day/night in cell until become sober.";
			fine = (speed - SPEED_LIMIT) * FINE_STEP4;		
		}
		else
			message = "All good!";
		
		System.out.println("\n****************************************************");
		System.out.println(message + "\n");
		System.out.println("----------------------------------------------------");
		System.out.println("You have a fine of $" + fine);
		
		System.out.println("****************************************************");

	}

}