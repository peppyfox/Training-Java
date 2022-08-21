package lab6;
import java.util.*;
/**
 * @author meenu
 * Lab6
 * q4
 * 		school offers medals to the students of tenth based on the following criteria 
			If(Marks>=90) : Gold 
			If(Marks between 80 and 90) : Silver 
			If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return the details of the 
students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the medal type 
as value.

 */
public class Exercise4
{
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> o)
	//return the details of the students eligible for 
	//the medals along with the medal type.
	{
		HashMap<Integer,String> h=new HashMap<>();
		for(Map.Entry<Integer,Integer> m:o.entrySet())
		{
			if((m.getValue())>=90) 
				h.put((m.getKey()),"Gold");
			else if((m.getValue()>=70) &&(m.getValue()<80))
				 h.put(m.getKey(),"Bronze");
			else if((m.getValue()>=80) &&( m.getValue()<90))
				 h.put(m.getKey(),"Silver");
		}
		return h;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter reg number and marks : ");
		HashMap<Integer,Integer> h=new HashMap<>();
		while(sc.hasNextInt())
		{
				int regn=sc.nextInt();
				int mark=sc.nextInt();
				h.put(regn,mark);
		}
		Exercise4 d=new Exercise4();
		HashMap<Integer,String> p=d.getStudents(h);
		System.out.println(p);
	}
}