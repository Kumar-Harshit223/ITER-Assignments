import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("scissor(0), rock(1), paper(2) :");
        int input=sc.nextInt();
        int ran=(int)(Math.random()*2)+1;
        if(ran==0&&input==1){
            System.out.println("The computer is scissor, You are rock. You won ");
            }
        else if(ran==1&&input==2){
        	System.out.println("The computer is rock, You are paper. You won");     	
      		}
        else if(ran==2&&input==0) {
        	System.out.println("The computer is paper, You are scissor. You won");
        }
        else if(ran==1&&input==0){
            System.out.println("The computer is rock, You are scissor. Computer won ");
            }
        else if(ran==2&&input==1){
        	System.out.println("The computer is paper, You are rock. Computer won");     	
      		}
        else if(ran==0&&input==2) {
        	System.out.println("The computer is scissor, You are paper. Computer won");
        }
        else if(ran==input) {
        	if(input==0)
        		System.out.println("The computer is scissor. You are scissor. It is a draw ");
        	else if(input==1)
        		System.out.println("The computer is rock. You are rock. It is a draw ");
        	else
        		System.out.println("The computer is paper. You are paper. It is a draw ");
        }
        else
        	System.out.println("Wrong input");
        sc.close();
	}

}
