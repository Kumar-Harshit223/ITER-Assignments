
public class PermutationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		permutation(arr, 0, 3);
	}
	public static void permutation(int[] arr, int i, int length) {
		if (length == i) {
		printArray(arr, length);
		return;
		}
		int j = i;
		for (j = i; j < length; j++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		permutation(arr, i + 1, length);
			int tem=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return;
	}
	public static void printArray(int arr[], int l) {
		for(int i=0;i<l;i++) {
			System.out.print(+arr[i]+", ");
		}
		System.out.println();
	}
}
