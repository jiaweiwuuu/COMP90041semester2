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

public class Appointment {
	private int month;
	private int day;
	private int year;

	/* Constructors */

	public Appointment() {
		month = 1;
		day = 1;
		year = 1000;
	}

	public Appointment(int day, int month, int year) {
		// Here, month, day, year are local variables rather than
		// instance variables
		setDate(day, month, year);
	}

	/* Accessors */

	public int getYear( ) {
		return year;
	}

	public int getMonth( ) {
		return month;
	}

	public int getDay( ) {
		return day;
	}

	/* Mutators */

	public void setDate(int day, int month, int year) {
		if (isValidDate(day, month, year)) {
			// Use "this" to differentiate instance variables
			// from local variables
			this.month = month;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setYear(int year) {
		setDate (this.day, this.month, year);
	}

	public void setMonth(int month) {
		setDate (this.day, month, this.year);
	}

	public void setDay(int day) {
		setDate (day, this.month, this.year);
	}

	public String toString( ) {
		return (day + "/" + month + "/" + year);
	}

	// Check if a given date is valid
	private boolean isValidDate(int day, int month, int year) {
		// Validate year (we assume four-digit year)
		if (year < 1000 || year > 9999) {
			return false;
		}

		// Validate month
		if (month < 1 || month > 12) {
			return false;
		}

		// Validate day
		if (day < 1) {
			return false;
		}
		if (month == 1 || month == 3 || month == 5 ||
			month == 7 || month == 8 || month == 10 ||
			month == 12 ) {
			// Months having 31 days
			if (day > 31) {
				return false;
			}
		} else if (month == 4 || month == 6 || month == 9 ||
			month == 11 ) {
			// Months having 30 days
			if (day > 30) {
				return false;
			}
		} else {
			// February
			if (isLeapYear(year)) {
				if (day > 29) {
					return false;
				}
			} else {
				if (day > 28) {
					return false;
				}
			}
		}

		return true;
	}

	// Check if a given year is a leap year
	private boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
