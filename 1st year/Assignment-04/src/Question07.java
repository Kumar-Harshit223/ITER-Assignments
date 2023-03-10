
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        n=Integer.parseInt(args[0]);
        double s=0;
        for(int i=0;i<n;i++) {
        	s=s+Math.random();
        }
        s=s/n;
        System.out.println("Average value is "+s);
	}
}
