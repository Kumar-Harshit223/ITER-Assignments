import java.util.*;
public class Question09hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
        	int p=1;
        	for(int j=1;j<=i;j++) {
        		p*=j;
        	}
        	sum+=p;
        }
        System.out.println("Sum of all the factorials of the first "+n+" terms is "+sum);
	}

}
