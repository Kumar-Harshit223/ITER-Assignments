import java.util.*;
public class Question01 {
	
    public static int addition(int x, int y) {
    	return(x+y);
    }
    public static int substraction(int x, int y) {
    	return(x-y);
    }
    public static int multiplicationSimple(int x, int y) {
    	return(x*y);
    }
    public static int divisionSimple(int x, int y) {
    	return(y/x);
    }
    public static int remainderSimple(int n, int m) {
    	return(n%m);
    }
    public static double squareRootSimple(int n) {
    	double res=Math.sqrt(n);
    	return(res);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("1. Addition ");
        System.out.println("2. Substraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Remainder ");
        System.out.println("6. Square Root ");
        System.out.println("7. Exit ");
        System.out.println("-------------------------");
        System.out.println(" Enter your choice. ");
        int ch=sc.nextInt();
        switch(ch) {
        case 1: {
        	System.out.println("Addition");
        	System.out.println("Enter the two numbers");
       		int a=sc.nextInt(), b=sc.nextInt();
       		int op=addition(a,b);
       		System.out.println("The sum of "+a+" and "+b+" is "+op);
       		System.out.println();
       		break;
        	}
        case 2:{
        	System.out.println("Substraction");
        	System.out.println("Enter the two numbers");
        	int a=sc.nextInt(),b=sc.nextInt();
        	int op=substraction(a,b);
        	System.out.println("The difference of "+a+" and "+b+" is "+op);
        	System.out.println();
        	break;
        }
        case 3:{
        	System.out.println("Multiplication");
        	System.out.println("Enter the two numbers");
        	int a=sc.nextInt(),b=sc.nextInt();
        	int op=multiplicationSimple(a,b);
        	System.out.println("The product of "+a+" and "+b+" is "+op);
        	System.out.println();
        	break;
        }
        case 4:{
        	System.out.println("Division");
        	System.out.println("Enter the two numbers");
        	int a=sc.nextInt(),b=sc.nextInt(),op=0;
        	if(a!=0){
        	   op=divisionSimple(a,b);
        	   }
        	System.out.println("The quotient of "+a+" and "+b+" is "+op);
        	System.out.println();
        	break;
        }
        case 5:{
        	System.out.println("Remainder");
        	System.out.println("Enter the two numbers");
        	int a=sc.nextInt(),b=sc.nextInt(),op=0;
        	if(a!=0) {
        	    op=remainderSimple(a,b);
        	}
        	System.out.println("The remainder of "+a+" and "+b+" is "+op);
        	System.out.println();
        	break;
        }
        case 6:{
        	System.out.println("Square Root ");
        	System.out.println("Enter the number");
        	int a=sc.nextInt();
        	double op=squareRootSimple(a);
        	System.out.println("The square root of "+a+" is "+op);
        	System.out.println();
        	break;
        }
        case 7:{
        	System.out.println("Exit!!");
        	System.out.println("Terminating the calculator");
        	System.out.println("Thank You!!");
        	System.exit(0);
        }
        default:
        	System.out.println("Invalid Input");
        }
        }
        }
}