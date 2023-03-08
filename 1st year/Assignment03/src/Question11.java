import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in kg:");
        double wt=sc.nextDouble();
        System.out.println("Enter the height in mt");
        double ht=sc.nextDouble();
        double bmi=wt/(Math.pow(ht,2));
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi>=18.5&&bmi<=24.9)
			System.out.println("Normal weight");
		else if(bmi>=25.0&&bmi<=29.9)
			System.out.println("Over weight");
		else
			System.out.println("Obese");
	}

}
