
public class Question26hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The perfect numbers between 1 and 500 are :");
        for(int i=2;i<=500;i++) {
        	int s=0;
        	for(int j=1;j<i;j++) {
        		if(i%j==0)
        			s+=j;
        	}
        	if(s==i)
        		System.out.print(i+" ");
        }
	}

}
