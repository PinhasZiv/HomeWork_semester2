package homeWork3;

public class Date {

	private int day; // 1-31. based on the month.
	private int month; // 1-12
	private int year; // 1800-2020

	/*
	 * Default Constructor Date(1, 1, 1800).
	 */
	public Date() {
		this(1, 1, 1800);
	}

	/*
	 * Variables constructor Date(day, month, year).
	 */
	public Date(int day, int month, int year) {
		this.month = validMonth(month);
		this.year = validYear(year);
		this.day = validDay(day);
	}

	/*
	 * Copying constructor Date(date).
	 */
	public Date(Date other) {
		this(other.day, other.month, other.year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = validDay(day);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = validMonth(month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = validYear(year);
	}

	/*
	 * Check if the month value is valid (1-12). if not - set to default ('1').
	 */
	private int validMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("Invalid month. the month set to 1.");
			return 1;
		}
		return month;
	}

	/*
	 * Check if the year value is valid (1800-2020). if not - set to default
	 * ('1800').
	 */
	private int validYear(int year) {
		if (year < 1800 || year > 2020) {
			System.out.println("Invalid year. the year set to 1800.");
			return 1800;
		}
		return year;
	}

	/*
	 * Check if the day value is valid (1-31, depends on the month). if not - set to
	 * default ('1').
	 */
	private int validDay(int day) {
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (leapYear(year) && month == 2 && day == 29) {
			return day;
		} else if (day > 0 && day <= daysInMonth[month]) {
			return day;
		} else {
			System.out.println("Invalid day. the day set to 1.");
			return 1;
		}
	}

	/*
	 * Check if the year is a leap year or not.
	 */
	public boolean leapYear(int year) {
		int rest = year % 19;

		if (rest == 0 || rest == 3 || rest == 6 || rest == 8 || rest == 11 || rest == 14 || rest == 17) {
			return true;
		}
		return false;
	}

	/*
	 * Print the name of the month.
	 */
	public void monthName(int month) {
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("Novemver");
			break;
		case 12:
			System.out.println("December");
			break;
		}
	}

	public String toString() {
		return String.format("%02d/%02d/%d", day, month, year);
	}

}
