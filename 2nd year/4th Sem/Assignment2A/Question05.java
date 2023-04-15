import java.util.*;
public class Question05 {

	static class Tree{
		int data;
		Tree right;
		Tree left;
		
		Tree(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root=new Tree(1);
		root.left=new Tree(2);
		root.right=new Tree(3);
		
		root.left.left=new Tree(4);
		root.right.right=new Tree(5);
		
		root.left.left.left=new Tree(6);
		root.right.right.right=new Tree(7);
		
		bfsTraversal(root);
		
	}
	
	public static void bfsTraversal(Tree root) {
		if(root == null)
			return;
		ArrayDeque<Tree> bfs= new ArrayDeque<Tree>();
		bfs.add(root);
		while(!bfs.isEmpty()) {
			Tree curr=bfs.remove();
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				bfs.add(curr.left);
			}
			if(curr.right!=null) {
				bfs.add(curr.right);
			}
		}
	}
}
