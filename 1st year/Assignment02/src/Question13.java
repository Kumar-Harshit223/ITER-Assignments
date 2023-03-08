import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int min=sc.nextInt();
        int dup=min;
        int yrs=min/(365*24*60);
        min=min%(365*24*60);
        int days=min/(24*60);
        System.out.println(dup+" minutes is approximayely "+yrs+" years and "+days+" days");
	}

}
