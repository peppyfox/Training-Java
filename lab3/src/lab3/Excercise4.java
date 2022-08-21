package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author meenu
 * Lab3
 * q4
 * modifyNumber 
		 * Exercise 4: Create a method that accepts a number and modifies it such that the each of the 
digit in the newly formed number is equal to the difference between two consecutive digits in the 
original number. The digit in the units place can be left as it is. 
input: 45862
Output: 13242 
 *
 */
public class Excercise4
{

	public Excercise4()
	{
		int n;
		System.out.println("Enter the number : ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		System.out.println("modified array is  : " +modifyNumber(n));
 	
	}
	int modifyNumber(int n)
	{
		int num,b,i=0,n1=0,r;
		num=n;
		b=countDigit(n);
		r=b-1;
		int[] x= new int[b];
		while(num >0) //extract digits of number
		{
		  x[r]= num%10;
		  r--;
		  num=num/10;
		}
		int[] x1=new int[b];
		r=b-1;
		x1[r]=x[r];//keep leftmost nu,ber same
		for(i=0;i<=r-1;i++)
		{
			if(x[i]>x[i+1])
			{
				x1[i]=x[i]-x[i+1];
			}

			else
			{
				x1[i]=x[i+1]-x[i];
			}

		}

		for(i=0;i<=b-1;i++)//turn array into number
		{
		    n1 = n1 + x1[i]*(int)Math.pow(10,r);			 
		    r--;
		}
		return(n1);
	
	}
	int countDigit(int n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

	public static void main(String[] args)
	{
		Excercise4 x4 = new Excercise4();

	}

}
