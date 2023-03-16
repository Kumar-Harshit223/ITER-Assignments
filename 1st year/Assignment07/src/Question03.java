import java.util.*;
public class Question03 {

	public static void main(String[] args) {
		QuadraticEquation obj=new QuadraticEquation();
		obj.getRoot1();
	}

}

class QuadraticEquation{
	
	private double a, b, c;
	
	QuadraticEquation(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a :");
		a=sc.nextDouble();
		System.out.println("Enter b :");
		b=sc.nextDouble();
		System.out.println("Enter c :");
		c=sc.nextDouble();
	}
	double getDiscriminant() {
		double dis=((Math.pow(b,2))-(4*a*c));
		return dis;
	}
	void getRoot1() {
		
		double d=getDiscriminant();
		if(d<0)
			getNoRoot();
		else if(d==0) {
			System.out.println("The equation has one root : ");
			getRoot2();
		}
		else {
			System.out.println("Equation has two roots : ");
			double r1=((-b+d)/(2*a));
			System.out.print(r1+" and ");
		    getRoot2();
		}
		
	}
	void getRoot2() {
		double d=getDiscriminant();
		double r2=((-b-d)/(2*a));
		System.out.print(r2);
	}
	void getNoRoot() {
		System.out.println("The Equation has no roots");
	}
}