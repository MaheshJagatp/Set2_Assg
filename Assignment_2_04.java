package Assignment_2;

import java.util.Scanner;

public class Assignment_2_04 {

	public static void main(String[] args) {
		Assignment_2_04 obj = new Assignment_2_04();
		obj.strOp();

	}

	public void strOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		
		System.out.println("String is-> " + s1);

		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();

		System.out.println("Enter the first limit");
		int limit = s.nextInt();

		System.out.println("enter the second limit");
		int limit2 = s.nextInt();

		String sss = sb.substring(limit, limit2 + limit);
		System.out.println("String is-> " + sss);

	}

}
