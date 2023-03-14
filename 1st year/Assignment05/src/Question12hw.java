import java.util.*;
public class Question12hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of D and E : ");
        int d=sc.nextInt();
        int e=sc.nextInt();
        boolean res=false;
        int a=0,b=1;
        int dup=b;
        System.out.println();
        for(int i=1;i<=e;i++) {
        	if((d==a)&&(e==b)) {
        		res=true;
        		break;
        	}
        	int temp=b;
        	b=a+b;
        	a=temp;
        }
        System.out.println("The two values "+d+" and "+e+" are the two consecutive members of the fibonacci series : "+res);
	}

}
