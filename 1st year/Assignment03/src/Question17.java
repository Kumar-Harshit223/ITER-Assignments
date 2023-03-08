import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer :");
        int x=sc.nextInt();
        boolean res5=(x%5==0);
        boolean res6=(x%6==0);
        	System.out.println("Is"+x+" divisible by 5 and 6? "+(res5&&res6));
        	System.out.println("Is"+x+" divisible by 5 or 6? "+(res5||res6));
        	System.out.println("is"+x+" divisible by 5 or 6, but not both? "+((res5&&res6)||(res5||res6)));
	sc.close();
	}

}
