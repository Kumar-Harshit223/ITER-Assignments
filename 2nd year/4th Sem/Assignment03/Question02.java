
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,1,1,2,2,1,0,1,0,2};
		sort(arr);
		display(arr);

	}
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}
