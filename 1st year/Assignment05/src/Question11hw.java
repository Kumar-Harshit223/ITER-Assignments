import java.util.*;
public class Question11hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms of the series to be displayed : ");
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        System.out.println();
        System.out.print( a+" "+b+" ");
        for(int i=3;i<=n;i++) {
        	System.out.print(c+" ");
        	int temp=c;
        	c+=a+b;
        	a=b;
        	b=temp;
        }
        
	}

}
