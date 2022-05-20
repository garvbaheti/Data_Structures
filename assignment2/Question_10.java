class Node10
{
	int data;
	Node10 left, right;
	Node10(int item)
	{
		data = item;
		left = right = null;
	}
}
class Bina_tree
{
	Node10 root;
       int countNodes(Node10 root){
              if (root == null){
                     return (0);
              }
              return (1 + countNodes(root.left) + countNodes(root.right));
    }
    boolean isComplete(Node10 root){
           if(root==null){
                  return true;
              }
           if(root.left !=null && root.right==null){
                  return true;
              }
           if( root.left == null && root.right != null){
                  return false;
              }
           return(isComplete(root.left) && isComplete(root.right));
}
}
public class Question_10{
	public static void main(String args[])
	{      
		Bina_tree tree = new Bina_tree();
		tree.root = new Node10(10);
		tree.root.left = new Node10(8);
		tree.root.right = new Node10(2);
		tree.root.left.left = new Node10(3);
		tree.root.left.right = new Node10(5);
		tree.root.right.left = new Node10(2);

              if (tree.isComplete(tree.root)){
                     System.out.print("The binary tree is complete");
              }
              else{
                     System.out.print("The binary tree is not complete");
              }
       }
}