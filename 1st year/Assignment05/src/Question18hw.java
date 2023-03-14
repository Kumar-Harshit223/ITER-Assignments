import java.util.*;
public class Question18hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("The list of all the exact divisor of "+n+" is");
        for(int i=1;i<=n;i++) {
        	if(n%i==0)
        		System.out.print(i+" ");
        }
	}

}
