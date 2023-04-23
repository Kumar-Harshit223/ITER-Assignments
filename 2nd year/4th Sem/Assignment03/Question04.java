
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,6,3};
		int k=3;
		System.out.println(minSwap(arr,k));
	}
	public static int minSwap(int arr[], int k) {
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]<=k)
				count++;
		int ctr=0;
		for(int i=0;i<count;i++)
			if(arr[i]>k)
				ctr++;
		int res=ctr;
		for(int i=0, j=count;j<arr.length;i++, j++) {
			if(arr[i]>k)
				ctr--;
			if(arr[j]>k)
				ctr++;
			
			res=Math.min(res, ctr);
		}
		return res;
	}
}
