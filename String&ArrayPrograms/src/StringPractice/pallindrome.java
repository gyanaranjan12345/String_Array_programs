package StringPractice;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int b=15;
		System.out.println("Enter the number of rows to be printed:");
		int rows=sc.nextInt();
		for(int i = 1; i <= rows; i++) {
			for(int j =rows;j >=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(b>=0) {
					if(b>=10) { 
						System.out.print(b+" ");
					    }
					else {
						System.out.print("0"+b+" ");
					}
					b--;
				   }
			     }
			System.out.println();
		}
	}
}
