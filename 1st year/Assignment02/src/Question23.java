
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,min,max;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        min=Math.min(a,Math.min(b,c));
        max=Math.max(a,Math.max(b,c));
        System.out.println("Ascending order: "+min+"  "+((a+b+c)-(min+max))+"  "+max);
	}

}
