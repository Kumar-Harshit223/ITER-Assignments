import java.util.*;
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the side: ");
	    double s=sc.nextDouble();
	    double ar=((3*Math.sqrt(3)/2)*(Math.pow(s,2)));
	    System.out.println("The area of the hexagon is "+ar);
	}

}
