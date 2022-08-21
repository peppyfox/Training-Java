package lab5;
import java.util.*;
import lab5.ageexception;
/**
 * @author meenu
 *Exercise 1: Validate the age of a person and display proper message by using user defined 
exception. Age of a person should be above 15.
 */

@SuppressWarnings({ "resource", "unused" })
public class Excercise1 
{

	public static void main(String[] args) 
	{
		
	      Scanner sc = new Scanner (System.in);
	      System.out.println("Enter your age"); //scans age
	      int a = sc.nextInt();
	      try{  
	    	     if(a <= 15)//if a is less than or equal to 15. throw an exception.
	    	     {         
	    	        throw new ageexception();
	    	     } 
	      	}
	      catch(ageexception ex)
	      {
	    	    System.out.println(" \nError : The Age of the person should be above 15" );        
	      }
	      finally
	      {
	    	        System.out.println("The age you entered is  " + a);
	    	        
	      }
	}

}


