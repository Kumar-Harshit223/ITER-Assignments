
public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,4,8,10,16,20};
		int arr2[]= {4, 9, 20, 71, 100};
		union(arr1, arr2);
		intersection(arr1, arr2);
	}
	public static void intersection(int arr1[], int arr2[]) {
		System.out.println("Intersection of the two arrays are : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
	}
	public static void union(int  arr1[], int arr2[]) {
		System.out.println("Union of the two arrays are : ");
		for(int i=0;i<arr1.length;i++) {
			int flg=-1;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flg=0;
				}
				else {
					System.out.print(arr2[j]+" ");
				}
			}
			if(flg==-1) {
				System.out.print(arr1[i]+" ");
			}
			else {
				flg=0;
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
	}
}
