package lab2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author meenu
 * Lab4
 * q4
 * 	Create a method which accepts an integer array and removes all the duplicates in 
the array. Return the resulting array in descending order
 *
 */

public class Excercise4
{
	Excercise4()
	{
		//input
		int n,j=0;
		System.out.println("Enter the number of elements you want to store : ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		int[] x = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			x[i]=sc.nextInt();  
		}  
		x =modifyArray(x);//got modifies array but array had a prob as the few elements from old array still remained
	//System.out.print(Arrays.toString(x)+" ");
		for(int i=n; i>=0; i--)
 		{
			if(x[i-1]<x[i-2])//as long as a reverse sorted array .. next element is less than the current j++
 			{
				j++;
 			}
			else
				break;
		//System.out.print(" "+i+" "+j+"\n ");
 		}
		j++;
		System.out.println("Array after duplicates been removed : " );
		//in case array is  5 4 5 4 3 2 , j=4 and it prints  5 4 3 2 
		for(int i=(n-j); i<n; i++)//print element till j
			System.out.print(x[i]+" ");
 			
 	
	}
	int[] modifyArray(int[] x)
	{
		int i=0,j=0;
		int n = x.length;
		Arrays.sort(x);
		int x1[]=new int[n];
		for (i = 0; i < n - 1; i++) 
		{
			if (x[i] != x[i + 1]) 
			{
				x1[j++] = x[i];
			}
        //System.out.println(Arrays.toString(x)+" "+Arrays.toString(x1));
		}

		x1[j++] = x[n - 1];
		for (i = 0; i < n; i++) 
		{
			if(i<j)
				x[i] = x1[i];
		}
		reverse(x);
		return(x);
	}
	int[] reverse(int[] x) //reverses the array element 2 3 4 5  will be 5 4 3 2
	{
		int n = x.length;
		for (int i = 0; i < n / 2; i++)
		{
			int temp = x[i];
			x[i] = x[n - i - 1];
			x[n - i - 1] = temp;
		}
		return x;
	}
     
	public static void main(String[] arg)
	{
		Excercise4 x4 = new Excercise4();
	}

}
