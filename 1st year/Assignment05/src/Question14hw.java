import java.util.*;
public class Question14hw {         //refer q13 for q14

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int start=(num-2),end=(start-1),p1=1,p2=1;
        for(int i=1;i<=start;i++)
        	p1*=i;
        for(int i=1;i<=end;i++)
        	p2*=i;
        System.out.println("f-"+num+" = "+(p1+p2));
	}

}
