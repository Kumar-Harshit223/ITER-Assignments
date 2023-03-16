import java.util.*;
public class Question01 {

}

class Student{
	
	//instance variable
	String name;
	double roll;
	int marks;
	
	//instance methods
	void setData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter roll no. : ");
		roll=sc.nextDouble();
		System.out.println("Enter marks : ");
		marks=sc.nextInt();
	}
	void display() {
		System.out.printf("The name of the student %s with roll no. %.0f has got %d marks .\n",name,roll,marks);
	}
	
}

class StudentDetails{
	
	public static void main(String[] args) {
		
		//object creation
		Student obj1=new Student();
		Student obj2=new Student();
		Student obj3=new Student();
		System.out.println("Details of Student 1 : ");
		obj1.setData();
		System.out.println("Details of Student 2 : ");
		obj2.setData();
		System.out.println("Details of Student 3 : ");
		obj3.setData();
		
		//display
		obj1.display();
		obj2.display();
		obj3.display();
	}
}