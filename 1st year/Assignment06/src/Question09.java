import java.util.*;
public class Question09 {

	public static int sumNumerator(int a, int b, int c, int d) {
		
		int sum1=((a*d)+(c*b));
		return sum1;
	}
	
	public static int sumDenominator(int b, int d) {
		
		int sum2=(b*d);
		return sum2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a/b, c/d : ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
        int num=sumNumerator(a,b,c,d);
        int dnum=sumDenominator(b,d);
        int minimum=Integer.min(num,dnum);
        for(int i=1;i<=minimum;i++) {
        	if((num%i==0)&&(dnum%i==0)) {
        		num=num/i;
        		dnum=dnum/i;
        	}
        }
        System.out.printf("The sum of %d/%d and %d/%d is : %d/%d ",a,b,c,d,num,dnum);
        sc.close();
	}

}
