package lab6;
import java.util.*;
/**
 * @author meenu
 * Lab6
 * q3
 * 		 Create a method which accepts an array of numbers and returns the numbers and 
their squares in Hashmap
 */

public class Exercise3
{
	HashMap<Integer,Integer> getSquares(int[] arr)
	{
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			h.put(arr[i],(int)Math.pow(arr[i],2));
		}
	return h;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number of elements : ");
		int n=sc.nextInt();
		System.out.println("Enter the  numbers : ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Exercise3 e=new Exercise3();
		HashMap<Integer,Integer> j=e.getSquares(a);
		System.out.println(j);

	}
}
