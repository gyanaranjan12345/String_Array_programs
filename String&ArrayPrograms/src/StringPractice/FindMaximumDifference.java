package StringPractice;

public class FindMaximumDifference {

	public static void main(String[] args) {
				int arr[]= {2,7,9,5,1,3,5};
				int diff;
				int maxdiff=0;
				for(int i=0; i<arr.length-1; i++) {
					if(arr[i]<arr[i+1]) {
						diff=arr[i+1]-arr[i];
						if(diff>maxdiff) {
							maxdiff=diff;
						}
					}
				}
				System.out.println(maxdiff);

			}

}
