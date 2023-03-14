
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n=Integer.parseInt(args[0]);
        int c=0;
        int s=0;
        for(int i=2;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		if(i%j==0)
        			s++;
        	}
        	if(s==2)
        		c++;
        	s=0;
        }
        System.out.println("The number of prime numbers less than or equal to N is "+c);
	}

}
