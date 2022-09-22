package StringPractice;

public class Test2 {

	public static void main(String[] args) {
		String s1="gyanaranjanbehera";
		while(s1.length()>0)
		{
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+"","");
			int n=s1.length()-s2.length();
			System.out.println(ch+"="+n);
			s1=s2;
		}

	}

}
