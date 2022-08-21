package lab2;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author meenu
 * Lab2
 * q1
 * 		 Create a method which accepts an array of integer elements and return the second 
smallest element in the array
 *
 */

public class Excercise1
{

	public Excercise1()
	{
		int n;
		System.out.println("Enter the number of elements you want to store : ");  
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();  
		int[] x = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			x[i]=sc.nextInt();  
		}  
	 	System.out.println("Second scallest element is : " +getSecondSmallest(x));
	 	
	}
	int getSecondSmallest(int[] x)
	{
		Arrays.sort(x);
		if(x[0]!=x[1])
			return(x[1]);
		else if(x[0]==x[1])
			return (x[2]);
				// return index 1 on a sorted array which will be second element unless there there is duplicate of smallest number
		
		return 0;
	}
	public static void main(String[] args) {
		Excercise1 x1 = new Excercise1();

	}

}
