import java.util.*;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        if(n>=0) {
        	int p=1;
        	for(int i=1;i<=n;i++) {
        		p=p*i;
        	}
        	System.out.printf("The factorial of "+n+" is "+p);
        }
        else
        	System.out.println("The entered value of n is less than 0");
        sc.close();
	}

}
