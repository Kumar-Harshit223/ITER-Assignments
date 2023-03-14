
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=Integer.parseInt(args[0]);
        int k=Integer.parseInt(args[1]);
        int count=1;
        double x1=1,x2=0,root=0;
        while(true){
            x2=x1-((Math.pow(x1,k))-n)/(k*Math.pow(x1,k-1));
            x1=x2;
            if(Math.abs(x1-root)<=0.00001) break;
            root=x1;
            count++;
        }
        System.out.println(x1);
        System.out.println("And number of steps: "+count);
	}

}
