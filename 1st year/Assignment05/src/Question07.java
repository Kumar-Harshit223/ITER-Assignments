import java.util.*;
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int c=1;
        int sum=0;
        for(int i=1;i<=n;i=i+2) {
        	if(c%2==0) {
        		sum=sum+(-1*i);
        		c++;
        		}
        	else {
        		sum=sum+i;
        		c++;
        		}
        }
        System.out.println("Sum: "+sum);
        sc.close();
	}

}
