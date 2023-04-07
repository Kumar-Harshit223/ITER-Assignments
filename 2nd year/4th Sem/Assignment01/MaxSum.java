
public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,50,-40,-100,90,13};
		System.out.println(maxSumSubArray(arr, arr.length));
	}
	public static int maxSumSubArray(int arr[], int n) {
		int maxFar=0, maxEnd=0;
		for(int i=0;i<n;i++) {
			maxEnd=maxEnd+arr[i];
			if(maxEnd<0)
				maxEnd=0;
			if(maxFar<maxEnd)
				maxFar=maxEnd;
		}
		return maxFar;
	}
}
