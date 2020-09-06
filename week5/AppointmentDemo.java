package week5;

public class AppointmentDemo {
	public static void main(String[] args) {
		Appointment appointment = new Appointment();
		
		System.out.println("After default constructor: " + appointment);
		
		appointment.setDate(9, 4, 2014);
		appointment.setStartTime(16, 0, 0);
		appointment.setEndTime(17, 0, 0);
		
		System.out.println("After calling mutators: " + appointment);
	}	
}
