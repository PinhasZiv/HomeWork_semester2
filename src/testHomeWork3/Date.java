package lab3;

public class Date {
	// declaring variables
	private int day;
	private int month;
	private int year;

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
		// checking the bounds of set month
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

		return String.format("%02d/%02d/%02d/%s", day, month, year, strMonth(month));
	}

	// Gets an integer and converts it into a verbal form by switch case format
	public String strMonth(int month) {

		switch (month) {

		case 1:
			return "January";

		case 2:
			return "February";

		case 3:
			return "March";

		case 4:
			return "April";

		case 5:
			return "May";

		case 6:
			return "June";

		case 7:
			return "July";

		case 8:
			return "August";

		case 9:
			return "September";

		case 10:
			return "October";

		case 11:
			return "Novemver";

		case 12:
			return "December";

		}
		return "";
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
