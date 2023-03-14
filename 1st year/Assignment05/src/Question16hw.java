import java.util.*;
public class Question16hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        int sum=0,dup=n;
        System.out.println("Enter the values");
        for(int i=1;i<=dup;i++) {
        	int x=sc.nextInt();
        	if(n!=0)
        	    sum+=(x*(Math.pow(10, (n-1))));
        	n--;
        }
        System.out.println("New number is "+sum);
	}

}
