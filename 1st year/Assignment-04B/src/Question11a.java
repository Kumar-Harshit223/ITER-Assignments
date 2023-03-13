
public class Question11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++) {
        	//spaces
        	for(int j=1;j<=(5-i);j++)
        		System.out.print(" ");
        	//stars
        	for(int k=1;k<=(2*i-1);k++) {
        		if(k%2==0)
        		System.out.print(" ");
        		else
        			System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
