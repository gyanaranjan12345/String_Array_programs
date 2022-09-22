package StringPractice;

public class VowelCount {

	public static void main(String[] args)
	{
		String s="javaEEdeeeeve";
		int count=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)=='e'||s.charAt(i)=='E')
			{
				count++;
			}
		}
          System.out.println("Count of e/E is:"+count);
	}

}
