import java.util.*;
public class Question01hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int n=sc.nextInt();
        int positive=0,negative=0;
        System.out.println("Enter the values ");
        for(int i=1;i<=n;i++) {
        	int x=sc.nextInt();
        	if(x>0)
        		positive++;
        	else
        		negative++;
        }
        System.out.println("Total number of positive values are "+positive);
        System.out.println("Total number of negative values are "+negative);
        sc.close();
	}

}
