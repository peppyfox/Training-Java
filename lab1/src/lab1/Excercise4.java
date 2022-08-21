/**
 * 
 */
package lab1;
import java.util.*;

/**
 * @author meenu
 *Lab1
 *q4
 *prompts the user for an integer and then prints out all the prime numbers up to that Integer
 */
public class Excercise4 {

	/**
	 * n1 is a flag. if n1=0 then number is prime .
	 */
	public Excercise4() 
	{
		int n1=0,j,i,n=0,r=0,b=0;
	 	 System.out.println(" \nEnter the number till which the prime number is to be checked : ");// enter prime number
	 	 Scanner sc = new Scanner(System.in);
	 	 n= sc.nextInt();
	 	 //if(n>=3)
	 	 for(i=1;i<n;i++) // loop to check every number from 1 to n
	 	 {  
	 		n1=0;
	 		r=i/2;      
	 		if(i==0||i==1) 
	 			 n1=1 ;     
	 		else
	 		{  
	 		   for(j=2;j<=r;j++)// loop for checking if i value is divisible by any number upto i/2
	 		   {   
	 			   b=i%j;//b gives reminder of i/j. if j is divisible by i, b=0; ie no reminder.
	 			   if(b==0)
	 			   {           
	 				   n1=1; 
	 				   break;
	 			   } 
	 			   else if(b!=0)
	 			   		n1=0;

	 		   } 
	 		}
	 		 if(n1!=1)
	 			 System.out.print(" "+i);  
	 	 } 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Excercise4 x4=new Excercise4();
		

	}

}
