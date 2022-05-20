class Node3 {
       int value; 
       Node3 left, right; 
       Node3(int value){ 
              this.value = value; 
              left = null; 
              right = null; 
       } 
}
class BinaryTree { 
       Node3 root;
       int findMax(Node3 node){ 
              if (node == null){
                     return Integer.MIN_VALUE;
              }
  
              int res = node.value; 
              int lres = findMax(node.left); 
              int rres = findMax(node.right); 
  
              if (lres > res){
                     res = lres; }
              if (rres > res){ 
                     res = rres; }
              return res; 
       }
       int findMin(Node3 node){ 
              if (node == null){
                     return Integer.MAX_VALUE;
              }
  
              int res = node.value; 
              int lres = findMin(node.left); 
              int rres = findMin(node.right); 
  
              if (lres < res){
                     res = lres; }
              if (rres < res){ 
                     res = rres; }
              return res; 
       }

        void traverseInOrder(Node3 node) {
           if (node != null) {
               traverseInOrder(node.left);
               System.out.print(node.value+" ");
               traverseInOrder(node.right);
           }
        }
   }
public class Question_4{
       public static void main(String args[]) { 
              BinaryTree tree = new BinaryTree();
               tree.root = new Node3(5);
               tree.root = new Node3(2);
               tree.root.left = new Node3(7); 
               tree.root.right = new Node3(5); 
               tree.root.left.right = new Node3(6); 
               tree.root.left.right.left = new Node3(1); 
               tree.root.left.right.right = new Node3(11); 
               tree.root.right.right = new Node3(9); 
               tree.root.right.right.left = new Node3(4);
               System.out.println("Traversing tree in order");
               tree.traverseInOrder(tree.root);
               System.out.println("\nMaximum: " + tree.findMax(tree.root));
               System.out.println("Minimum: " + tree.findMin(tree.root));
              }
   }