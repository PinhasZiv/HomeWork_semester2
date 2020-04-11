package homeWork3;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nir Avisror 311499958, Pinhas Ziv 315709139 \n"
				+ "**********************************");
		// insert your family size.
		System.out.println("please Insert a family size that you want to create :");
		int familySize = sc.nextInt();
		
		// array of persons in the family
		Person[] family = new Person[familySize];
		
		// enter the details of each person in the family
		for (int i = 0; i < family.length; i++) {
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter date of birth: \n" + "day: ");
			int day = sc.nextInt();
			System.out.println("month:");
			int month = sc.nextInt();
			System.out.println("year: ");
			int year = sc.nextInt();
			Date date = new Date(day, month, year);
			family[i] = new Person(name, date);
		}
		
		// print the details of the persons in the family.
		for (int i = 0; i < family.length; i++) {
			System.out.print("\n" + family[i] + " >>> ");
			family[i].getDateOfBirth().monthName(family[i].getDateOfBirth().getMonth());
		}
		sc.close();
	}
}
