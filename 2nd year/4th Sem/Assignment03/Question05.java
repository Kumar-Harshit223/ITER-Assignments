
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int arr2[]= {10,6,20,54,100,2,97,32,1};
		if(arr[0]>arr[arr.length-1]) {
			sortDes(arr2);
			display(arr2);
		}
		else {
			sortAcc(arr2);
			display(arr2);
		}

	}
	public static void sortAcc(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void sortDes(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
