import java.util.*;
public class Question07 {
	
	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using HashSet so that no duplicate elements are there....
		
		HashSet<String> hSstr=new HashSet<String>();
		System.out.println("Enter the value of N for inputs : ");
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			String str=sc.next();
			hSstr.add(str);
		} 
		
		System.out.println(hSstr);
	}

}
