
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x,y,z;
        x=Double.parseDouble(args[0]);
        y=Double.parseDouble(args[1]);
        z=Double.parseDouble(args[2]);
        System.out.println((x>y&&y>z)||(x<y&&y<z));
	}

}
