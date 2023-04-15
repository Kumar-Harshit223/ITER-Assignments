import java.util.*;
public class Question06 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,0,6,7,0,0,0};
		dfsTraversal(arr, 1);
	}
	public static void dfsTraversal(int arr[], int root) {
		boolean[] visit=new boolean[arr.length];
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(root);
		visit[root]=true;
		while(!stk.isEmpty()) {
			int res=stk.pop();
			System.out.print(res+" ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0&&!visit[i]) {
					stk.add(i);
					visit[i]=true;
				}
			}
		}
	}
}
