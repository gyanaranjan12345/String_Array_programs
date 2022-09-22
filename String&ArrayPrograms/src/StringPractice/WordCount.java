package StringPractice;

public class WordCount {

	public static void main(String[] args) {
	
		 String s="  Gyana Ranjan Behera  ";
		 System.out.println("Before trimming"+s);
		 
		 String s1=s.trim();
		 System.out.println("After trimming:"+s1);
		 
		int count=1;
		for(int i=0 ; i<=s1.length()-1 ; i++) {
			
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				count=count+1;
			}
		}
		
           System.out.println("No of words are:"+count);
		}
	}

