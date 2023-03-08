import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks ");
        int mks=sc.nextInt();
        switch(mks/10) {
        case 10:
        	System.out.println("O");
        	break;
        case 9:
        	System.out.println("O");
        	break;
        case 8:
        	System.out.println("A");
        	break;
        case 7:
        	System.out.println("B");
        	break;
        case 6:
        	System.out.println("C");
        	break;
        case 5:
        	System.out.println("D");
        	break;
        case 4:
        	System.out.println("E");
        	break;
        case 3:
        	System.out.println("F");
        	break;
        default:
            System.out.println("F");
        }
        sc.close();
	}

}
