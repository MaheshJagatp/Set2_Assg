package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_09 {

	public static void main(String[] args) {
		Assignment_2_09 obj = new Assignment_2_09();
		obj.arrayOper();

	}

	public void arrayOper() {
		Scanner s = new Scanner(System.in);
		int max = 0;

		System.out.println("enter the limit for array");
		int limit = s.nextInt();
		System.out.println("enter values");
		int a[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array is-> " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println(a.length);
		System.out.println(max);

		int min = a[1];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}

		}
		System.out.println(min);

		int output = max - min;
		System.out.println("output is-> " + output);

	}

}
