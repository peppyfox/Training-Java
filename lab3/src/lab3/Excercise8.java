package lab3;

import java.util.Scanner;

/**
 * @author meenu
 * Lab3
 * q8
 * 		Create a method that accepts a String and checks if it is a positive string. A string is 
		considered a positive string, if on moving from left to right each character in the String comes 
		after the previous characters in the Alphabetical order. For Example: ANT is a positive String 
		(Since T comes after N and N comes after A). The method should return true if the entered string 
		is positive 
 *
 */
public class Excercise8 {

	public Excercise8()
	{
		Scanner sc = new Scanner(System.in);
		String x = new String(); 
		System.out.println("Enter the string : ");  
		x=sc.nextLine();  
		System.out.println(x+" :  Is this StringPositive? " +stringPositive(x));
 	
	}
	boolean stringPositive(String x)
	{
		int i=0,n=0;
		int flag=1;
		boolean x1 = false;
		n = x.length();
		while(i<n - 1)
		{
				if(x.charAt(i)>x.charAt(i+1))
				{
					flag = 0;
					break;
				}
			i++;
		}
		if(flag == 1)
			x1=true;
		else
			x1=false;
		return(x1);
	
	}
	public static void main(String[] args)
	{
		Excercise9 x = new Excercise9();

	}

}
