package StringPractice;

public class UsingSplit {

	public static void main(String[] args) {
		      String s[] = "Iam a java developer".split(" "); 
		      
		      String rev =""; 
		      for (int i = s.length - 1; i >= 0; i--) { 
		        rev=rev + s[i] ; 
		        if(i!=0) {
		        	rev+=" ";
		        }
		      } 
		      System.out.println("Reversed String:"+rev); 
		    }
		}


