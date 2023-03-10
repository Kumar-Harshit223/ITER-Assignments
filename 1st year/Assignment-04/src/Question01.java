import java.util.*;
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message");
        String str=sc.nextLine();
        for(int i=1;i<=10;i++) {
        	if(i==1)
        		System.out.println(i+"st "+str);
        	else if(i==2)
        	    System.out.println(i+"nd "+str);
        	else if(i==3)
        		System.out.println(i+"rd "+str);
        	else
        		System.out.println(i+"th "+str);
        }
	}

}
