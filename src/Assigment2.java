

import java.util.Scanner;
import java.util.*;

public class Assigment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		String str;
		System.out.println("Nir avisror and Pinhas ziv");

		do {
			System.out.println("Please enter your choice\n" + "To actice part 1 function, press 1\n"
					+ "To active part 2 function, press 2\nTo Exit press 0");

			choice = input.nextInt();
			switch (choice) {
			case 0:
				System.out.println("EXIT");
				break;

			case 1:

				System.out.println("Please enter a string");
				str = input.next();

				boolean isPali = isPalindrome(str);
				boolean isAuto = isAutoMata(str);
				if (isPali) {
					System.out.println("The string is a palindrome");
				} else {
					System.out.println("The string is not palindrome");

				}
				if (isAuto) {
					System.out.println("The string is accepted by the automata \n\n"
							+ "***************************************************");
				} else {
					System.out.println("The string is not accepted by the automata \n\n"
							+ "***************************************************");

				}
				break;
			case 2:
				int dig;
				int[] arr = new int[5];
				for (int i = 0; i < arr.length; i++) {

					System.out.println("Please enter number " + (i + 1));
					arr[i] = input.nextInt();
				}

				System.out.println("Please enter a digit");
				dig = input.nextInt();
				numArrayDig(arr, dig);

			}

		} while (choice != 0);
		input.close();
	}

	// PART 1
	public static boolean isPalindrome(String str) {

		if (str.length() == 0) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindrome(str.substring(1, str.length() - 1));
		}
		return false;
	}

	public static boolean isAutoMata(String str) {
		boolean answer = true;

		answer = f1(str);

		return answer;
	}

	public static boolean f1(String str) {
		if (str.length() == 0)
			return false;

		if (str.charAt(0) == 'a') {
			return f1(str.substring(1));
		} else
			return f2(str);
	}

	public static boolean f2(String str) {

		if (str.length() == 0)
			return false;

		if (str.charAt(0) == 'a') {
			return f2(str.substring(1));
		} else
			return f3(str);

	}

	public static boolean f3(String str) {

		if (str.length() == 0)
			return true;

		if (str.charAt(0) == 'b') {
			return f3(str.substring(1));

		} else {
			return f2(str);

		}

	}
	// PART 2

	public static void numArrayDig(int[] arr, int dig) {

		int num, countr = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			while (num != 0) {
				
				int tmp = num % 10;
				
				if (tmp == dig) {
					
					countr++;
				}
				num = num / 10;
			}
		}
		System.out.println("The digit " + dig 
							+ " appear " + countr +
								" times in the array \n\n"
								+ "******************************************** ");
	}

}