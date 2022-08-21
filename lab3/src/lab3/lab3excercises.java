package lab3;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class lab3excercises 
{
	static class excercise1

	{
		/** Exercise 1: Write a Java program that reads a line of integers and then displays each integer 
and the sum of all integers. (Use String Tokenizer class)?*/
		excercise1()
		{
 
			String x = new String();  
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string of numbers : ");  
			x=sc.nextLine();   
			System.out.println("sum of the integers is:   " +tokenizersum(x));
		 	
		}
		int tokenizersum(String x)
		{
			int sum=0,n;
	        StringTokenizer st = new StringTokenizer(x, " ");
	        while (st.hasMoreTokens())
	        {
	             String temp = st.nextToken();
	             n = Integer.parseInt(temp);
	             System.out.println(n);
	             sum = sum + n;
	        }

			return(sum);
			
		}
		
	}
	static class excercise2
	{
		/**
		 * Create a class containing a method to create the mirror image of a String. The 
method should return the two Strings separated with a pipe(|) symbol . */
		excercise2()
		{

			Scanner sc = new Scanner(System.in);
			String x = new String();  
			System.out.println("Enter the string : ");  
			x=sc.nextLine();
		 	System.out.println("mirror image is  : " +getImage(x));
		 	
		}
		String getImage(String x)
		{
            StringBuffer s1 = new StringBuffer(x);
            s1.append('|');
            StringBuffer s2 = new StringBuffer(x);
            s2.reverse();
            s1.append(s2);
            x=s1.toString();
			return(x);
			
		}
	}     
	static class excercise3
	{
		/**
 Create a method which accepts a String and replaces all the consonants in the 
String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels
*/
		excercise3()
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
	}     
	static class excercise4
	{
		/**modifyNumber 
		 * Exercise 4: Create a method that accepts a number and modifies it such that the each of the 
digit in the newly formed number is equal to the difference between two consecutive digits in the 
original number. The digit in the units place can be left as it is. 
input: 45862
Output:13242 */
		excercise4()
		{
			int n;
			System.out.println("Enter the number : ");  
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();  
			System.out.println("modified array is  : " +modifyNumber(n));
	 	
		}
		int modifyNumber(int n)
		{
			int num,b,i=0,n1=0,r;
			num=n;
			b=countDigit(n);
			r=b-1;
			int[] x= new int[b];
			while(num >0) 
			{
			  x[r]= num%10;
			  //System.out.println(r+" "+Arrays.toString(x)+ " "+num+ " "+x[r]);
			  r--;
			  num=num/10;
			}
			//System.out.println(Arrays.toString(x));
			int[] x1=new int[b];
			r=b-1;
			//x1=x;
			x1[r]=x[r];
			for(i=0;i<=r-1;i++)
			{
				//System.out.println(r+" "+i);

				if(x[i]>x[i+1])
				{
					x1[i]=x[i]-x[i+1];
				}

				else
				{
					x1[i]=x[i+1]-x[i];
				}
				//System.out.println(r+" "+Arrays.toString(x1)+ " "+num+ " "+x1[i]);
			}
			System.out.println(Arrays.toString(x1));
			for(i=0;i<=b-1;i++)
			{
			    n1 = n1 + x1[i]*(int)Math.pow(10,r);			 
			   // System.out.println(r+" "+n1);
			    r--;
			}
			return(n1);
		
		}
		int countDigit(int n)
	    {
	        int count = 0;
	        while (n != 0) {
	            n = n / 10;
	            ++count;
	        }
	        return count;
	    }
	}     
	static class excercise8
	{
		/**
		 * Create a method that accepts a String and checks if it is a positive string. A string is 
		considered a positive string, if on moving from left to right each character in the String comes 
		after the previous characters in the Alphabetical order. For Example: ANT is a positive String 
		(Since T comes after N and N comes after A). The method should return true if the entered string 
		is positive 
		*/
		excercise8()
		{
			Scanner sc = new Scanner(System.in);
			String x = new String(); 
			System.out.println("Enter the string : ");  
			x=sc.nextLine();  
			System.out.println(x+" :  Is this StringPositive? " +stringPositive(x));
	 	
		}
		boolean stringPositive(String x)
		{
			int i=0,n=0;
			int flag=1;
			boolean x1 = false;
			n = x.length();
			while(i<n - 1)
			{
					if(x.charAt(i)>x.charAt(i+1))
					{
						flag = 0;
						break;
					}
				i++;
			}
			if(flag == 1)
				x1=true;
			else
				x1=false;
			return(x1);
		
		}

	}     

	static class excercise9
	{
		/**
 Create a method to accept date and print the duration in days, months and years  */
		excercise9()
		{


			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a date");
			String textdate =sc.next();
			LocalDate date = LocalDate.parse(textdate,format);
			LocalDate todayDate = LocalDate.now();
			Period period = date.until(todayDate);
			System.out.println("Days Duration : "+period.getDays()+" days");
			System.out.println("Months Duration :"+period.getMonths()+"months");
			System.out.println("Years Duration :"+period.getYears()+"years");
		 	
		}

	}     
	public static void main(String[] args)
	{
		
		//excercise1 x1 = new excercise1();
		//excercise2 x2 = new excercise2();
		//excercise3 x3 = new excercise3();
		//excercise4 x4 = new excercise4();
		//excercise5 x5 = new excercise5();
		//excercise6 x6 = new excercise6();
		//excercise7 x7 = new excercise7();
		excercise8 x8 = new excercise8();
		//excercise9 x9 = new excercise9();
	}
	public boolean hasMoreTokens() {
		// TODO Auto-generated method stub
		return false;
	}
}
