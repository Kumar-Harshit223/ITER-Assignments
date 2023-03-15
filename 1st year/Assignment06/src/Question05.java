import java.util.Scanner;

public class Question05 {
	
	public boolean isPrime(int number) {
		
		int c=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0)
				c++;
		}
		if(c==2) {
			return true;	
		}
		else {
			return false;	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Question05 obj=new Question05();
        for(int i=1;i<=1000;i++) {
        	boolean res=obj.isPrime(i);
        	if(res==true) {
                System.out.print(i+" ");
               }
        }
        sc.close();
	}

}
