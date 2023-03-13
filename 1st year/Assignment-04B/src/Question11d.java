
public class Question11d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int c=1;
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=5-i;j++)
        		System.out.print(" ");
        	for(int j=1;j<=(2*i-1);j++) {
        		if(j%2!=0) {
        			System.out.print(c);
        			c++;
        		}
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}
