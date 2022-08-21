package lab3;

import java.util.Scanner;

/**
 * @author meenu
 * Lab3
 * q3
 *  Create a method which accepts a String and replaces all the consonants in the 
String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels
 *
 */
public class Excercise3 {

	public Excercise3() 
	{
		Scanner sc = new Scanner(System.in);
		String x = new String(); 
		System.out.println("Enter the string : ");  
		x=sc.nextLine();  
	 	System.out.println("modified string is : " +Replaceconsonants(x));
	 	
	}
	String Replaceconsonants(String x)
	{
        int n=0;
        char c;
        n=x.length();
		StringBuffer s1 = new StringBuffer(x);
        for(int i=0;i<n;i++)
        {
               c = x.charAt(i);
              // if((c != 'A') || (c != 'a') || (c != 'I') || (c != 'i') ||( c != 'O') || (c != 'o') || (c != 'U') || (c != 'u') || (c != 'E') || (c != 'e' ))
               if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
               {
                     s1.replace(i,i+1,String.valueOf((char)(c+1)));
               }
        }
        x=s1.toString();		
		return(x);
		
	}

	public static void main(String[] args)
	{
		Excercise3 x = new Excercise3();

	}

}
