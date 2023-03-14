import java.util.*;
public class Question10hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms of the Lucas sequence to be displayed : ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print(" 1 ");
        int a=1,b=3;
        for(int i=2;i<=n;i++) {
        	System.out.print(b+" ");
        	int dup=a;
        	a=b;
        	b+=dup;
        }
	}

}
