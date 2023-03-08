import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the points with two co-ordinates :");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double dis=Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
        if(dis<=10)
        	System.out.println("Point ("+x+", "+y+") is in the circle ");
        else
        	System.out.println("Point ("+x+", "+y+") is not in the circle");
        sc.close();
	}

}
