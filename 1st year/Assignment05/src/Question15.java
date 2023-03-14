import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amt=sc.nextDouble();
        System.out.print("Enter the number of months : ");
        int time=sc.nextInt();
        System.out.print("Enter the yearly intrest rate");
        double inst=sc.nextDouble();
        double minst=(inst*0.01)/12;
        double total=0;
        for(int i=1;i<=time;i++) {
        	total=((total+amt)*(1+minst));
        }
        System.out.println("Total amount after "+time+" month is "+total);
        sc.close();
	}

}
