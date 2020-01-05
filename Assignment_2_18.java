package Assignment_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_2_18 {

	public static void main(String[] args) {
		Assignment_2_18 obj = new Assignment_2_18();
		obj.upperCase();
	}

	public void upperCase() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String sub,main;
		String c;
		String s1 = s.nextLine();
		StringTokenizer st = new StringTokenizer(s1, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreElements()) {
			sub = st.nextToken();
			c = sub.substring(0, 1);
			// System.out.println(c);
			main = sub.substring(1, sub.length());
			sb.append(c.toUpperCase()).append(main).append(" ");
			
			

		}
		System.out.println(sb);

	}

}
