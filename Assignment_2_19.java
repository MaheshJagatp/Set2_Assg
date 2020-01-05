package Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_2_19 {

	public static void main(String[] args) {
		Assignment_2_19 obj = new Assignment_2_19();
		obj.vowelsCheck();
	}

	public void vowelsCheck() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		String ss;
		int max = 0, input = 0;
		ArrayList<String> al = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(s1, " ");
		
		while (st.hasMoreElements()) {
			// System.out.println(ss=st.nextToken());
			ss = st.nextToken();
			al.add(ss);

		} // System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			int k = al.get(i).length();
			if (k > max) {
				max = k;
				input = i;

			}

		}
		System.out.println("Max word is-> " + al.get(input));
		String vo = al.get(input);
		int count = 0;
		for (int i = 0; i < vo.length(); i++) {
			if (vo.charAt(i) == 'a' || vo.charAt(i) == 'e' || vo.charAt(i) == 'i' || vo.charAt(i) == 'o'
					|| vo.charAt(i) == 'u') {
				count++;
			}

		}
		System.out.println("Vowels are=> " + count);

	}

}
