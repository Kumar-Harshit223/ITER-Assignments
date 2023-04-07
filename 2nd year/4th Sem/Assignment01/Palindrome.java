import java.util.*;
public class Palindrome {
	
	final static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no:");
		int x=sc.nextInt();
		System.out.println("The reverse if "+x+" is "+reverse(x));
	}
	public static int reverse(int x) {
		int y=0;
		while(x!=0) {
			int c=x%10;
			y=(y*10)+c;
			x=x/10;
		}
		return y;
	}

}
