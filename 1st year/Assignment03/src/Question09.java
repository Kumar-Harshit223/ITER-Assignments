import java.util.*;
public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int ran=(int)(Math.random()*(12))+1;
        if(ran==1)
        	System.out.println("January");
        else if(ran==2)
        	System.out.println("Febuary");
        else if(ran==3)
        	System.out.println("March");
        else if(ran==4)
        	System.out.println("April");
        else if(ran==5)
        	System.out.println("May");
        else if(ran==6)
        	System.out.println("June");
        else if(ran==7)
        	System.out.println("July");
        else if(ran==8)
        	System.out.println("August");
        else if(ran==9)
        	System.out.println("September");
        else if(ran==10)
        	System.out.println("October");
        else if(ran==11)
        	System.out.println("November");
        else
        	System.out.println("December");
	}

}
