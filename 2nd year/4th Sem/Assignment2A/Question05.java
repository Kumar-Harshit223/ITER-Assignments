import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,0,6,7,0,0,0};
		bfsTraversal(arr, 1);
	}
	public static void bfsTraversal(int[]arr, int root) {
		boolean[] visit=new boolean[arr.length];
		ArrayDeque<Integer> que=new ArrayDeque<Integer>();
		que.add(root);
		visit[0]=true;
		while(!que.isEmpty()) {
			int res=que.remove();
			System.out.print(res+" ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0&&!visit[i]) {
					que.add(i);
					visit[i]=true;
				}
			}
		}
	}
}
