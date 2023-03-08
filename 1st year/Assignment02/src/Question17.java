
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c;
        a=Integer.parseInt(args[0]); 
        b=Integer.parseInt(args[1]); 
        c=Integer.parseInt(args[2]); 
        System.out.println(a>b+c||b>a+c||c>b+c);
	}

}
