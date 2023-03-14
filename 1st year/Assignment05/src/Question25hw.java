import java.util.*;
public class Question25hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sa=0,sb=0;
        for(int i=1;i<a;i++) {
        	if(a%i==0) {
        		sa+=i;}
        }
        for(int i=1;i<b;i++) {
        	if(b%i==0) {
        		sb+=i;}
        }
        if((sa==b)&&(sb==a))
        	System.out.println(a+" and "+b+" are amicable numbers");
        else
        	System.out.println(a+" and "+b+" are not ambicable numbers");
	}

}
