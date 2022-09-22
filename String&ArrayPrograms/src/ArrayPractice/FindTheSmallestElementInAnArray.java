package ArrayPractice;

import java.util.Scanner;
public class FindTheSmallestElementInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the arraay elements:");
		int a[]=new int[size];
		for (int i=0; i<a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int j=0; j<a.length; j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println("minimum no of an array:"+min);
		

	}

}
