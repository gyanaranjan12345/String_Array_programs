package StringPractice;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 2 nos:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		if(a>b)
		{
		 System.out.println("a is biggest");
		}
		else if(b>a)
		{
		 System.out.println("b is biggest");
		}
		else
		{
		 System.out.println("Both are equal");
		}
     }
	}
