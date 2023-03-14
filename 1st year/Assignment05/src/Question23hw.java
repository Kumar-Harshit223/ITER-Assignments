import java.util.*;

public class Question23hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term : ");
        int t=sc.nextInt();
        if(t==1)
        	System.out.println(0);
        int a=0,b=1;
        for(int i=2;i<=t;i++) {
        	if(i==t)
        		System.out.println(b);
        	int temp=b;
        	b+=a;
        	a=temp;
        }
	}

}
