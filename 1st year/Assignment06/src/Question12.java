import java.util.*;
public class Question12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Question11 obj=new Question11();
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        str=str.trim();
        String vow="aeiouAEIOU";
        int sum=0;
        for(int i=0;i<vow.length();i++) {
        	char ch=vow.charAt(i);
        	int r=obj.count(str, ch);
        	sum+=r;
        	if(r!=0) {
        	   System.out.println("Character "+ch+" appears "+r+" times in the String "+str);
        	}
        }
        System.out.println("Total no. of vowels in the string "+str+" is "+sum);
        sc.close();
	}

}
