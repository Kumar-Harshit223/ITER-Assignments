import java.util.*;
public class Question05hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        double fac=1;
        for(int i=1;i<=n;i++) {
        	fac*=i;
        }
        double res=(1.0/fac);
        System.out.println(res);
	}

}
