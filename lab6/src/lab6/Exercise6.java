package lab6;
import java.util.*;

/**
 * @author meenu
 * Lab6
 * q6
 * 		Create a method which accepts the id and the age of people as a Map and decide if 
they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of 
all the eligible persons to list and return the list.
 */

public class Exercise6
{
	ArrayList<Integer> votersList(HashMap<Integer,Integer> h)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> m:h.entrySet()) 
		{
			if(m.getValue()>=18)
			a.add(m.getKey());
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int age=0,id=0;
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> h=new HashMap<>();
		System.out.println("enter Id and Age : ");
		while(sc.hasNextInt())
		{
			id=sc.nextInt();
			age=sc.nextInt();
			h.put(id,age);
		}
		Exercise6 d=new Exercise6();
		ArrayList<Integer> g=d.votersList(h);
		System.out.println("Eligible Ids are : \n" +g);
	}
}