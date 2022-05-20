class Node4{ 
    int data; 
    Node4 left, right;
    
    Node4(int data){
        this.data = data; 
        left = right = null;
    }
}

class B_Tree{
    Node4 root;
    boolean isBST(Node4 root, Node4 left, Node4 right){ 
        if (root == null){
            return true;
        }

    // if left node exist and is greater than root node

        if (left != null && root.data <= left.data){ 
            return false;
        }

    // if right node exist and is smaller than root node
        if (right != null && root.data >= right.data){ 
            return false; 
        }

    // check recursively for every node. 
        return isBST(root.left, left, root) && 
            isBST(root.right, root, right); 
        } 
    }
public class Question_5{
    public static void main(String args[]){
        B_Tree tree = new B_Tree();
        tree.root = new Node4(4); 
        tree.root.left = new Node4(1); 
        tree.root.right = new Node4(5); 
        tree.root.left.right = new Node4(3); 
        tree.root.right.right = new Node4(6); 

        if (tree.isBST(tree.root,null,null)) 
            System.out.print("It is a BST"); 
        else
            System.out.print("It is Not a BST"); 
        }
    }