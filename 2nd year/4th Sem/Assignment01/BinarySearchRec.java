
public class BinarySearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 40;
        int result = BinarySearchRecursive(arr, 0, arr.length, 40);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);
	}
	public static int BinarySearchRecursive(int[] arr, int low, int high, int value) {
		if(low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == value) {
			return mid;
		}
		else if (arr[mid] < value) {
			return BinarySearchRecursive(arr, mid + 1, high, value);
		} 
		else {
			return BinarySearchRecursive(arr, low, mid - 1, value);
		}
	}
}
