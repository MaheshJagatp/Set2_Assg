package Assignment_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment_2_05 {

	public static void main(String[] args) {
		Assignment_2_05 obj= new Assignment_2_05();
		obj.arrayOp();
		

	}
	
	public void arrayOp() {
		Scanner s = new Scanner(System.in);
		int sum=0,temp=0;
		Boolean b=true;
		System.out.println("enter the limit for array");
		int limit=s.nextInt();
		System.out.println("enter values");
		
		int a[] =new int[limit];
		for(int i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array is-> "+Arrays.toString(a));
		int i=0;
		
		  int[] temp1 = new int[limit]; 
          
	        // Start traversing elements 
	        int j = 0; 
	        for ( i=0; i<limit; i++) 
	            // If current element is not equal 
	            // to next element then store that 
	            // current element 
	            if (a[i] != a[i+1]) { 
	                temp1[j++] = a[i]; 
	            }else {
	        
	       temp1[j++] = a[limit-1];    
} 
	        // Modify original array 
//	        for ( i=0; i<j; i++) {
//	            a[i] = temp1[i]; 
//	        }
	      System.out.println(Arrays.toString(temp1)); 
	    } 
		
	
	
	}	





/*HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<a.length;i++) {
int k=a[i];
hs.add(k);

}
	
System.out.println("After removing duplicate-> "+hs);
*/














