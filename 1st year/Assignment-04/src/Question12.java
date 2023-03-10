
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=16;i<=2048;i*=2){
            System.out.println(Math.log(i)+"\t\t"+i+"\t\t"+i*Math.log(i)+"\t\t"+Math.pow(i,2)+"\t\t"+Math.pow(i,3)+"\t\t"+Math.pow(2,i));
	    } 
	}

}
