
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,7,91,85,22,29,60};
		operations(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	public static void operations(int arr[]) {
		int i, loc, j,k, selected;
		for(i=0;i<arr.length;i++) {
			j=i-1;
			selected=arr[i];
			loc=binarySearch(arr, selected, 0, j);
			while(j>=loc) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=selected;
		}
	}
	public static int binarySearch(int arr[],int item, int low,int high) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(item==arr[mid])
				return mid+1;
			else if(item>arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return low;
	}
}
