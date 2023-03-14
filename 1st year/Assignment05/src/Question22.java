import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int c=0;         //counter
        for(int i=1;i<=num;i++) {
        	if(num%i==0)
        		c++;
        }
        if(c==2)  	
           System.out.println(num+" is a prime number");
        else
        	System.out.println(num+" is not a prime number");
        sc.close();
	}

}
