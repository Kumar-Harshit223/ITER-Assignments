import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        String binary="";
        int x=n;    //duplicate variable
        while(x!=0) {
        	int r=x%2;
        	binary+=r;
        	x=x/2;
        }
        System.out.println("The binary representation of "+n+" is "+binary);
        
        // method 2
         binary=Integer.toBinaryString(n);
         System.out.println(binary+" using method 2");
        sc.close();
	}

}
