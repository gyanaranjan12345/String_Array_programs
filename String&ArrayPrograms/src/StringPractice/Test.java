package StringPractice;

import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		System.out.println("Enter the base:");
		
		int base=sc.nextInt();
		
		
		if(isSumOfPower(num,base)==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("pass");
		    }
	}
	public static boolean isSumOfPower(int num,int base)
	{
		while(num>0) {
			int rem=num%base;
			if(rem>1) return false;
			num=num/5;
		}
		return true;
		}
	}

