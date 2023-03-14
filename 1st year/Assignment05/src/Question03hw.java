import java.util.*;
public class Question03hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=1;
        System.out.print(1+" ");
        for(int i=1;i<=n;i++) {
        	sum+=sum;
        	System.out.print(sum+" ");
        }
        sc.close();
	}

}
