import java.util.*;
public class Question11 {
    
	public static int count(String str, char a) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==a)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		str=str.trim();
		System.out.print("Enter the charcter : ");
		char a=sc.next().charAt(0);
		int r=count(str,a);
		System.out.printf("The character '"+a+"' appears "+r+" times in the string "+str);
		sc.close();
	}

}
