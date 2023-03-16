import java.util.*;

public class Question02 {
	
	public static void main(String[] args) {
	    
		Rectangle obj=new Rectangle();
		Rectangle obj2=new Rectangle();
		System.out.println("Recatngle 1 : ");
		obj.Rectangle();
		System.out.println("Rectangle 2 : ");
		obj2.Rectangle();
		double ar1=obj.getArea();
		double pm1=obj.getPerimeter();
		double ar2=obj2.getArea();
		double pm2=obj2.getPerimeter();
		System.out.println("Area of 1st rectangle is "+ar1+" and its perimeter is "+pm1);
		System.out.println("Area of 2nd rectangle is "+ar2+" and its perimeter is "+pm2);
	}
}

class Rectangle{
	
	//data members
	double width;
	double height;
	
	//member methods
	Rectangle(){
		width=1.0;
		height=1.0;
	}
	void Rectangle() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Width : ");
		width=sc.nextDouble();
		System.out.println("Enter the height : ");
		height=sc.nextDouble();
	}
	
	double getArea() {
		
		double area=width*height;
		return area;
	}
	
	double getPerimeter() {
		
		double perimeter=2*(height+width);
		return perimeter;
	}
}
