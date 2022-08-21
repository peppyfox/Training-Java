package lab1;
import java.util.Scanner;

/**
 * @author meenu
 * Lab1
 * q8
 * 		A number is a power of two or not
 *
 */

public class Excercise8
{

	/**
	 * 
	 */
	public Excercise8()
	{
		int n;
	 	System.out.println(" \nEnter the number n :  ");
	 	Scanner sc = new Scanner(System.in);
	 	n= sc.nextInt();
	 	if(checkNumber1(n))
	 		System.out.print("power of 2");
	 	else
	 		System.out.print("not a power of 2");
	}
	boolean checkNumber1(int n)
	{
		boolean n1=false;
		int i=1;//i is a flag
        if (n == 0)
            i=0;
        while (n != 1) //loop runs AS LONG AS N IS NOT EQUAL TO 1
        {
            if (n % 2 != 0)
                i=0;
            n = n / 2;
        }
		if(i==1)
			n1=true;
		return(n1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Excercise8 x8 = new Excercise8();

	}

}
