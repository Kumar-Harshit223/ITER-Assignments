import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	int tmp=arr[i];
        	int pos=i;
        	for(int j=i+1;j<n;j++) {
        		if(tmp<arr[j]) {
        		    tmp=arr[j];
        			pos=j;
        		}      
        		}
        	arr[pos]=arr[i];
        	arr[i]=tmp;
        }
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
        System.out.println();
        int max2=arr[0];
        for(int i=0;i<n;i++) {
        	if(arr[i]<max2) {
        		max2=arr[i];
        		break;
        	}
        }
        System.out.println("The 2nd largest element is : "+max2);
        }

}
