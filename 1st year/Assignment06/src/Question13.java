import java.util.*;
public class Question13 {
	
	public static boolean isPalindrome(String str) {
		String stri="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			stri=stri+ch;
		}
		if(str.equals(stri))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        str=str.trim();
        boolean res=isPalindrome(str);
        System.out.println("The string "+str+" is Palindrome : "+res);
        sc.close();
	}

}
