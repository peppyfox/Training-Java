package lab5;
import java.util.*;
/**
 * @author meenu
Write a Java Program to validate the full name of an employee. Create and throw a 
user defined exception if firstName and lastName is blank.
 */
public class Excercise2 
{
	private String firstn;
	private String lastn; 
	
	public Excercise2(String[] name) throws NameException 
	{
		int n=0;
		n=name.length;
		firstn=name[0];
		lastn=name[n-1];
		if (firstn.isEmpty() &&  lastn.isEmpty())
		{
	            throw new NameException("Employee First and last name missing");
	    }     
		else if(firstn.isEmpty())
		{
	            throw new NameException("Employee First name is missing");
	    }
	    else  if(lastn.isEmpty())
	    {
	            throw new NameException("Employee Last name is missing");
	    }
		
	}
	
	public void exept()
	{


	}
	
	public static void main(String[] args) throws NameException
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name and last name : ");
        String[] name = sc.nextLine().split(" ");
		System.out.println("Employee name is ");//)+Arrays.toString(name));
		for(String i : name)
			System.out.println(i+"\t");

		try 
		{
	        Excercise2 x=new Excercise2(name);
			for(String i : name)
				System.out.println(i+"\t");
        } 
		catch (NameException e) 
		{
            System.out.println("Invalid Name " + e.getMessage());
		}
	}
	

}
