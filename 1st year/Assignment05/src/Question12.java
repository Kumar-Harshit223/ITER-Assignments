import java.util.*;
public class Question12 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x=sc.nextDouble();
        double x1=1,exe=1;
        for(int i=1;i<4*x;i++) {
        	x1*=x/i;
        	exe+=x1;
        }
        System.out.println(exe);
        sc.close();
	}

}
