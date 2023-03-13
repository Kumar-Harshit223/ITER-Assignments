import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int s=0;
        int p=1;
        for(int i=0;i<=n;i++) {
        	if(i%2==0)
        		s=s+i;
        	else
        		p=p*i;
        }
        System.out.println("Sum of all even numbers ="+s);
        System.out.println("Product of all oddnumbers are ="+p);
        sc.close();
	}

}
