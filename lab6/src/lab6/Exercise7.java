package lab6;
import java.util.*;

/**
 * @author meenu
 * Lab6
 * q7
 * 	 Create a method which accepts an integer array, reverse the numbers in the array 
and returns the resulting array in sorted orde

This code isnt using collection API
 */

public class Exercise7
{
	int[] getSorted(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int k=0,d=0,r=0;
			k=a[i];
			while(k>0)
			{
				d=k%10;
				r=r*10+d;
				k=k/10;
			}
			a[i]=r;
			}
		Arrays.sort(a);
		return a;
 
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Exercise7 a=new Exercise7();
		int[] s=a.getSorted(arr);
		System.out.println("Reversed and sorted areey is ");
		for(int i=0;i<n;i++)
				System.out.print(s[i]+" ");

	}
}
