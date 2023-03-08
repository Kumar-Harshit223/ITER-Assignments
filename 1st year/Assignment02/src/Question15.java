
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        double d=Math.random()*(b-a)+a;
        System.out.println("The random generated number is: "+(int)d);
	}
}
