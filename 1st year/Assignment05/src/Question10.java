import java.util.*;
import java.lang.Math;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated; method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x=sc.nextDouble();
        double acc=0.000001;
        x=Math.toRadians(x);
        double sin=Math.sin(x);
        double snx=0;
        int i=1;
        int count=1;
        double d,x1;
        do {
        	d=1;
        	for(int j=1;j<=i;j++) {
        		d*=j;
        	}
        	x1=Math.pow(x,i)*Math.pow(-1,count+1)/d;
        	snx+=x1;
        	count++;
        	i+=2;
        }
        while(acc<=Math.abs(Math.abs(sin)-Math.abs(snx)));
        System.out.println(snx);
        sc.close();
	}
}
