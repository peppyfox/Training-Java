package lab1;
import java.util.*;
/**
 * @author meenu
 * 	LAB1 
 * Q1
 *  Create a method to find the sum of the cubes of the digits of an n digit number
 *
 */
public class Excercise1 
{

	/**
	 * @param args
	 * @return 
	 */
	Excercise1()
	{
	System.out.println("Enter a Number :  ");
	   Scanner sc = new Scanner(System.in);
	   int num= sc.nextInt();
	   int sum=0;
	   while(num >0) 
	   {
	    int mod= num%10; //gives reminder eg 362%10 = 2
	    sum = sum + (int)Math.pow(mod,3);
	    num=num/10; // after getting reminder, divide by 10 for next iteration. eg 362/10 =36
	   }
	   System.out.println("Sum of cube of digits : " +sum);
	}
	public static void main(String[] args)
	{
		Excercise1 x1 = new Excercise1();

	}

}
