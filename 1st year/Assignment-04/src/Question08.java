
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="";
        for (int i=1;i<=5;i++) {
            System.out.print(st);
            System.out.print(i);
            System.out.print(st);
            st=st+String.valueOf(i)+st;
            System.out.println();
	     }
     }
}