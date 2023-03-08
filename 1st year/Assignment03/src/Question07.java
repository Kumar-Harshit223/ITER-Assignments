import java.util.*;
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the co-ordinates of x and y");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x==0)
        	System.out.println("("+x+","+y+") is on y-axis");
        else if(y==0)
        	System.out.println("("+x+","+y+") is on y-axis");
        else if(x>0&&y>0)
        	System.out.println("("+x+","+y+") is in first quadrant");
        else if(x<0&&y>0)
        	System.out.println("("+x+","+y+") is in second quadrant");
        else if(x<0&&y<0)
        	System.out.println("("+x+","+y+") is in third quadrant");
        else
        	System.out.println("("+x+","+y+") is in fourth quadrant");
	}

}
