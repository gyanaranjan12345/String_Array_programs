package Gyana;

public class Test2 {

	public static void main(String[] args) {
		String s1="gyanaranjan";
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","" );
			int n=s1.length()-s2.length();
			s1=s2;
		}
	}}
