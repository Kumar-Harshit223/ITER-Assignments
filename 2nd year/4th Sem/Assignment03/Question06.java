
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,10,5,7,8};
		evenOdd(arr);
		display(arr);

	}
	public static void evenOdd(int arr[]) {
		int left=0, right=arr.length-1;
		while(left<right) {
			while(arr[left]%2==0&&left<right)
				left++;
			while(arr[right]%2==1&&left<right)
				right--;
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
