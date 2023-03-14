import java.util.*;
public class Question06hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n=sc.nextInt();
        int p=1;
        boolean res=false;
        for(int i=1;i<=n;i++) {
        	p*=i;
        	if(p==n) {
        		res=true;
        		break;
        	}
        	if(p>n)
        		break;
        }
        System.out.println(n+" is a factorial number : "+res);
	}

}
