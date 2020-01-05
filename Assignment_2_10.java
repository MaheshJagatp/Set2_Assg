package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_10 {

	public static void main(String[] args) {
		Assignment_2_10 obj =new Assignment_2_10();
		obj.span();

	}
	
	public void span() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit for array");
		int limit=s.nextInt();
		System.out.println("enter values");
		int a[] =new int[limit];
		for(int i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array is-> "+Arrays.toString(a));
		
		
	}

}
