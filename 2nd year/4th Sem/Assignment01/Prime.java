import java.util.*;
public class Prime {
	
	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no : ");
		int x=sc.nextInt();
		System.out.println(x+" is Prime : "+isPrime(x));
	}
	public static boolean isPrime(int x) {
		int i, ctr=0;
		for(i=2;i<=x;i++) {
			if(x%i==0)
				ctr++;
		}
		if(ctr==1)
			return true;
		else
			return false;
	}

}
