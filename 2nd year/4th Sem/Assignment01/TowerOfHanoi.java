
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		toh('A', 'B', 'C', 4);
	}
	public static void toh(char src, char dest, char help, int num) {
		if(num<1) {
			return;
		}
		toh(src, help, dest, num-1);
		System.out.println("Move " + num + " disk from " + src + " to dest " +
				dest);
		toh(help, dest, src, num-1);
	}
}
