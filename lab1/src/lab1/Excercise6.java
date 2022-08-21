package lab1;
import java.util.Scanner;

/**
 * @author meenu
 *	Lab1
 *	q6
 *	Create a class with a method to find the difference between the sum of the squares 
and the square of the sum of the first n natural numbers.
 */
public class Excercise6
{

	/**
	 * 
	 */
	public Excercise6()
	{
		int n;
		//input
	 	 System.out.println(" \nEnter the number n :  ");
	 	 Scanner sc = new Scanner(System.in);
	 	 n= sc.nextInt();
	 	System.out.println("sum = " +calculateDifference(n));
	}
	int calculateDifference (int n)//calculates difference
	{
		//s gives sum of all int till n
		int Sum=0,sqsum=0,s=0,i;
		for(i=0;i<=n;i++)
		{
			s+=i;
			//System.out.println(s);
		}
		//sqsum gives sum of squares
		for(i=0;i<=n;i++)
		{
			sqsum+=(int)Math.pow(i,2);
			//System.out.println(sqsum);
		}
		Sum=sqsum-s;
		return(Sum);
	}


	public static void main(String[] args)
	{
		Excercise6 x6 = new Excercise6();

	}

}
