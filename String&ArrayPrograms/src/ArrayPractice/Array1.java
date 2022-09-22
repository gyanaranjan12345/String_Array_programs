package ArrayPractice;

import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are.......");
		for(int j=0; j<a.length; j++) {
			
			System.out.println(a[j]);
		}
    }
}
