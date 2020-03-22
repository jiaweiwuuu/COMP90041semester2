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


class Temperatures{

	public static void main(String[] args){			
		Scanner keyboard = new Scanner(System.in);

        // variables to store temperatures
		int day1, day2, day3, day4, day5;
        
		// read temperatures for each day`
		System.out.println("Please enter temperature for Monday: ");		
        day1 = keyboard.nextInt();
		
		System.out.println("Please enter temperature for Tuesday: ");		
        day2 = keyboard.nextInt();
		
		System.out.println("Please enter temperature for Wednesday: ");		
        day3 = keyboard.nextInt();
		
		System.out.println("Please enter temperature for Thursday: ");		
        day4 = keyboard.nextInt();
		
		System.out.println("Please enter temperature for Friday: ");		
        day5 = keyboard.nextInt();
		
		// print a histogram showing the daily emperatures
		System.out.println("\nHistogram of Temperatures");
		System.out.println("--------------------------");
		
		System.out.print("Monday\t\t| ");
		printStars(day1);
		
		System.out.print("Tuesday\t\t| ");
		printStars(day2);
		
		System.out.print("Wednesday\t| ");
		printStars(day3);
		
		System.out.print("Thursday\t| ");
		printStars(day4);
		
		System.out.print("Friday\t\t| ");
		printStars(day5);	
		
	}
	
	private static void printStars(int numStars){
		for(int i = 0; i < numStars; i++)
			System.out.print("*");
		System.out.println();
	}

   

}
