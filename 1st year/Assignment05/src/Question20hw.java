import java.util.*;
public class Question20hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=(a>b)?a:b;
        while(true) {
        	if(lcm%a==0&&lcm%b==0) {
        		System.out.println("The LCM of "+a+" , "+b+" is : "+lcm);
        		break;
        	}
        	++lcm;
        }
	}

}
