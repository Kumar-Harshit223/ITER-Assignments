import java.util.*;
public class Question07hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n=sc.nextInt();
        int x=0;
        int p=1;
        for(int i=1;i<=n;i++) {
        	p*=i;
        	if(p>=n) {
        		if(p==n) {
        			x=i;
            		break;
        		}
        		else {
        			x=i-1;
        			break;
        		}
        	}
        }
        System.out.println("The largest number present as a factorial in "+n+" is "+x);
	}

}
