class Node13 {
       int value; 
       Node13 left, right; 
       Node13(int value){ 
              this.value = value; 
              left = null; 
              right = null; 
       } 
}
class Binary_Tree1 { 
       Node13 root;
       void insert(Node13 node, int value) {
              if (value < node.value) {
                  if (node.left != null) {
                         insert(node.left, value);
                     }
                     else {
                            System.out.println(" Inserted " + value + " to left of " + node.value);
                            node.left = new Node13(value);
                     }
              } 
              else if (value > node.value) {
                     if (node.right != null) {
                            insert(node.right, value);
                     }
                     else {
                            System.out.println(" Inserted " + value + " to right of "+ node.value);
                            node.right = new Node13(value);
                     }
              }
         }
         public Node13 minNode(Node13 root) { 
                //in bst we will find the min node in left only 
              if (root.left != null)  
                  return minNode(root.left);  
              else  
                  return root;  
          }  
         public Node13 deleteNode(Node13 node, int value) {  
              if(node == null){  
                  return null;  
               }  
              else {  
                  //value is less than node's data then, search the value in left subtree  
                  if(value < node.value)  
                      node.left = deleteNode(node.left, value);  
      
                  //value is greater than node's data then, search the value in right subtree  
                  else if(value > node.value)  
                      node.right = deleteNode(node.right, value);  
      
                  //If value is equal to node's data that is, we have found the node to be deleted  
                  else {  
                      //If node to be deleted has no child then, set the node to null  
                      if(node.left == null && node.right == null)  
                          node = null;  
      
                      //If node to be deleted has only one right child  
                      else if(node.left == null) {  
                          node = node.right;  
                      }  
      
                      //If node to be deleted has only one left child  
                      else if(node.right == null) {  
                          node = node.left;  
                      }  
      
                      //If node to be deleted has two children node  
                      else {  
                          //then find the minimum node from right subtree  
                          Node13 temp = minNode(node.right);  
                          //Exchange the data between node and temp  
                          node.value = temp.value;  
                          //Delete the node duplicate node from right subtree  
                          node.right = deleteNode(node.right, temp.value);  
                      }  
                  }  
                  return node;  
              }  
          }

        void traverseInOrder(Node13 node) {
           if (node != null) {
               traverseInOrder(node.left);
               System.out.print(node.value+" ");
               traverseInOrder(node.right);
           }
        }
        
   }
public class Question_13{
       public static void main(String args[]) { 
              Binary_Tree1 tree = new Binary_Tree1();
               Node13 root = new Node13(5);
                   System.out.println("Binary tree with root value: " + root.value);
                   tree.insert(root, 2);
                   tree.insert(root, 4);
                   tree.insert(root, 8);
                   tree.insert(root, 6);
                   tree.insert(root, 7);
                   tree.insert(root, 3);
                   tree.insert(root, 19);
                   tree.insert(root, 14);
                   tree.insert(root, 18);
                   System.out.println("Traversing tree in order");
                   tree.traverseInOrder(root);
                   tree.deleteNode(root, 14);

                   System.out.println("Traversing tree in order");
                   tree.traverseInOrder(root);
       }
   }