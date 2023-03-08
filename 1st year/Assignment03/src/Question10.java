import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter today's day:");
        int day=sc.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int elps=sc.nextInt();
        elps=elps%7;
        int newday=day+elps;
        if(newday==0)
        	System.out.println("SUNDAY");
        else if(newday==1)
        	System.out.println("MONDAY");
        else if(newday==2)
        	System.out.println("TUESDAY");
        else if(newday==3)
        	System.out.println("WEDNESDAY");
        else if(newday==4)
        	System.out.println("THURSDAY");
        else if(newday==5)
        	System.out.println("FRIDAY");
        else
        	System.out.println("SATURDAY");
	}

}
