import java.util.*;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter weight in pounds ");
	     double wt=sc.nextDouble();
	     System.out.println("Enter height in inches");
	     double ht=sc.nextDouble();
	     double wtkg=(wt*0.45359237);
	     double htm=(ht*0.0254);
	     double bmi=wtkg/(htm*htm);
	     System.out.println("BMI is "+bmi);
	}

}
