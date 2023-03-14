import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int n=sc.nextInt();
        int x=n;   //duplicate
        int rev=0;
        while(x!=0) {
        	int r=x%10;
        	rev=(rev*10)+r;
        	x=x/10;
        }
        System.out.print("The reverse of "+n+" is "+rev);
        sc.close();
	}

}
