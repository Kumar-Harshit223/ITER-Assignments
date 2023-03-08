
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double t,p,r,pay;
        t=Double.parseDouble(args[0]);
        p=Double.parseDouble(args[1]);
        r=Double.parseDouble(args[2]);
        pay=p*Math.exp(r*t);
        System.out.println(pay);
	}

}
