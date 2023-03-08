import java.util.*;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Rahul, Ayush, Ajay");
        int ra=sc.nextInt();
        int ay=sc.nextInt();
        int aj=sc.nextInt();
        if(ra>ay&&ra>aj)
        	System.out.println("Rahul is the eldest");
        else if(ay>ra&&ay>aj)
        	System.out.println("Ayush is the eldest");
        else
        	System.out.println("Ajay is thhe eldest");
	}

}
