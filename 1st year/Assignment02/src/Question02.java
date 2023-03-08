import java.util.*;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the radius and length of the cylinder");
	       double rad=sc.nextDouble();
	       double lt=sc.nextDouble();
	       double area=rad*rad*(3.14);
	       double vol=area*lt;
	       System.out.println("Area of cylinder is "+area);
	       System.out.println("Volume of cylinder is "+vol);
	}

}
