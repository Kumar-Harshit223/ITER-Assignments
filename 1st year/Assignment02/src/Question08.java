import java.util.*;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("a \t b \t pow(a, b)");
		int a = 1;
		int b = a + 1;

		System.out.println(a+"\t "+b+"\t "+(int)Math.pow(a, b));
		System.out.println(++ a + "\t " + ++b + "\t "+(int)Math.pow(a, b));
		System.out.println(++ a + "\t " + ++b + "\t "+(int)Math.pow(a, b));
		System.out.println(++ a + "\t " + ++b + "\t "+(int)Math.pow(a, b));
		System.out.println(++ a + "\t " + ++b + "\t "+(int)Math.pow(a, b));
	}

}
