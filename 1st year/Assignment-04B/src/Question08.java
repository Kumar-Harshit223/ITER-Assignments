import java.util.Scanner;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int x=sc.nextInt();
        int y=x;
        int s=0;
        while(y!=0) {
        	int r=y%10;
        	s=s+r;
        	y=y/10;
        }
        if(s%9==0)
            System.out.println(x+" is divisible by 9");
        else
        	System.out.println(x+" is not ivisible by 9");
        sc.close();
	}

}
