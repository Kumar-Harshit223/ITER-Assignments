
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,4,7,12,15,19};
		int arr2[]= {2,3,6,18,22,29};
		sortArrange(arr1, arr2);
		display(arr1);
		display(arr2);

	}
	public static void sortArrange(int arr1[], int arr2[]) {
		for(int i=arr1.length-1;i>=0;i--) {
			int j, last=arr1[arr2.length-1];
			for(j=arr2.length-2;j>=0 && arr1[j]>arr2[i];j--)
				arr1[j+1]=arr1[j];
			if(last>arr2[i]) {
				arr1[j+1]=arr2[i];
				arr2[i]=last;
			}
		}
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}
