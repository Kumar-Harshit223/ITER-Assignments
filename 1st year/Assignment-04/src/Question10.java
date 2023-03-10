import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. for which you want to find the multiplication table: ");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++) {
        	System.out.println(x+"X"+i+"="+(x*i));
        }
	}

}
