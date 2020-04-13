package testHomeWork3;

public class Date {

	// declaring variables
	private int day;
	private int month;
	private int year;
	private final int[] months = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// c-default
	public Date() {

		this.day = 1;
		this.month = 1;
		this.year = 1800;
	}

	// c-parameters
	public Date(int day, int month, int year) {

		setDay(day);
		setMonth(month);
		setYear(year);
	}

	// c-copy
	public Date(Date other) {

		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	// generate getters and setters
	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public void setDay(int day) {
		// checking the bounds of set day
		if (day < 1 || day > 31) {
			System.out.println("Invalid Day Value");
			this.day = 1;
		} else
			this.day = day;
	}

	public void setMonth(int month) {
		// checking the bounds of set month and check the last day on this month bound
		if(months[month-1] < day) {
			System.out.println("Invalid day in month");
			this.day = 1;
		}
		
		if (month < 1 || month > 12) {
			System.out.println("Invalid Month Value");
			month = 1;
		}
		this.month = month;
	}

	public void setYear(int year) {
		// checking the bounds of set year
		if (year < 1800 || year > 2020) {
			System.out.println("Invalid Year Value");
			year = 1800;
		}
		this.year = year;
	}

	public String toString() {

		// using string format for showing two digits (xx/yy/zzzz)
		printMonth(month);
		return String.format("%02d/%02d/%02d", day, month, year);
	}

	// Gets an integer and converts it into a verbal form by switch case format
	public void printMonth(int month) {

		switch (month) {

		case 1:
			System.out.println("The month is: Yanuary");
			break;
		case 2:
			System.out.println("The month is: February");
			break;
		case 3:
			System.out.println("The month is: March");
			break;
		case 4:
			System.out.println("The month is: April");
			break;
		case 5:
			System.out.println("The month is: May");
			break;

		case 6:
			System.out.println("The month is: June");
			break;

		case 7:
			System.out.println("The month is: July");
			break;

		case 8:
			System.out.println("The month is: August");
			break;

		case 9:
			System.out.println("The month is: Semptember");
			break;

		case 10:
			System.out.println("The month is: October");
			break;

		case 11:
			System.out.println("The month is: November");
			break;

		case 12:
			System.out.println("The month is: December");
			break;

		}

	}

	public boolean isLeapYear(int year) {

		int leapCheck = 0;

		leapCheck = year % 19;

		boolean isLeap = false;

		if (leapCheck == 3 || leapCheck == 6 || leapCheck == 8 || leapCheck == 11 || leapCheck == 14 || leapCheck == 17
				|| leapCheck == 0) {
			isLeap = true;
		}
		return isLeap;
	}
}
