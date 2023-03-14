import java.util.*;
public class Question22hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x and n : ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        if(x>1) {
              System.out.println("Result : "+(Math.pow(x, n)));
        }
        else
        	System.out.println("Wrong input!!");
	}

}
