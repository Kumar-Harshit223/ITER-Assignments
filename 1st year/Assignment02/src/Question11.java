import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double amt=sc.nextDouble();
        System.out.println("Enter annual intrest rate in percentage: ");
        double inst=sc.nextDouble();
        System.out.println("Enter number of years: ");
        double yrs=sc.nextDouble();
        double minst=(inst/12);
        double futinvstval=amt*Math.pow((1 + (inst/100)/12),yrs*12);
        System.out.println("accumulated value is $"+futinvstval);
	}
}
