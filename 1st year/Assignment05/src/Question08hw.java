import java.util.*;
public class Question08hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values of A and B : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        if(a<=b) {
        	for(int i=1;i<=b;i++) {
        		sum+=a;
        	}
        }
        else {
        	for(int i=1;i<=a;i++) {
        		sum+=b;
        	}
        }
        System.out.println(a+" X "+b+" = "+sum);
	}

}
