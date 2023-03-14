import java.util.*;
public class Question15hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of the integer : ");
        int num=sc.nextInt();
        int s=0,dup=num;
        while(dup!=0) {
        	int r=dup%10;
        	s+=r;
        	dup=dup/10;
        }
        System.out.println("The sum of the digits of "+num+" is "+s);
	}

}
