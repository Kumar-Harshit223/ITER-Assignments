import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int dup=num;   //duplicate
        int i=2;
        while(dup!=0){
        	if(dup%i==0) {
        		System.out.print(i+" ");
        		dup=dup/i;
        		i=2;
        	}
        	else
        	    i++;
        }
        sc.close();
	}

}
