import java.util.*;
public class Question02 {
    
	public static int getPentagonalNumber(int n) {
		int r=n*((3*n)-1)/2;
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("The first 100 pentagonal numbers are : ");
        int c=0;
        for(int i=1;i<=100;i++) {
        	int r=getPentagonalNumber(i);
        	c++;
        	System.out.print(r+" ");
        	if(c%10==0)
        		System.out.println();
        	sc.close();
        }
	}

}
