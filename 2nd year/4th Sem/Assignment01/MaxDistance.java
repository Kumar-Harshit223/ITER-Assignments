
public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,8,6,7};
		System.out.println("Max Path Distance is : "+(distance(arr)));
	}
	public static int distance(int arr[]) {
		int maxDist=-1;
		for(int i=0;i<arr.length;i++) {
			int currDist=-1;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					currDist=Math.abs(j-i);
				}
			}
			if(currDist>=maxDist) {
				maxDist=currDist;
			}
		}
		return maxDist;
	}
}
