package ArrayPractice;

import java.util.Scanner;
public class FirstAndLastElementPrint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0; i<=a.length-1; i++) {
			
			a[i]=s.nextInt();
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}

}
