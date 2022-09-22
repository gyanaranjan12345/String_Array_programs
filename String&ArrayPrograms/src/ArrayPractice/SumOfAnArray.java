package ArrayPractice;

import java.util.Scanner;
public class SumOfAnArray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=s.nextInt();
		int a[]= new int[size];
		int sum=0;
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(i+"  ");
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of array are:"+sum);

	}

}
