import java.util.*;
public class Question04hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	if(i%2==0)
        		System.out.print("-1 ");
        	else
        		System.out.print(" 1 ");
        }
	}

}
