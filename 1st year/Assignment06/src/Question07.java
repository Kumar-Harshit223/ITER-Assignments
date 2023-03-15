
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Question05 obj=new Question05();
        System.out.println("All twin prime less than 1000 are ..");
        for(int i=1;i<1000;i++) {
        	boolean res1=obj.isPrime(i);
        	boolean res2=obj.isPrime(i+2);
        	if(res1&&res2)
        		System.out.println("("+i+" , "+(i+2)+")");
        }
	}

}
