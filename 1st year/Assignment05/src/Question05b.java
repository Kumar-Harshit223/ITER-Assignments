import java.util.*;
public class Question05b {
	
	int n;
	
	public static void getN() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
	}
	
    public int getData() {
    	
    	Scanner sc=new Scanner(System.in);
    	getN();
    	int sum=0;
    	System.out.println("Enter the values");
    	if(n>=0) {
    	    for(int i=0;i<n;i++) {
    	    	int x=sc.nextInt();
    	    	sc.next();
    	    	sum+=x;
    	    }
    	}
    	else
    		System.out.println("Invalid input");
    	return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0.0;
		Question05b obj=new Question05b();
		int y=obj.getData();
        if(y!=0) {
        	avg=y*1.0/obj.n;
        }
        System.out.println("Sum ="+y);
        System.out.println("Average ="+avg);
	}

}
