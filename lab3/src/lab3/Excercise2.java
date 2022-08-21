package lab3;
import java.util.*;

/**
 * @author meenu
 * Lab3
 * q2
 * Create a class containing a method to create the mirror image of a String. The 
method should return the two Strings separated with a pipe(|) symbol .
 *
 */

public class Excercise2 {

	public Excercise2()
	{
		Scanner sc = new Scanner(System.in);
		String x = new String();  
		System.out.println("Enter the string : ");  
		x=sc.nextLine();
	 	System.out.println("mirror image is  : " +getImage(x));
	 	
	}
	String getImage(String x)
	{
		//buffers can append 
        StringBuffer s1 = new StringBuffer(x);//s1 = abc
        s1.append('|');                       //s1 = abc|
        StringBuffer s2 = new StringBuffer(x);//s2 = abc s1=abc|
        s2.reverse();                         //s2 = cba s1=abc|
        s1.append(s2);						  //s2 = cba s1=abc|cba
        x=s1.toString();
		return(x);
		
	}

	public static void main(String[] args)
	{
		Excercise2 x = new Excercise2();

	}

}
