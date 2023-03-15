import java.util.*;
public class Question14 {

	public static boolean rule1(String str) {
		int l=str.length();
		if(l>=8)
			return true;
		else
			return false;
	}
	public static boolean rule2(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57));
			else
				c=1;
		}
		if(c==0)
			return true;
		else
			return false;
	}
	public static boolean rule3(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=48&&ch<=57)
				c++;
		}
		if(c>=2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password : ");
        String str=sc.nextLine();
        str=str.trim();
        boolean res1=rule1(str);
        boolean res2=rule2(str);
        boolean res3=rule3(str);
        boolean res=(res1&&res2&&res3);
        if(res==true)
        	System.out.println("Password is Valid");
        else
        	System.out.println("Password is Invalid");
        sc.close();
        		
	}

}
