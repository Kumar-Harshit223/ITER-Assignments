import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int sum=0;
        double avg=0.0;
        System.out.println("Enter the values");
        if(n>=0) {
        	for(int i=1;i<=n;i++) {
        		int x=sc.nextInt();
        		sum=sum+x;
        	}
        }
        else
        	System.out.println("Invalid input");
        avg=sum*1.0/n*1.0;
        System.out.println("SUM :"+sum);
        System.out.println("AVERAGE :"+avg);
        sc.close();
	}

}
