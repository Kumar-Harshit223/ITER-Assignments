import java.util.*;
public class Question03 {

	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		int x=sc.nextInt();
		System.out.println(decToBin(x));
	}
	public static String decToBin(int x) {
		String stri="";
		Stack<Integer> str=new Stack<Integer>();
		while(x!=0) {
			int r=x%2;
			str.push(r);
			x=x/2;
		}
		for(int i=str.size()-1;i>=0;i--) {
			stri=stri+str.pop();
		}
		return stri;
	}
}
