class Node9 {
       int value; 
       Node9 left, right; 
       Node9(int value){ 
              this.value = value; 
              left = null; 
              right = null; 
       } 
}
class Binarytree9 {
       Node9 root;
       int sum(Node9 root){
              if (root == null){
                     return 0;
              }
              return (root.value + sum(root.left) + sum(root.right));
       }
}

public class Question_9 {
       public static void main(String[] args){
              Binarytree9 tree = new Binarytree9();
              tree.root = new Node9(10);
		tree.root.left = new Node9(8);
		tree.root.right = new Node9(9);
		tree.root.left.left = new Node9(2);
		tree.root.left.right = new Node9(7);
		tree.root.right.left = new Node9(11);
              System.out.println("SUM: " + tree.sum(tree.root));
       }
}
