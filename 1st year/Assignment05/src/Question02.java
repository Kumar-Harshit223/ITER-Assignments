import java.util.*;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();
        int pass=0;
        if(n>0&&n<=100) {
        	for(int i=1;i<=n;i++) {
        		System.out.println("Enter the marks:");
        		int mks=sc.nextInt();
        		if(mks<=100) {
        			
        		    if(mks>=40)
        			pass++;
        	        }
        	}
        	System.out.println("No. of students passed = "+pass);
        }
        else
        	System.out.println("The enter value of N is greater than the range.");
        sc.close();
	}

}
