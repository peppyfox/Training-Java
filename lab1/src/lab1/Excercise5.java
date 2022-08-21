package lab1;
import java.util.*;

/**
* @author meenu
* Lab1
* q4
* Create a class with a method which can calculate the sum of first n natural numbers 
which are divisible by 3 or 5 
*/

public class Excercise5
{

	public Excercise5() 
	{
		int n;
		//inputs
	 	 System.out.println(" \nEnter the number till which the sum of all intergers  divisible by 3 or 5 should be calculated :  ");
	 	 Scanner sc = new Scanner(System.in);
	 	 n= sc.nextInt();
	 	 System.out.println("sum = " +calculateSum(n));
	}
	int calculateSum(int n) // calculates the sum
	{
	 	 int n1=0,j,i,sum=0;
	 	 for(i=3;i<=n;i++)
	 	 {
	 		 if(((i%3)==0)||((i%5)==0))//checking id number is divisible by 3 or 5
	 			 sum+=i;
	 	 }
	 	 return(sum);
	}
	public static void main(String[] args) 
	{
		Excercise5 x5=new Excercise5();
		

	}


}
