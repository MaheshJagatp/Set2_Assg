package Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_2_12 {

	public static void main(String[] args) {

		Assignment_2_12 obj = new Assignment_2_12();
		obj.arrayListOp();

	}

	public void arrayListOp() {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> c = new ArrayList<Integer>();

		System.out.println("enter the limit for first arraylist");
		int limit1 = s.nextInt();
		System.out.println("Enter first arraylist values");

		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < limit1; i++) {
			int k = s.nextInt();
			a.add(k);
		}
		
		System.out.println("First arraylist is--> " + a.toString());

		
		System.out.println("enter the limit for second arraylist");
		int limit2 = s.nextInt();
		System.out.println("Enter second arraylist values");

		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < limit2; i++) {
			int k = s.nextInt();
			b.add(k);
		}
		System.out.println("second arraylist is--> " + b.toString());
		

		for (int j = 0; j < a.size(); j++) {
			if (a.size() == b.size()) {
				if (j % 2 != 0) {
					c.add(a.get(j));
				} else {
					c.add(b.get(j));
				}

			} else {
				System.out.println("Enter arraylist with same size");
				break;
			}
		}
		System.out.println("Aftre merge arraylist is" + c.toString());

	}

}
