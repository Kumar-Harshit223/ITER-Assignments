import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Count from :");
        int x=sc.nextInt();
        System.out.println("Count to :");
        int y=sc.nextInt();
        System.out.println("Count by :");
        int z=sc.nextInt();
        for(int i=x;i<=y;i=i+z)
        	System.out.print(i+" ");
	}

}
