package Assignment_2;

import java.util.Scanner;

public class Assignment_2_20 {

	public static void main(String[] args) {
		Assignment_2_20 obj=new Assignment_2_20();
		obj.mdeOp();

	}
	public void mdeOp() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.next();
		//System.out.println(s1);
		String s2="";
	
		if(s1.length()%2==0) {
			s2=s1.substring(1,(s1.length()-1));
		}else {
			System.out.println("Enter even length String");
		}
		System.out.println(s2);
	
	}
	

}
