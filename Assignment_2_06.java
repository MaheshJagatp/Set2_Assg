package Assignment_2;

import java.util.Scanner;

public class Assignment_2_06 {

	public static void main(String[] args) {

		Assignment_2_06 obj = new Assignment_2_06();
		obj.arrayOp();
	}

	public void arrayOp() {
		int output = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first input");
		String s1 = s.nextLine();
		String ss1 = s1.substring(5);
		int last = Integer.parseInt(ss1);

		System.out.println("enter second input");
		String s2 = s.nextLine();
		String ss2 = s2.substring(5);
		int current = Integer.parseInt(ss2);

		System.out.println("enter third input");
		int s3 = s.nextInt();

		if (current > last) {
			output = (current - last) * s3;
			System.out.println("output is->" + output);
		}

	}

}
