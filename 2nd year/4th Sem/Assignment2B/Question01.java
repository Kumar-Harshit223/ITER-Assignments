import java.util.*;
public class Question01 {

	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(60);
		tree.add(40);
		System.out.println("Tree : "+tree);
		System.out.println("Enter the number to search : ");
		int x=sc.nextInt();
		System.out.println("TreeSet contains "+x+" is : "+tree.contains(x));
		tree.remove(60);
		System.out.println("New Tree : "+tree);
	}

}
