package Arrays;

import java.util.Scanner;

public class Insertion 
{// class 

	public static void main(String[] args)
	{// method 
		
		int n,m,c = 0; // variables 
		Scanner s=new Scanner(System.in); // input scanner class object 
		System.out.println("Enter no of element in array ");
		n=s.nextInt();// shift the values
		int a[]= new int[n];// array 1
		int b[]= new int[n+1];// Array 2 n+1 is add 1 index 
		
		System.out.println("Enter values");
		for (int i=0;i<n;i++) 
		{// for 1
			a[i]=s.nextInt();// direct Enter value in array of (a)
		}// for 1
		System.out.print("Enter index of new value to be inserted");
		 m=s.nextInt();// input value is shift
		 System.out.println("Enter the new value of inserted");
		 c=s.nextInt();// input value is shift 
		 
		
		for (int i=0;i<n+1;i++) 
		{// for 2
			if (i<m) 
			{
				b[i]= a[i]; // compare the arrays
			}else if (i==m) 
			{
				b[i]=c;// direct input in b arrays 
			}else
			{
				b[i]=a[i-1];
			}
			
		}// for 2 
		System.out.println("Element Are");
		for (int i=0;i<n+1;i++) 
		{
			System.out.println(b[i]);
			
		}
		
	}// method 

}// class 
