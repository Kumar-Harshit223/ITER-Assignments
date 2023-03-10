import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int x=sc.nextInt();
        int c=0;
        for(int i=1;i<=x;i++) {
        	int r=(int)(Math.pow(2, i));
        	if(r>x) {
        		c=i;
        		break;
        	}
        }
        if(Math.pow(2, c)==x)
            System.out.println("The largest power of 2 less than or equal to x is :"+(Math.pow(2, c)));
        else
        	System.out.println("The largest power of 2 less than or equal to x is :"+(Math.pow(2, (c-1))));
        sc.close();
	}

}
