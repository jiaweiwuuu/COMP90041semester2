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

/*
	Class to store the notice message and fine amount

*/
class InfringementNotice{
	
	private String message;
	private double fine;
	
	public InfringementNotice(String message, double fine){
		this.message = message;
		this.fine = fine;
	}
	
	/*
	public double getFine(){
		return this.fine;
	}
	
	public String getMessage(){
		return this.message;
	} 
	*/
	public void printNotice(){
		System.out.println("\n****************************************************");
		System.out.println(this.message + "\n");
		System.out.println("----------------------------------------------------");
		System.out.println("You have a fine of $" + this.fine);
		
		System.out.println("****************************************************");
	}	
}

/*
	Class that implements the functionality required for the lab exercise
*/

class TrafficInfringement{

	private Scanner keyboard = new Scanner(System.in);
	private double speed;
	private boolean drunk;
	private InfringementNotice notice;
	
	public TrafficInfringement(){
		
	}
	
	public static void main(String[] args){
		
		TrafficInfringement infringement = new TrafficInfringement();
		
		infringement.getSpeed();

		infringement.getIntoxicationStatus();
		
		infringement.getInfringmentNotice();
        
		infringement.printInfringmentNotice();

	}
	
	private void printInfringmentNotice(){
		this.notice.printNotice();
	}
	
	private void getSpeed(){		
		System.out.print("Please enter speed: ");		
        this.speed = keyboard.nextDouble();
	}
	
	private void getIntoxicationStatus(){
		System.out.print("Is the driver drunk? ('Y' for drunk, 'N' otherwise): ");
        this.drunk = keyboard.next().charAt(0) == 'Y'?true:false;		
	}
	
	private void getInfringmentNotice(){
		final int SPEED_LIMIT = 60, RANGE1_LOW = 60, RANGE1_HIGH=65, 
				  RANGE2_LOW = 65, RANGE2_HIGH=70, RANGE3_LOW = 70;
		final double FINE_STEP1 = 5.0, FINE_STEP2 = 7.0, FINE_STEP3 = 10.0, FINE_STEP4 = 15.0;
		
		double fine = 0.0;
		String message = "";		
		
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
		
		this.notice = new InfringementNotice(message, fine);			
		
	}
	


}