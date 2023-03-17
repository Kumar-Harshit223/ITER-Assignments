import java.util.*;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        for(int i=0;i<100;i++) {
        	arr[i]=i+1;
        }
        int ary[]=new int[100];
        for(int i=0;i<100;i++) {
        	ary[i]=0;
        }
        System.out.println("Enter the integers between 1 and 100 : ");
        for(int i=0;i>=0;i++) {
        	int x=sc.nextInt();
        	if(x==0)
        		break;
        	else {
        		
        	   }
        	   for(int j=0;j<100;j++) {
        		   if(x==arr[j])
        			   ary[j]++;
        	}
        }
        for(int i=0;i<100;i++) {
        	if(ary[i]>0) {
        		if(ary[i]>1)
        			System.out.println(arr[i]+" occurs "+ary[i]+" times");
        		else
        			System.out.println(arr[i]+" occurs "+ary[i]+" time");
        	}
        }
	}

}
