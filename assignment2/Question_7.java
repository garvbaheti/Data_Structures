class Node7{
	int data;
	Node7 left, right;
	Node7(int item){
		data = item;
		left = right = null;
	}
}
class Bin_tree{
	Node7 root;
       int getLeafCount(Node7 node){
              if (node == null){
                     return 0;
              }
              if (node.left == null && node.right == null){
                     return 1;
              }
              else{
                     //calculate leaf count since total = l.c of right subtree + l.c. of left subtree 
                     return (getLeafCount(node.right) + getLeafCount(node.left));
              }
    }
}
public class Question_7{
	// driver program to test above functions
	public static void main(String args[]){
		Bin_tree tree = new Bin_tree();
		tree.root = new Node7(10);
		tree.root.left = new Node7(8);
		tree.root.right = new Node7(2);
		tree.root.left.left = new Node7(3);
		tree.root.left.right = new Node7(5);
		tree.root.right.left = new Node7(2);

		System.out.println(tree.getLeafCount(tree.root));
	}
}