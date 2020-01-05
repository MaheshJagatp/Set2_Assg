package Assignment_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_2_13 {

	public static void main(String[] args) {
		Assignment_2_13 obj=new Assignment_2_13();
		obj.occurs();
		
	}
	
	public void occurs () {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the main string");
		String s1=s.nextLine().toUpperCase();
		
		System.out.println("Enter the search string");
		String s2=s.nextLine().toUpperCase();

		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreTokens()) {
			if(st.nextElement().equals(s2)) {
				count++;
			}
			//System.out.println(st.nextElement());
		}
		
		System.out.println(count);
		
	}

}
