package StringPractice;

public class CalculateFrequencyOfCharactersPresentInAString {

	public static void main(String[] args) {
		String s="GyanaranjanBehera";
		String s1=s.toUpperCase();   //GYANARANJANBEHERA
		char c[]=s1.toCharArray(); //{'G','Y','A','N','A','R','A','N','J','A','N','B','E','H','E','R','A'}
		for(char ch='A';ch<='Z';ch++)
		{
			int count=0;
			for(int i=0;i<c.length;i++)
			{ 
				if(ch==c[i])
				{
					count++;
				}}
					if(count>0)
					{
						System.out.println(ch+"-"+count);
					}
		}

	}

}
