import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month");
        int mth=sc.nextInt();
        System.out.println("Enter the year");
        int yr=sc.nextInt();
        if(mth==1)
        	System.out.println("January "+yr+" had 31 days");
        else if(mth==2){
        	if((yr%4==0)&&((yr%400==0)||(yr%100!=0)))
        		System.out.println("Febuary "+yr+" had 29 days");
        	else
        		System.out.println("Febuary "+yr+" had 28 days");
        }
        else if(mth==3)
            System.out.println("March "+yr+" had 31 days");
        else if(mth==4)
        	System.out.println("April "+yr+" had 30 days");
        else if(mth==5)
        	System.out.println("May "+yr+" had 31 days");
        else if(mth==6)
        	System.out.println("June "+yr+" had 30 days");
        else if(mth==7)
        	System.out.println("July "+yr+" had 31 days");
        else if(mth==8)
        	System.out.println("August "+yr+" had 31 days");
        else if(mth==9)
        	System.out.println("September "+yr+" hd 30 days");
        else if(mth==10)
        	System.out.println("October "+yr+" had 31 days");
        else if(mth==11)
        	System.out.println("November "+yr+" had 30 days");
        else if(mth==12)
        	System.out.println("December "+yr+" had 31 days");
        else
        	System.out.println("Wrong input");
        sc.close();
	}

}
