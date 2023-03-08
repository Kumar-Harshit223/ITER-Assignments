
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double bs,da,hra,gross;
        bs=Double.parseDouble(args[0]);
        da=bs*(0.40);
        hra=bs*(0.20);
        gross=bs+da+hra;
        System.out.println("Gross salary is: Rs"+gross);
	}

}
