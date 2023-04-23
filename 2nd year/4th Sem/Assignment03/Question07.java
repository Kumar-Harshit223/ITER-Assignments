
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4};
		reduction(arr);
		display(arr);

	}
	public static void reduction(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int small=smallest(arr);
			if(small==0)
				break;
			for(int j=0;j<arr.length;j++) {
				arr[j]=arr[j]-small;
			}
		}
		
	}
	public static int smallest(int arr[]) {
		int small=1000;
		int ctr=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				ctr++;
		}
		if(ctr==1) {
			small=0;
			return 0;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(arr[i]<small) {
					small=arr[i];
				}
			}
		}
		return small;
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
