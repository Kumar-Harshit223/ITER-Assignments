import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	Scanner sc=new Scanner(System.in);
        	double acc=0.000001;
        	System.out.println("Enter the value of n");
        	double n=sc.nextDouble();
        	n=Math.toRadians(n);
        	double csx=1;
        	double x1=1;
        	double cos=Math.cos(n);
        	int i=2;
            do{
                x1=-x1*(n*n)/(i*(i-1));
                csx+=x1;
                i+=2;
            }while(acc<=Math.abs(Math.abs(csx)-Math.abs(cos)));
            System.out.println(csx);
            sc.close();
	}

}
