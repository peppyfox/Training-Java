
package lab1;
import java.util.*;

/**
 * @author meenu
 * 
 *Lab1
 *Q1
 *		The Fibonacci sequence is defined by the following rule. The first 2 values in the 
		sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java 
		program that uses both recursive and non-recursive functions to print the nth value of the 
		Fibonacci sequence? 
 */
public class Excercise3
{

	/**
	 * 1 1 2 3 5 8 12 20 32 52........
	 */
	@SuppressWarnings("resource")
	public Excercise3() 
	{
		 int n1=1,n2=1,n3,i,n=0;
	 	 System.out.println(" \nEnter the number of values to be printed : ");
	 	 Scanner sc = new Scanner(System.in);
	 	 n= sc.nextInt();
	 	 System.out.print(n1+" "+n2);//print first two digits
	 	 for(i=2;i<n;++i)  
	 	 {    
	 	  n3=n1+n2;    
	 	  System.out.print(" "+n3);    
	 	  n1=n2;    // swapping the numbers
	 	  n2=n3;  
	 	 }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Excercise3 x3=new Excercise3();

	}

}
