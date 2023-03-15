import java.util.*;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Question03 obj=new Question03();
        Question05 obj2=new Question05();
        int c=0;
        for(int  i=1;i>=1;i++) {
            boolean res1=obj.isPalindrome(i);
            boolean res2=obj2.isPrime(i);
            if(res1&&res2) {
        	    System.out.print(i+" ");
        	    c++;
        	    if(c%10==0)
        	    	System.out.println();
        	    }
            if(c==100)
            	break;
        }
	}

}
