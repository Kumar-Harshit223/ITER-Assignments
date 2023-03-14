import java.util.*;
public class Question02hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;    //accumulator
        for(int i=1;i<=n;i++) {
        	sum=sum+(i*i);
        }
        System.out.println("Sum of square of n numbers is "+sum);
        sc.close();
	}

}
