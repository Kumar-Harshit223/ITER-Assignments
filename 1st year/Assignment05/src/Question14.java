import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n : ");
        int num=sc.nextInt();
        System.out.println();
        int n=0,n2=1,n3;
        System.out.println();
        System.out.print(n+" "+n2);
        for(int i=2;i<num;i++) {
        	n3=n+n2;
        	System.out.print(" "+n3);
        	n=n2;
        	n2=n3;
        }
        sc.close();
	}

}
