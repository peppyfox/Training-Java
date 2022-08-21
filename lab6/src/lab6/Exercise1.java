package lab6;
import java.util.*;
/**
 * @author meenu
 * Lab6
 * q1
 * 		Create a method which accepts a hash map and return the values of the map in 
sorted order as a List.
 */
public class Exercise1
{
	ArrayList<Integer> getValues(HashMap<Integer,Integer> h)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> m:h.entrySet()) {
			a.add(m.getValue());
			}
			Collections.sort(a);
			return a;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> h=new HashMap<>();
		System.out.println("enter hash map");
		while(sc.hasNextInt())
		{
			int p=sc.nextInt();
			int q=sc.nextInt();
			h.put(p,q);
		}
		Exercise1 d=new Exercise1();
		ArrayList<Integer> g=d.getValues(h);
		System.out.println(g);
}
}