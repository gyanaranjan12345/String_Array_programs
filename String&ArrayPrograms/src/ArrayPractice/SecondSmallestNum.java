package ArrayPractice;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int a[]= {22,5,6,88,9};
		int min=a[0];
		int secmin=a[0];
		for(int i=1; i<a.length ;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println("smallest value:"+min);
		System.out.println("Second smallest value:"+secmin);

	}

}
