import java.util.*;
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 elements in the array : ");
        for(int i=0;i<10;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<10;i++) {
        	if(arr[i]==s)
        		c++;
        }
        if(c>0)
        	System.out.println("The element "+s+" is present in the array "+c+" times");
        else
        	System.out.println("The element "+s+" is not prsent in the array");
	}

}
