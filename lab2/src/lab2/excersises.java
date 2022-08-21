package lab2;
import java.util.*;

public class excersises 
{
	static class excercise1
	{
		/** Create a method which accepts an array of integer elements and return the second 
smallest element in the array*/
		excercise1()
		{
			int n;
			System.out.println("Enter the number of elements you want to store : ");  
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();  
			int[] x = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
				x[i]=sc.nextInt();  
			}  
		 	System.out.println("Second scallest element is : " +getSecondSmallest(x));
		 	
		}
		int getSecondSmallest(int[] x) {
			Arrays.sort(x);
			return(x[1]);
			
		}
	}      
	
	static class excercise2
	{
		/**
		 * That that can accept an array of String objects and sort in alphabetical 
order. The elements in the left half should be completely in upper case and the elements in the 
right half should be completely in lower case. Return the resulting array. */
		excercise2()
		{
			int n;
			System.out.println("Enter the number of elements you want to store : ");  
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();  
			String[] x = new String[n];  
			System.out.println("Enter the strings of the array: ");  
			for(int i=0; i<n; i++)  
			{  
				x[i]=sc.next();
			}  
		 	System.out.println("modified array is  : " +Arrays.toString(sortStrings(x)));
		 	
		}
		String[] sortStrings(String[] x)
		{
			int b,n,i=0;
			n = x.length;
			if(n%2==1)
				b=(int)(n/2);//index starts from 0, so b-1 to get correct index. that ie. if 7 is odd.. 7/3= 3.5, so printed uppercase is from 4th elements. which is in index 3
			else
				b=(int)n/2;
			Arrays.sort(x);
			for(i=0;i<n;i++)
			{
				if((i<b)||(i==0))
					x[i]=x[i].toLowerCase();
				else if(i>=b)
					x[i]=x[i].toUpperCase();
			}
			return(x);
			
		}
	}     
	
	static class excercise3
	{
		/**
	Create a method which accepts an integer array, reverse the numbers in the array 
	and returns the resulting array in sorted order
*/
		excercise3()
		{
			int n;
			System.out.println("Enter the number of elements you want to store : ");  
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();  
			int[] x = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
				x[i]=sc.nextInt();  
			}  
		 	System.out.println("modified and sorted array is : " +Arrays.toString(getSorted(x)));
		 	
		}
		int[] getSorted(int[] x)
		{
			int n,i=0,a,b = 0,j=0;
			n = x.length;
			for(i=0;i<n;i++)
			{
				a=x[i];
				b=0;
				j=0;
				while(a >0) 
				{
					a=a/10;
					j++;
				}
				a=x[i];
				while(a >0) 
				{	
					int mod= a%10;
					b += mod*((int)Math.pow(10,(j-1)));
				    a=a/10;
					j--;
				}
				x[i]=b;
			}
			Arrays.sort(x);			
			return(x);
			
		}
	}     

	static class excercise4
	{
		/**
		 * 
Create a method which accepts an integer array and removes all the duplicates in 
the array. Return the resulting array in descending order
*/
		excercise4()
		{
			int n,j=0;
			System.out.println("Enter the number of elements you want to store : ");  
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();  
			int[] x = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
				x[i]=sc.nextInt();  
			}  


			x =modifyArray(x);
			//System.out.print(Arrays.toString(x)+" ");
		 	for(int i=n; i>=0; i--)
		 		{
		 		if(x[i-1]<x[i-2])
		 			{
		 			j++;
		 			}
		 		else
		 			break;
				//System.out.print(" "+i+" "+j+"\n ");
		 		}
			j++;
		 	System.out.println("Array after duplicates been removed : " );
		 	for(int i=(n-j); i<n; i++)
		 		System.out.print(x[i]+" ");
		 			
		 	
		}
		int[] modifyArray(int[] x)
		{
			int i=0,j=0;
			int n = x.length;
			Arrays.sort(x);
			int x1[]=new int[n];
	        for (i = 0; i < n - 1; i++) 
	        {
	            if (x[i] != x[i + 1]) 
	            {

	            	x1[j++] = x[i];

	            }
    	        //System.out.println(Arrays.toString(x)+" "+Arrays.toString(x1));
	        }

	        x1[j++] = x[n - 1];
	        for (i = 0; i < n; i++) 
	        {
	        	if(i<j)
	        		x[i] = x1[i];
	        	
	        		
	        }
	        reverse(x);
			return(x);
		}
	    int[] reverse(int[] x)
	    {
	  

	        int n = x.length;
	        for (int i = 0; i < n / 2; i++)
	        {

	            int temp = x[i];
	            x[i] = x[n - i - 1];
	            x[n - i - 1] = temp;
	        }
			return x;
	    }
	
	}     

	public static void main(String[] args) 
	{
		//excercise1 x1 = new excercise1();
		//excercise2 x2 = new excercise2();
		//excercise3 x3 = new excercise3();
		//excercise4 x4 = new excercise4();

	}

}
