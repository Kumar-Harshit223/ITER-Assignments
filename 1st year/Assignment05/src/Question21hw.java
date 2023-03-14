import java.util.*;
public class Question21hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int i;
        int a=(x>y)?x:y;
        for(i=a;i<=x*y;i=i+a) {
        	if(i%x==0&&i%y==0)
        		break;
        }
        System.out.println("LCM of "+x+" and "+y+" is "+i);
	}

}
