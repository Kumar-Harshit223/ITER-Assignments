import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        double n,x1=1,x2=0,root=0;
        System.out.print("Enter n: ");
        n= sc.nextDouble();
        int count=1;
        while(true){
            x2=x1-(x1*x1-n)/(2*x1);
            x1=x2;
            if(Math.abs(x1-root)<=0.00001) break;
            root=x1;
            count++;
        }
        System.out.println(x1);
        System.out.println("And number of steps: "+count);
        sc.close();
	}

}
