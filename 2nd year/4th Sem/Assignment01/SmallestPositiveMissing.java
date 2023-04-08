
public class SmallestPositiveMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,-1,6,1,9,3,2,7,4,0};
		int temp[]=new int[arr.length];
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					temp[i]=i;
					flag=1;
				}
			}
			if(flag==0) {
				temp[i]=-1;
			}
			flag=0;
		}
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			if(temp[i]==-1) {
				pos=i;
				break;
			}
		}
		System.out.println("Smallest Positive missing number is: "+pos);
	}
}