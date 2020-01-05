package Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_08 {

	public static void main(String[] args) {
		Assignment_2_08 obj = new Assignment_2_08();
		obj.checkInt();

	}

	public void checkInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array limit");
		int l = s.nextInt();
		System.out.println("enter values");
		String a[] = new String[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.next();
		}
		System.out.println("Array is-> " + Arrays.toString(a));

		double c; boolean q=false;
		try {
			for (int i = 0; i < a.length; i++) {

				c = Double.parseDouble(a[i]);
				
				//System.out.println(c);
				q=true;

			}
		} catch (Exception e) {

			System.out.println("-1");
		}

		if(q=true) {
			System.out.println("1");
		}
	}

}
