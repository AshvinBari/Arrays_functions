package Arrays;

import java.util.Scanner;

public class Deletion 
{// class 

	public static void main(String[] args)
	{//  method 
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
		System.out.println("Enter index of value of deleted ");
		m=s.nextInt(); 
		  for (int i=0;i<a.length;i++) 
		  {// for 2 
			  if (i< m) 
			  {
				  b[i]=a[i]; // shift the value 
				 
			  } else if (i==m) // compare 
				  
				  continue;
			  else
			  {
				  b[i-1]=a[i];  //  code of delete method    
				  
			  }
			  
		  }//for 2 
		 
		System.out.println("Element Are");
		for (int i=0;i<n+1;i++) 
		{
			System.out.println(b[i]);
			
		}

	}// method 

}// class 
