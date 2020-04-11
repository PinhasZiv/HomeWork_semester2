package homeWork3;

public class Person {

	private String name;
	private Date dateOfBirth;
	private int id;
	private static int counter = 1;

	/*
	 * Constructor that create Person object(name, dateOfBirth).
	 */
	public Person(String name, Date birth) {
		this.name = name;
		this.dateOfBirth = birth;
		this.id = Person.counter++;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getMyId() {
		return id;
	}

	public String toString() {
		boolean isLeapYear = dateOfBirth.leapYear(dateOfBirth.getYear());
		if (isLeapYear) {
			return String.format("%s %s: %d. %s %s %s", name, "id number", id, "born on", dateOfBirth,
					"it was a leap year");
		} else {
			return String.format("%s %s: %d. %s %s %s", name, "id number", id, "born on", dateOfBirth,
					"it was not a leap year");
		}
	}
}
