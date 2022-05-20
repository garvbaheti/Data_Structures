import java.util.Arrays;
class Node14{  
    int data;  
    Node14 left,right;  
          
    Node14(int data){  
        //Assign data to the new node, set left and right children to null  
        this.data = data;  
        left = right = null;  
        }  
    }
class b_tree14 {

    Node14 root;  
    int[] treeArray;  
    int index = 0;  
    //convertBTBST() will convert a binary tree to binary search tree  
    Node14 convertBTBST(Node14 node) {  
          
        //Variable treeSize will hold size of tree  
        int treeSize = calculateSize(node);  
        treeArray = new int[treeSize];  
          
        //Converts binary tree to array  
        toArray(node);  
          
          //Sort treeArray  
        Arrays.sort(treeArray);  
        
        //Converts array to binary search tree  
        Node14 d = createBST(0, treeArray.length -1);  
        return d;  
    }  
      
    //calculateSize() will calculate size of tree  
    public int calculateSize(Node14 node)  
    {      
        int size = 0;  
        if (node == null)  
         return 0;  
        else {  
            size = calculateSize (node.left) + calculateSize (node.right) + 1;  
            return size;  
        }  
    }  
      
    //convertBTtoArray() will convert the given binary tree to its corresponding array representation  
    public void toArray(Node14 node) {  
        //Check whether tree is empty  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
        }  
        else {  
            if(node.left != null)  
                toArray(node.left);  
            //Adds nodes of binary tree to treeArray  
            treeArray[index] = node.data;   
            index++;  
            if(node.right != null)  
                toArray(node.right);    
            }        
        }  
      
    //createBST() will convert array to binary search tree  
    Node14 createBST(int start, int end) {  
          
        //It will avoid overflow  
        if (start > end) {  
            return null;  
        }  
          
        //Variable will store middle element of array and make it root of binary search tree  
        int mid = (start + end) / 2;  
        Node14 node = new Node14(treeArray[mid]);  
   
        //Construct left subtree  
        node.left = createBST(start, mid - 1);  
   
        //Construct right subtree  
        node.right = createBST(mid + 1, end);  
   
        return node;  
    }  
      
    //to perform inorder traversal on binary search tree  
    void Traverse(Node14 node) {  
          
        //Check whether tree is empty  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
           }  
        else {  
              
            if(node.left!= null)  
                Traverse(node.left);  
            System.out.print(node.data + " ");  
            if(node.right!= null)  
                Traverse(node.right);  
                
          }        
      }
    } 
public class Question_14{
    public static void main(String[] args) {  
          
        b_tree14 bt = new b_tree14();  
        //Add nodes to the binary tree  
        bt.root = new Node14(1);  
        bt.root.left = new Node14(2);  
        bt.root.right = new Node14(3);  
        bt.root.left.left = new Node14(4);  
        bt.root.left.right = new Node14(5);  
        bt.root.right.left = new Node14(6);  
        bt.root.right.right = new Node14(7);  
          
        //Display given binary tree  
        System.out.println("Inorder representation of binary tree: ");  
        bt.Traverse(bt.root);  
          
        //Converts binary tree to corresponding binary search tree  
        Node14 bst = bt.convertBTBST(bt.root);  
          
        //Display corresponding binary search tree  
        System.out.println("\nInorder of binary search tree: ");  
        bt.Traverse(bst);
      }  
}  