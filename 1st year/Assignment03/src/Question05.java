import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a, b, and c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double dis=Math.sqrt((Math.pow(b,2)-(4*a*c)));
        if(dis>0)
        {
        	double r1=((-b+dis)/2*a);
        	double r2=((-b-dis)/2*a);
        	System.out.println("The equation has two roots "+r1+" and "+r2);
        }
        else if(dis==0)
        {
        	double r1=((-b+dis)/2*a);
        	System.out.println("The equation has one root "+r1);
        }
        else
        {
        	System.out.println("The equation has no real roots");
        }
	}

}
