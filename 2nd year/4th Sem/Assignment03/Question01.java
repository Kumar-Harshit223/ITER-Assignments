
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,1,1,1,1,1,0,1,0,0,0,1};
		int c=sort(arr);
		display(arr);
		System.out.println("Minimum no. of swaps are "+c);

	}
	public static int sort(int arr[]) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					c++;
				}
			}
		}
		return c;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println();
	}
}
