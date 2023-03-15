import java.util.*;
public class Question15 {
	
	public int area(int s) {
		int sqr=s*s;
		return sqr;
	}
	public double area(double r) {
		double ca=(22.0/7.0)*(r*r);
		return ca;
	}
	public int area(int l, int b) {
		int ra=l*b;
		return ra;
	}
	public double area(double a, double b, double c) {
		double ts=(a+b+c)/2.0;
		double ar=ts*(ts-a)*(ts-b)*(ts-c);
		double at=Math.sqrt(ar);
		return at;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Question15 obj=new Question15();
        while(true) {
            System.out.println("1. Triangle ");
            System.out.println("2. Square ");
            System.out.println("3. Circle");
            System.out.println("4. Rectangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch){
            case 1 :{
            	System.out.println("TRIANGLE");
            	System.out.print("Enter the sides : ");
            	double a=sc.nextDouble();
            	double b=sc.nextDouble();
            	double c=sc.nextDouble();
            	double ar=obj.area(a, b, c);
            	System.out.println("Area of triangle is "+ar);
            	break;
            }
            case 2:{
            	System.out.println("SQUARE");
            	System.out.print("Enter the side of the square : ");
            	int s=sc.nextInt();
            	int sa=obj.area(s);
            	System.out.println("Area of the square is "+sa);
            	break;
            }
            case 3:{
            	System.out.println("CIRCLE");
            	System.out.print("Enter the radius of the circle : ");
            	double r=sc.nextDouble();
            	double ca=obj.area(r);
            	System.out.println("Area of the circle is "+ca);
            	break;
            }
            case 4:{
            	System.out.println("RECTANGLE");
            	System.out.print("Enter the length and breadth of the rectangle : ");
            	int l=sc.nextInt(), b=sc.nextInt();
            	int ra=obj.area(l, b);
            	System.out.println("Area of the rectangle is "+ra);
            	break;
            }
            case 5:{
            	System.out.println("EXIT");
            	System.out.println("Terminating the code ..");
            	System.exit(0);
            	break;
            }
            }
        }
	}

}
