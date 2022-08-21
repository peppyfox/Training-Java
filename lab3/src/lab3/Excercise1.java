package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author meenu
 * Lab3
 * q1
 * Write a Java program that reads a line of integers and then displays each integer 
and the sum of all integers. (Use String Tokenizer class)?
 *
 */
public class Excercise1 {

	public Excercise1()
	{
		String x = new String();  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string of numbers : ");  
		x=sc.nextLine();   
		System.out.println("sum of the integers is:   " +tokenizersum(x));
	 	
	}
	int tokenizersum(String x)
	{
		int sum=0,n;
        StringTokenizer st = new StringTokenizer(x, " ");
        while (st.hasMoreTokens())
        {
             String temp = st.nextToken();
             n = Integer.parseInt(temp);//makes the token into int
             System.out.println(n);
             sum = sum + n;
        }

		return(sum);
		
	}
	public static void main(String[] args)
	{
		
		Excercise1 x1 = new Excercise1();
	}
}
