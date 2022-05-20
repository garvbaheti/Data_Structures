class Node0 {
       int value; 
       Node0 left, right; 
       Node0(int value){ 
              this.value = value; 
              left = null; 
              right = null; 
       } 
}
class Binary_Search_Tree { 
       Node0 root;
       void insert(Node0 node, int value) {
              if (value < node.value) {
                  if (node.left != null) {
                         insert(node.left, value);
                     }
                     else {
                            System.out.println(" Inserted " + value + " to left of " + node.value);
                            node.left = new Node0(value);
                     }
              } 
              else if (value > node.value) {
                     if (node.right != null) {
                            insert(node.right, value);
                     }
                     else {
                            System.out.println(" Inserted " + value + " to right of "+ node.value);
                            node.right = new Node0(value);
                     }
              }
         }
         void insert(int value){
                insert(root,value);
         }
       int findMax(Node0 node){ 
              Node0 temp = node;
              while(temp.right != null){
                     temp = temp.right;
              } 
              return temp.value; 
       }
       int findMin(Node0 node){ 
              Node0 temp = node;
              while(temp.left != null){
                     temp = temp.left;
              } 
              return temp.value;
       }

        void traverseInOrder(Node0 node) {
           if (node != null) {
               traverseInOrder(node.left);
               System.out.print(node.value+" ");
               traverseInOrder(node.right);
           }
        }
   }
public class binary_search_tree{
       public static void main(String args[]) { 
              Binary_Search_Tree tree = new Binary_Search_Tree();
               tree.root = new Node0(5);
                   System.out.println("Binary tree with root value: " + tree.root.value);
                   tree.insert( 2);
                   tree.insert(4);
                   tree.insert(8);
                   tree.insert(6);
                   tree.insert(7);
                   tree.insert(3);
                   tree.insert(19);
                   tree.insert(14);
                   tree.insert(18);

                   System.out.println("Traversing tree in order");
                   tree.traverseInOrder(tree.root);
                   System.out.println("\nMaximum: " + tree.findMax(tree.root));
                   System.out.println("Minimum: " + tree.findMin(tree.root));
              }
   }