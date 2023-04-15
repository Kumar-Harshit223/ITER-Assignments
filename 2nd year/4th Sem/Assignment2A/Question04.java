import java.util.*;
public class Question04 {
	
	final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the postFix expression : ");
		String str=sc.next();
		str=str.trim();
		System.out.println("The soluntion for this postFix expression is : "+postFix(str));
	}
	public static int postFix(String str) {
		Stack<Integer> poex=new Stack<Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
				if(ch=='+') {
					int o1=poex.pop();
					int o2=poex.pop();
					poex.push(o2+o1);
				}
				else if(ch=='-') {
					int o1=poex.pop();
					int o2=poex.pop();
					poex.push(o2-o1);
				}
				else if(ch=='/') {
					int o1=poex.pop();
					int o2=poex.pop();
					poex.push(o2/o1);
				}
				else {
					int o1=poex.pop();
					int o2=poex.pop();
					poex.push(o2*o1);
				}
			}
			else {
				poex.push(((int)ch)-48);
			}
		}
		return poex.pop();
	}
}
