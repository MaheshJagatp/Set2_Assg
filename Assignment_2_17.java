package Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_2_17 {

	public static void main(String[] args) {
		Assignment_2_17  obj =new Assignment_2_17();
		obj.sortArray();
	}
	public void sortArray() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit for array");
		int l=s.nextInt();
		System.out.println("enter the values");
		String [] sarray=new String [l];
		for(int i=0;i<l;i++) {
			sarray[i]=s.next();
		}
	//	System.out.println(Arrays.toString(sarray));
		
		/*for(int i = 0; i<sarray.length; i++) {
	         for (int j = i+1; j<sarray.length; j++) {
	            if(sarray[i].compareTo(sarray[j])>0) {
	               String temp = sarray[i];
	               sarray[i] = sarray[j];
	               sarray[j] = temp;
	            }
	         }
	      }
	      System.out.println("sorted Arrys is"+Arrays.toString(sarray));
	      */
	      //reverse
	    ArrayList<String> al=new ArrayList<String>();
	      for(int i=0;i<sarray.length;i++) {
	    	  al.add(sarray[i]);
	      }
	    System.out.println("arraylist is-> "+al);
	     
	    ArrayList<String> rev=new ArrayList<String>();
		
	    for(int i=al.size()-1;i>=0;i--){
	    	rev.add(al.get(i));
	    }
	    System.out.println("reverse array is "+rev);
	   
	    
	    //input
	    System.out.println("enter the input");
	    int input=s.nextInt();
	    System.out.println(rev.get(input-1));
	    
	}

}


/*



String rev="";
String []  rarray= new String [l];

for(int i=sarray.length-1;i>=0;i--) {
	  	   rev=sarray[i];
	  	   System.out.println(rev);
	  	 if(i==0) {
	  		 int j=0;
  		   rarray[j]=rev;
  		  j++;
  	   }
}

System.out.println("reverese array is-> "+Arrays.toString(rarray));*/

