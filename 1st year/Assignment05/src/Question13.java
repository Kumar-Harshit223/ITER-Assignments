import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms of the fibonaciii series..");
        int num=sc.nextInt();
        int n=0,n2=1,n3;
        System.out.println();
        System.out.print(n+" "+n2);
        for(int i=2;i<num;i++) {
        	n3=n+n2;
        	System.out.print(" "+n3);
        	n=n2;
        	n2=n3;
        }
        sc.close();
	}

}
