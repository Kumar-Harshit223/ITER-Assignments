
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int a=0;
        for(int i=1;i<=100;i++) {
        	s=s+(i*i);
        	a=a+i;
        }
        System.out.println("The sum of squares of the first hundred natural numbers is, "+s);
        System.out.println("The squares of the sum of the first hundred natural numbers is, "+(Math.pow(a, 2)));
        System.out.println("Hence, the difference between the sum of the squares of the squares of the first hundred natural numbers and the square of the sum is "+((Math.pow(a, 2))-s));
	}

}
