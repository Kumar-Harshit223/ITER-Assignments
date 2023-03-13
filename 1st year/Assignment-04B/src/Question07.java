
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int s=0;
        int ss=0;
        for(int i=1;i<=10;i++) {
        	ss=ss+i;
        	s=s+((int)(Math.pow(i,2)));
        }
        int r=(int)(Math.pow(ss,2));
        System.out.println("Sum of squares of the first ten natural numbers is "+s);
        System.out.println("The squares of the sum of the first ten natural numbers is "+r);
        System.out.println("Hence the difference between the sum of the squares of the first hundred natural numbers and the squares of the sum is "+r+"-"+s+" ="+(r-s));
	}

}
