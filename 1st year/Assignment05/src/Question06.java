import java.util.*;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++) {
        	sum=sum+(1.0/i);
        }
        double H=n*1.0/(sum);
        System.out.println(H);
        sc.close();
	}

}
