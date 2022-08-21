package lab6;
import java.util.*;
/**
 * @author meenu
 * Lab6
 * q2
 * Collection: Create a method that accepts a character array and count the number of 
times each character is present in the array
 */
public class Exercise2
{
	HashMap<Character,Integer> countChars(char[] arr){
	HashMap<Character,Integer> h=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		h.put(arr[i],0);
	}
	for(int i=0;i<arr.length;i++)
	{
		h.put(arr[i],h.get(arr[i])+1);
	}
	return h;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of characters :");
	int n=sc.nextInt();
	System.out.println("Enter the characters :");
	char[] a=new char[n];
	for(int i=0;i<n;i++)
		a[i]=sc.next().charAt(0);
	Exercise2 e=new Exercise2();
	HashMap<Character,Integer> j = e.countChars(a);
	System.out.println(j);

}
}
