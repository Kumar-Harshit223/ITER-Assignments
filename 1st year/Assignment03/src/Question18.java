import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gender (M or F): ");
        char gen=sc.next().charAt(0);
        sc.nextLine();
        System.out.println("First name ");
        String name=sc.nextLine();
        System.out.println("Last name ");
        String lname=sc.nextLine();
        System.out.println("Age ");
        int age=sc.nextInt();
        if(gen=='F'||gen=='f') {
        	if(age>=20) {
        		System.out.println("Are you married, "+name+" (y or n)? ");
        		char chk=sc.next().charAt(0);
        		if(chk=='y'||chk=='Y')
        			System.out.println("Then I shall call you Mrs. "+name+" "+lname);
        		else
        			System.out.println("Then I sall call you Ms. "+name+" "+lname);
        	}
        	else
        		System.out.println("Then I shall call you "+name+" "+lname);
        }
        else if(gen=='M'||gen=='m') {
        	if(age>=20)
        		System.out.println("Then I shall call you Mr. "+name+" "+lname);
        	else
        		System.out.println("Then I shall call you "+name+" "+lname);
        }
        else
        	System.out.println("Wrong input");
	}

}
