package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_16 {

	public static void main(String[] args) {

		Assignment_2_16 obj = new Assignment_2_16();
		obj.splitString();
	}

	public void splitString() {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();

		char[] chars = s1.toCharArray();
		String[] str = new String[chars.length];

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {

				sum = + Character.getNumericValue(s1.charAt(i));

			}

		}
		System.out.println("sum is-> " + sum);

	}
}
