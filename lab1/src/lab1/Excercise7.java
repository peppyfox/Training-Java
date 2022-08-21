package lab1;
import java.util.Scanner;

/**
 * @author meenu
 *Lab1
 *Q7
 * Create a method to check if a number is an increasing number ie 1234, 1<2<3<4 
 */
public class Excercise7 
{
	public Excercise7() 
	{
		//input
		int n;
	 	System.out.println(" \nEnter the number n :  ");
	 	Scanner sc = new Scanner(System.in);
	 	n= sc.nextInt();
	 	//print if true
	 	if(checkNumber(n))
	 		System.out.print("increasing number");
	 	else
	 		System.out.print(" not a increasing number");
	}
	boolean checkNumber(int n)
	{
		boolean n1=false;//init n1 as false
		int num=0,mod=0,i=0;//i is a flag
		while(n >0) 
		{
		    mod= n%10;
		    if((mod<=num))//if reminder of n/10 is less than or equal to num
		    {
		    	i=1;
		    }
		    else if(mod>num)
		    {
		    	i=0;
		    	break;
		    }
		    num=mod;
		    if(n<10)
		    	break;
		    n=n/10;
		}
		   
		if(i==1)
			n1=true;
		return(n1);
	}


	public static void main(String[] args)
	{
		Excercise7 x7 = new Excercise7();

	}

}
