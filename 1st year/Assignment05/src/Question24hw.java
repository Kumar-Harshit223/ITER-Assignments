import java.util.*;
public class Question24hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int n= sc.nextInt(),m= sc.nextInt();
        int t=0;
        while(true){
            for (int i=2;i<= Integer.min(n,m);i++){
                if ((n%i==0)&&(m%i==0)) {
                    if(t!=i){
                        System.out.print(i+" ");
                        t=i;
                    }
                    n=n/i;
                    m=m/i;
                    i=1;
                }}
            if(n==1||m==1)break;}
	}

}
