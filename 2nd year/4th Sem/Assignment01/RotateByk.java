
public class RotateByk {
	
	final static int arr[]={10,20,30,40,50,60};
	final static int k=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(arr, k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void reverse(int arr[], int x) {
		int temp[]=new int[arr.length];
		int c=0;
		for(int i=k;i<arr.length;i++) {
			temp[c]=arr[i];
			c++;
		}
		for(int i=0;i<k;i++) {
			temp[c]=arr[i];
			c++;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
		}
	}

}
