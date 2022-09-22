package StringPractice;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gyanaranjan";
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int n=s1.length()-s2.length();
			System.out.println(c+"="+n);
			s1=s2;
		}

	}

}
