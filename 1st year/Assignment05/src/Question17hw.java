import java.util.*;
public class Question17hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        int sdiv=1;
        for(int i=2;i<=n;i++) {
        	if(n%i==0) {
        		sdiv=i;
        		break;
        	}
        }
        System.out.println("The smallest exact divisor of "+n+" is "+sdiv);
	}

}
