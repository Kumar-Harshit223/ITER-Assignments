
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a1,a2,a3,a4,a5,max,min,avg;
        a1=Math.random();
        a2=Math.random();
      	a3=Math.random();
      	a4=Math.random();
		a5=Math.random();
		max=Math.max(a1,Math.max(a2,Math.max(a3,Math.max(a4,a5))));
		min=Math.min(a1,Math.min(a2,Math.min(a3,Math.min(a4,a5))));
		avg=(a1+a2+a3+a4+a5)/5;
		System.out.println(a1+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\nAverage: "+avg+"\nMin: "+min+"\nMax: "+max);
	}

}
