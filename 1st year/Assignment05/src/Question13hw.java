import java.util.*;
public class Question13hw {            //refer q14 for q13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of the integer : ");
        int num=sc.nextInt();
        int count=0;
        int dup=num;
        while(dup!=0) {
        	int r=dup%10;
        	count++;
        	dup=dup/10;
        }
        System.out.println("The number of digits in "+num+" is "+count);
	}

}
