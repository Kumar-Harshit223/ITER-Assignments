import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=0,temp;
        if(x>y) {
        	if(y!=0) {
        		if(x%y==0)
        			gcd=y;
        		y=0;
        	}
            else {
            	temp=x;
        	    x=y;
            	y=temp%y;
            }
        }
        System.out.print("GCD is "+gcd);
        sc.close();
	}

}
