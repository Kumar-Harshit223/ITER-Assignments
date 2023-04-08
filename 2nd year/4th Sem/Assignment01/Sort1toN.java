
public class Sort1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={8,0,6,1,9,3,2,7,4,5};
		sort(arr);
		System.out.println("New array in sorted format is:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
