import java.util.*;
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of the person");
        double ht=sc.nextDouble();
        if(ht>=6.0)
        	System.out.println("The person is tall");
        else 
        	System.out.println("The person is not tall");
	}

}
