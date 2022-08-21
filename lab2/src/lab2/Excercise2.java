package lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author meenu
 * Lab2
 * q2
 * 				 * That that can accept an array of String objects and sort in alphabetical 
order. The elements in the left half should be completely in upper case and the elements in the 
right half should be completely in lower case. Return the resulting array. 
 *
 */

public class Excercise2 {

	public Excercise2() {
		int n;
		System.out.println("Enter the number of elements you want to store : ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		String[] x = new String[n];  
		System.out.println("Enter the strings of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			x[i]=sc.next();
		}  
	 	System.out.println("modified array is  : " +Arrays.toString(sortStrings(x)));
	 	
	}
	String[] sortStrings(String[] x)
	{
		int b,n,i=0;
		n = x.length;
		if(n%2==1)
			b=(int)(n/2);//index starts from 0, so b-1 to get correct index. that ie. if 7 is odd.. 7/3= 3.5, so printed uppercase is from 4th elements. which is in index 3
		else
			b=(int)n/2;
		Arrays.sort(x);
		for(i=0;i<n;i++)
		{
			if((i<b)||(i==0))
				x[i]=x[i].toLowerCase();
			else if(i>=b)
				x[i]=x[i].toUpperCase();
		}
		return(x);
		
	}

	public static void main(String[] args) 
	{

		Excercise2 x = new Excercise2();
	}

}
