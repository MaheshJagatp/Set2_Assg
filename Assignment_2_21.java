package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_21 {

	public static void main(String[] args) {

		Assignment_2_21 obj = new Assignment_2_21();
		obj.arrayOp();
	}

	public void arrayOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array limit");
		int l = s.nextInt();
		int evensum = 0, oddsum = 0;
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				evensum = evensum + a[i];
			} else {
				oddsum = oddsum + a[i];
			}
		}
		// System.out.println(evensum);
		// System.out.println(oddsum);
		if (evensum == oddsum) {
			System.out.println("even and odd sum is same");
		} else {
			System.out.println("sum is not same");
		}

	}
}
