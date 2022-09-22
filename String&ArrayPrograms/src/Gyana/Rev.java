package Gyana;

import java.util.Scanner;
public class Rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size= sc.nextInt();
		
		int a[]=new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
	
		for(int j=a.length-1; j>=0; j--) 
		{
		  System.out.println(a+"["+j+"]="+a[j]);
		}
         

	}

}
