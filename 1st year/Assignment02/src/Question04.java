import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number between 0 and 1000");
	      int num=sc.nextInt();
	      int x=num;
	      int s=0;
	      int dig1=x%10;
	      s=s+dig1;
	      x=x/10;
	      int dig2=x%10;
	      s=s+dig2;
	      x=x/10;
	      int dig3=x%10;
	      s=s+dig3;
	      x=x/10;
	      int dig4=x%10;
	      s=s+dig4;
	      x=x/10;
	      System.out.println("Sum of digits of "+num+" is "+s);
	}

}
