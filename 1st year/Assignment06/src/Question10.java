import java.util.*;
public class Question10 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int l=0;
		if((int)(ch2)>(int)(ch1))
			l=ch2-ch1;
		else
			l=26-(ch1-ch2);
		int c=0, start=ch1;
		for(int i=1;i<=(l+1);i++) {
			if(ch1>='A'&&ch1<='Z') {
				if(start>'Z') {
					start=start-26;
					System.out.print((char)(start)+" ");
					c++;
					if(c%numberPerLine==0)
						System.out.println();
					}
				else {
					System.out.print((char)(start)+" ");
					c++;
					if(c%numberPerLine==0)
						System.out.println();
				}
				start=start+1;
			}
			else if(ch1>='a'&&ch1<='z') {
				if(start>'z') {
					start=start-26;
					System.out.print((char)(start)+" ");
					c++;
					if(c%numberPerLine==0)
						System.out.println();
					}
				else {
					System.out.print((char)(start)+" ");
					c++;
					if(c%numberPerLine==0)
						System.out.println();
				}
				start=start+1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st character : ");
        char ch1=sc.next().charAt(0);
        System.out.print("Enter the 2nd character : ");
        char ch2=sc.next().charAt(0);
        System.out.print("Enter the number of character per line : ");
        int numPerLine=sc.nextInt();
        printChars(ch1,ch2,numPerLine);
        sc.close();
	}

}
