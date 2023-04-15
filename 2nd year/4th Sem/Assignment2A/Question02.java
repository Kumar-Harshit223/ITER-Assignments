import java.util.*;
class Student{
	String name;
	int roll;
	int marks;
	
	Student(String name, int roll, int marks){
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
}

public class Question02 {
	
	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> stu=new LinkedList<Student>();
		stu.add(new Student("Steve", 10, 90));
		stu.add(new Student("Rogers", 20, 91));
		stu.add(new Student("Stark", 30, 92));
		stu.add(new Student("Odinson", 40, 93));
		
		System.out.println("List of students : "+stu);
		System.out.println("Enter the name : ");
		String nm=sc.next();
		for(Student i:stu) {
			if(i.name.equals(nm)) {
				System.out.println("Found");
				break;
			}
		}
		System.out.println("List of students : "+stu);
		System.out.println("Enter the name : ");
		String nam=sc.next();
		for(Student i:stu) {
			if(i.name.equals(nam)) {
				stu.remove(i);
				break;
			}
		}
		System.out.println("Length : "+stu.size());
	}

}
