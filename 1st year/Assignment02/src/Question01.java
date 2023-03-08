import java.util.*; 
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");
        double cels=sc.nextDouble();
        double far=(9.0/5)*cels+32; 
        System.out.println(cels+" Celsius is "+far+" in fahrenheit");
	}

}
