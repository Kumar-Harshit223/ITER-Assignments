import java.util.*;
public class BinaryOfDecimal {
	
	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no:");
		int x=sc.nextInt();
		System.out.println("The binary of "+x+" is "+decToBin(x));
	}
	public static String decToBin(int x) {
		String str="";
		int y=x;
		while(y!=0) {
			int c=y%2;
			str=c+str;
			y=y/2;
		}
		return str;
	}
}
