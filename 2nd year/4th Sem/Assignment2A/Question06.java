import java.util.*;

public class Question06 {
	
	static class Tree{
		int data;
		Tree left;
		Tree right;
		
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
		
		traversal(root);
		System.out.println();
		System.out.println("DFS Traversals are : ");
		System.out.println("Inorder : ");
		inorder(root);
		System.out.println();
		System.out.println("Preorder : ");
		preorder(root);
		System.out.println();
		System.out.println("Postorder : ");
		postorder(root);
		
	}
	
	public static void traversal(Tree root) {
		if(root==null)
			return;
		Tree head=root;
		Stack<Tree> stk=new Stack<Tree>();
		stk.push(root);
		head=root.left;
		while(head!=null) {
			stk.push(head);
			head=head.left;
		}
		head=root.right;
		while(head!=null) {
			stk.push(head);
			head=head.right;
		}
		while(!stk.isEmpty()) {
			System.out.print(stk.pop().data+" ");
		}
	}
	
	public static void inorder(Tree root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void preorder(Tree root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(Tree root) {
		if(root==null)
			return;
		postorder(root.left);
		preorder(root.right);
		System.out.print(root.data+" ");
	}
	
}
