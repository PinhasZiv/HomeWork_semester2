package homeWork2;

import java.util.Scanner;

public class Assignment2 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nir Avisror 311499958  Pinhas Ziv 315709139\n");
		int userChoice;
		do {
			System.out.println(
					"******************* \n" + "Please enter your choice:\n" + "To active the Part 1, press 1\n"
							+ "To activate the part 2, press 2\n" + "To exit press 0\n" + "*********************");
			userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				checkString();
				break;
			case 2:
				numInArray();
				break;
			}
		} while (userChoice != 0);

		System.out.println("Bye bye");
		sc.close();
	}

	public static boolean f1(String str) {
		if (str.length() == 0) {
			return false;
		}
		switch (str.charAt(0)) {
		case 'a':
			return f1(str.substring(1));
		case 'b':
			return f2(str.substring(1));
		}
		return false;
	}

	public static boolean f2(String str) {
		if (str.length() == 0) {
			return false;
		}
		switch (str.charAt(0)) {
		case 'a':
			return f2(str.substring(1));
		case 'b':
			return f3(str.substring(1));
		}
		return false;
	}

	public static boolean f3(String str) {
		if (str.length() == 0) {
			return true;
		}
		switch (str.charAt(0)) {
		case 'a':
			return f2(str.substring(1));
		case 'b':
			return f3(str.substring(1));
		}
		return true;
	}

	public static boolean isPalindrome(String str) {
		if (str.length() < 2) {
			System.out.println("The string is palindrome.");
			return true;
		} else if (str.charAt(0) == str.charAt(str.length() - 1)) {
			isPalindrome(str.substring(1, str.length() - 1));
		} else {
			System.out.println("The string is not palindrome.");

		}
		return false;
	}

	public static void checkString() {
		System.out.print("Please enter the string: ");
		String str = sc.next();
		isPalindrome(str);
		boolean accept = f1(str);
		if (accept) {
			System.out.println("The string is accepted by the automata.");
		} else {
			System.out.println("The string is not accepted by the automata.");
		}
	}

	public static int numArrayDig(int[] arr, int dig) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			do {
				if (num % 10 == dig) {
					counter++;
					num = 0;
				} else {
					num /= 10;
				}
			} while (num > 0);
		}
		return counter;
	}

	public static void numInArray() {
		int[] arr = new int[5];
		System.out.println("Please enter 5 numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter a digit: ");
		int dig = sc.nextInt();
		int count = numArrayDig(arr, dig);
		System.out.println("The digit " + dig + " appear " + count + " times in the array.");
	}
}
