import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z')
            System.out.println("The character is in UpperCase");
        else if(ch>='a'&&ch<='z')
        	System.out.println("The character is in LowerCase");
        else if((ch>=0&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=127))
        	System.out.println("The character is a special symbol");
	}

}
