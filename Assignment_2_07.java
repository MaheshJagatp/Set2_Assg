package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_07 {

	public static void main(String[] args) {
		Assignment_2_07 obj = new Assignment_2_07();
		obj.arrayOp();

	}

	public void arrayOp() {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int l = s.nextInt();
		System.out.println("enter the values");
		int a[] = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int j = 0; j < a.length; j++) {
			sum = (int) (sum + Math.pow(a[j], j));
		}
		System.out.println(sum);

	}

}
