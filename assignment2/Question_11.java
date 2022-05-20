class Node11
{
	int data;
	Node11 left, right;
	Node11(int item)
	{
		data = item;
		left = right = null;
	}
}
class Bin_t
{
	Node11 root;
       int getLevelDiff(Node11 node){
              if (node == null){
                     return 0;
              }
 
        // Difference for root is root's data - difference for
        // left subtree - difference for right subtree
        return node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
    }
}
public class Question_11{
	// driver program to test above functions
	public static void main(String args[]){
		Bin_t tree = new Bin_t();
		tree.root = new Node11(5);
              tree.root.left = new Node11(2);
              tree.root.right = new Node11(6);
              tree.root.left.left = new Node11(1);
              tree.root.left.right = new Node11(4);
              tree.root.left.right.left = new Node11(3);
              tree.root.right.right = new Node11(8);
              tree.root.right.right.right = new Node11(9);
              tree.root.right.right.left = new Node11(7);

		System.out.println(tree.getLevelDiff(tree.root) + " is the required difference");
	}
}