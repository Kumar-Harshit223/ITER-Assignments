import java.util.*;
public class Question04 {

	public static double min(double array[]) {
		double mini=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<mini)
				mini=array[i];
		}
		return mini;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Question04 obj=new Question04();
        double arr[]=new double[10];
        System.out.println("Enter 10 elements : ");
        for(int i=0;i<10;i++) {
        	arr[i]=sc.nextDouble();
        }
        double mini=obj.min(arr);
        System.out.println("The minimum number is : "+mini);
	}

}
