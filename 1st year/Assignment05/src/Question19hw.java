import java.util.*;
public class Question19hw {
	
    public static void main(String[] args) {
    	
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a= sc.nextInt(),b= sc.nextInt();
        int min=Integer.min(a,b);
        int max=a+b-min,temp=0;
        //min and going down
        for(int i=min;i>=1;i--){
            //1 to max to find if divisible by i
            for(int j=1;j<=max;j++) {
                //break if ixj>max
                if (i*j>max) break;
                //for i*j==max(condition upper)
                else if (j * i == max) {
                    //condition lower
                    for(int k=1;k<=min;k++){
                        if (i*k>max) break;
                        //printing
                        if(i*k==min){
                            System.out.println(i); temp=k; break;
                        }}}
                //terminate from j loop
                if(i*temp==min)break;}
            //terminate for good
            if(i*temp==min)break;
    }}}
