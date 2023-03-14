import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int pos=0;
        int neg=0;
        float average=0f;
        float total=0f;
        int count=0;
        System.out.println("Enter an integer, the input ends if it is 0:");
        for(int i=1;i>0;i++) {
        	int x=sc.nextInt();
        	if(x==0)
        		break;
        	else if(x>0) {
        		pos++;
        		total+=x;
        	}
        	else {
        		neg++;
        		total+=x;
        	}
        }
        if((neg+pos)==0)
        	System.out.println("No numbers are entered except 0");
        else {
            count=pos+neg;
            average=total/(count*1.0f);
            System.out.println("The number of positives is "+pos);
            System.out.println("The number of negatives is "+neg);
            System.out.println("The total is "+total);
            System.out.println("The average is "+average);
        }
        sc.close();
	}

}
