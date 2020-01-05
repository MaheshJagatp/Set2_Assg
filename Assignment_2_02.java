package Assignment_2;

import java.util.Scanner;

public class Assignment_2_02 {

	public static void main(String[] args) {
		Assignment_2_02 obj = new Assignment_2_02();
		obj.searchStr();

	}

	public void searchStr() {
		int index = 0, index1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the main string");
		String s1 = s.nextLine().toUpperCase();
		System.out.println("Enter the first string");
		String s2 = s.nextLine().toUpperCase();
		System.out.println("Enter the second string");
		String s3 = s.nextLine().toUpperCase();

		if (s1.contains(s2) == true) {
			index = s1.indexOf(s2);
			// System.out.println(index);

			if (s1.contains(s3) == true) {
				index1 = s1.indexOf(s3);
				// System.out.println(index1);

				if (index < index1) {
					System.out.println(s2 + " Comes before " + s3);
				} else {
					System.out.println(s3 + " Comes before " + s2);
				}
			}
		}

	}

}
