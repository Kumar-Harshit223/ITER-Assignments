import java.util.*;
public class Question01 {

	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(20);
		al.add(60);
		al.add(32);
		System.out.println("list : "+al);
		System.out.println("Enter the element to search : ");
		int x=sc.nextInt();
		int res=al.indexOf(x);
		if(res!=-1)
			System.out.println("Index of "+x+" is "+res);
		else
			System.out.println("Element not present");
		System.out.println("Index to remove element from : ");
		int y=sc.nextInt();
		al.remove(y);
		System.out.println(al);
		boolean emty=al.isEmpty();
		System.out.println("Is the arrayList empty : "+emty);
	}

}
