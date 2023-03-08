import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter v0, v1, and t:");
        float v0=sc.nextFloat();
        float v1=sc.nextFloat();
        float t=sc.nextFloat();
        System.out.println();
        float a=((v1-v0)/t);
        System.out.println("The average acceleration is "+a);
	}

}
