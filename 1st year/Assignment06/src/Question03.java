import java.util.*;
public class Question03 {
	
	public static int reverse(int number) {
		int s=0;
		while(number!=0) {
			int r=number%10;
			s=(s*10)+r;
			number=number/10;
		}
		return s;
	}
	 
	public static boolean isPalindrome(int number) {
		
		int s=reverse(number);
		if(s==number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        boolean res=isPalindrome(num);
        System.out.println(num+" is a Palindrome number : "+res);
        sc.close();
	}

}
