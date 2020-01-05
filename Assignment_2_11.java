package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_11 {

	public static void main(String[] args) {
		Assignment_2_11 obj = new Assignment_2_11();
		obj.addElement();

	}

	public void addElement() {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the limit for array");
		int limit = s.nextInt();
		System.out.println("enter values");
		String a[] = new String[limit];
		for (int i = 0; i < limit; i++) {
			a[i] = s.next();
		}
		System.out.println("Array is-> " + Arrays.toString(a));

		double c;
		try {
			for (int i = 0; i < a.length; i++) {

				c = Integer.parseInt(a[i]);
				sum = (int) (sum + c);

			}
		} catch (Exception e) {

			System.out.println("Invalid Opearation");
		}
		System.out.println("Sum is-> " + sum);

	}

}
