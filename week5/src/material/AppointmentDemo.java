package material;/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturers: Prof. Rui Zhang and Dr. Tilman Dingler
   Semester 1, 2020, Week 5
   Workshop Sample Solution
   Copyright The University of Melbourne 2020
*/

/* This class implements an appointment date type
   Jianzhong Qi, 10 February 2016
*/

import java.util.Scanner;

public class AppointmentDemo {
	public static void main(String[] args) {
		Appointment appointment = new Appointment();
		appointment.setDay(1);
		System.out.println(appointment.getDay());
	}
}
