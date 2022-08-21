package lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author meenu
 * Lab2
 * q3
 * 			Create a method which accepts an integer array, reverse the numbers in the array 
	and returns the resulting array in sorted order
	
 * 			if array is 34,43,54,65
 *			the result should be:
 *			34,43,45,56
 */

public class Excercise3 {

	public Excercise3() 
	{
		//input
		int n;
		System.out.println("Enter the number of elements you want to store : ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		int[] x = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			x[i]=sc.nextInt();  
		}  
		//output
	 	System.out.println("modified and sorted array is : " +Arrays.toString(getSorted(x)));
	 	
	}
	int[] getSorted(int[] x)
	{
		int n,i=0,a,b = 0,j=0;
		n = x.length;
		for(i=0;i<n;i++)
		{
			a=x[i];
			b=0;
			j=0;
			while(a >0) 
			{
				a=a/10;
				j++;
			}
			a=x[i];
			while(a >0) 
			{	
				int mod= a%10;
				b += mod*((int)Math.pow(10,(j-1)));
			    a=a/10;
				j--;
			}
			x[i]=b;
		}
		Arrays.sort(x);	
		return(x);
		
	}


	public static void main(String[] args) {
		Excercise3 x = new Excercise3();

	}

}
