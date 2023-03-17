import java.util.*;
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        double avg=0.0;
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        	sum+=arr[i];
        }
        avg=(sum*1.0)/n;
        System.out.println("Sum of the elements of the array is : "+sum);
        System.out.println("Average : "+avg);
	}

}
