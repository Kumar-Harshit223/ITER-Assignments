import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the three numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a<b&&a<c){
    	   System.out.print(a+" ");
    	   if(b<c)
    		   System.out.print(b+" "+c);
    	   else
    		   System.out.print(c+" "+b);
       }
       else if(b<a&&b<c){
    	   System.out.print(b+" ");
    	   if(a<c)
    		   System.out.print(a+" "+c);
    	   else
    		   System.out.print(c+" "+a);
       }
       else{
    	   System.out.println(c+" ");
    	   if(a<b)
    		   System.out.print(a+" "+b);
    	   else
    		   System.out.print(b+" "+a);
       }
       sc.close();
	}

}
