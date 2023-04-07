
public class Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,9,6,7,4,3,5,8};
		wave(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void wave(int arr[]) {
		int size=arr.length;
		for(int i=1;i<size;i+=2) {
			if((i-1)>=0&&arr[i]>arr[i-1]) {
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if((i+1)<size&&arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
}
