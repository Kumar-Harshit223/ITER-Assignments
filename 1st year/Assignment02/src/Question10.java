import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the co-ordintate of A ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter the co-ordintate of B ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        System.out.println("Enter the co-ordintate of C ");
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        double s1=((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
        s1=Math.sqrt(s1);
        double s2=((Math.pow((x3-x2), 2))+(Math.pow((y3-y2), 2)));
        s2=Math.sqrt(s2);
        double s3=((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
        s3=Math.sqrt(s3);
        double s=((s1+s2+s3)/2);
        double area=s*(s-s1)*(s-s2)*(s-s3);
        area=Math.sqrt(area);
        System.out.println("The area of the triangle is "+area);
	}

}
