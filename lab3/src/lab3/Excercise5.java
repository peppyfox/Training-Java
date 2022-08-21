package lab3;
import java.util.*;
/**
 * @author meenu
 * Lab3
 * q5
 * Write a Java program that displays the number of characters, lines and words in a 
text?
 *
 */
public class Excercise5
{

	public Excercise5() 
	{
		int s=0,s1=0,c=0;
		String str="";
		System.out.println("Enter a string \n");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine())//inputs line while counting it simulataniously
			{
				String f=sc.nextLine();
				str=str+" "+f;
				if(f==null||f.isEmpty())
				{
					break;
				}
				++s1;
			}
		for(int i=0;i<str.length();i++)//count character
			{
			if(Character.isWhitespace(str.charAt(i))==false)
				c++;
			}
		StringTokenizer str1=new StringTokenizer(str," ");
		while(str1.hasMoreTokens())
			{
				s++;
				str1.nextToken();
			}
		System.out.println(str);
		System.out.println("No. of words are : "+s);
		System.out.println("No. of characters are : "+c);
		System.out.println("No. of lines are : "+s1);
	}

	public static void main(String[] args) 
	{
		Excercise5 x=new Excercise5();
	}


}
