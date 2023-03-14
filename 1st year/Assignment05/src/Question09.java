import java.util.*;
public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int p=1;
    	for(int i=1;i<=n;i++) {
    		p=p*i;
    	}
    	double result=Math.pow(x,n)/(p);
    	System.out.println("Result of x^n/n! is "+result);	
    	sc.close();
	}

}
