package StringPractice;

import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 nos:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//System.out.println("before swaping:"+x+"\t"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping:x="+x+"\t"+"y="+y);
	}
		
}
