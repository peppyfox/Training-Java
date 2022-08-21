package lab6;
import java.util.*;
/**
 * @author meenu
 * Lab6
 * q5
 *Create a method which accepts an array of integer elements and return the second 
smallest element in the array
 */
public class Exercise5 
{

	int getSecondSmallest(int arr[]) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			a.add( (int)(arr[i]));
		Collections.sort(a);
		return a.get(1);
	}
	public static void main(String[] args)
	{
		int n=0,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number of elements : ");
		n=sc.nextInt();
		System.out.println("Enter the  elements : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Exercise5 x=new Exercise5();
	 	a=x.getSecondSmallest(arr);
	 	System.out.println("Second smallest is : "+a);
	
	}
}