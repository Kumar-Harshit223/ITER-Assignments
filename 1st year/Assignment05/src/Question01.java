import java.util.*;
public class Question01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        System.out.println("");
        System.out.println("");
        for(int i=0;i<=n;i++) {
        	System.out.print(i+"   "+(int)(Math.pow(2, i)));
        	System.out.println("");
        }
        sc.close();
	}

}
