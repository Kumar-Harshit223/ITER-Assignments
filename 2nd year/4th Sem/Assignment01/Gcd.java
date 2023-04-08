
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=60;
		int num2=36;
		System.out.println("GCD of "+num1+" and "+num2+" is : "+GCD(num1, num2));
	}
	public static int GCD(int m, int n) {
		if (m < n) {
		return (GCD(n, m));
		}
		if (m % n == 0) {
		return (n);
		}
		return (GCD(n, m % n));
	}
}
