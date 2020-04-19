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

public class AppointmentTime {
	private int hour;
	private int minute;
	private int second;

	/* Constructors */

	public AppointmentTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public AppointmentTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}

	/* Accessors */
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	/* Mutators */
	public void setTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}

	public void setHour(int hr) {
		hour = hr;
	}

	public void setMinute(int min) {
		minute = min;
	}

	public void setSecond(int sec) {
		second = sec;
	}

	public String toString( ) {
        return (hour + ":" + minute + ":" + second);
    }
}
