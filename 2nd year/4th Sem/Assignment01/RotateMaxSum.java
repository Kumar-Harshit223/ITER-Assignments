
public class RotateMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,3,1,2};
		System.out.println("Max Sum with rotation is: "+(rotateWithMaxSum(arr)));
	}
	public static int rotateWithMaxSum(int arr[]) {
		int maxSum=0;
		for(int i=0;i<arr.length;i++) {
			int currSum=0;
			for(int j=0;j<arr.length;j++) {
				int index=(i+j)%arr.length;
				currSum+=(j*arr[index]);
			}
			if(currSum>=maxSum) {
				maxSum=currSum;
			}
		}
		return maxSum;
	}
}
