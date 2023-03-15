import java.util.*;
public class Question04 {
	
	public static int numberOfDaysInAYear(int year) {
		if(year%4==0)
			return 366;
		else
			return 365;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year between 2000 and 2020 : ");
        int yr=sc.nextInt();
        int s=numberOfDaysInAYear(yr);
        System.out.println();
        System.out.printf("Number of days in %d is %s",yr,s);
        sc.close();
	}

}
