package StringPractice;

public class Ab {

	public static void main(String[] args) {
	
         String s="java is good language";
          String [] a=s.split(" ");
          String s2="";
          int count =1;
          for(int i=a.length-1;i>=0;i--)
          {
	        s2+=a[i];
	        System.out.println(count+++". "+a[i]+" ");
          }
	  }
  }
