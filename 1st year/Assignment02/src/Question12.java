import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the total number of eggs");
         int num=sc.nextInt();
         int gross=num/144;
         num=num%144;
         int doz=num/12;
         num=num%12;
         int left =num;
         System.out.println("Your numbef of eggs is "+gross+" gross ,"+doz+" dozen ,and "+left);
	}

}