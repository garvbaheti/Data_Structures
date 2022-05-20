import java.util.ArrayList;

class Node16{
	int data;
	Node16 left, right;
	Node16(int item)
	{
		data = item;
		left = right = null;
	}
}

class binary_tree16{
       Node16 root;
       void traverse(){
              traverse(root);
       } 

      //for in order traversal
       void traverse(Node16 node){ 
              if(node==null){
                     return;
              }
              traverse(node.left);
              System.out.print(node.data + " ");
              traverse(node.right);
       }

       // fn to store in order of tree
       public ArrayList<Integer> storeInorderUtil(Node16 node, ArrayList<Integer> list){ 
              if(node == null){
                     return list;}
          
              //recur on the left child 
              storeInorderUtil(node.left, list); 
          
              // Adds data to the list 
              list.add(node.data); 
          
              //recur on the right child 
              storeInorderUtil(node.right, list); 
          
              return list; 
    } 
      
    // Method that stores inorder traversal of a tree 
    ArrayList<Integer> storeInorder(Node16 node) 
    { 
              ArrayList<Integer> list1 = new ArrayList<>();  
              ArrayList<Integer> list2 = storeInorderUtil(node,list1);  
              return list2; 
    }
    ArrayList<Integer> merge(ArrayList<Integer>list1, ArrayList<Integer>list2, int m, int n) 
    { 
        // list3 will contain the merge of list1 and list2 
        ArrayList<Integer> list3 = new ArrayList<>(); 
        int i=0; 
        int j=0; 
          
        //Traversing through both ArrayLists 
        while( i<m && j<n) 
        { 
            // Smaller one goes into list3 
            if(list1.get(i)<list2.get(j)) 
            { 
                list3.add(list1.get(i)); 
                i++; 
            } 
            else
            { 
                list3.add(list2.get(j)); 
                j++; 
            } 
        } 
          
        // Adds the remaining elements of list1 into list3 
        while(i<m) 
        { 
            list3.add(list1.get(i)); 
            i++; 
        } 
      
        // Adds the remaining elements of list2 into list3 
        while(j<n) 
        { 
            list3.add(list2.get(j)); 
            j++; 
        } 
        return list3; 
    } 
      
    // Method that converts an ArrayList to a BST 
    Node16 toBST(ArrayList<Integer>list, int start, int end) 
    { 
        // Base case 
        if(start > end) 
            return null; 
      
        // Get the middle element and make it root      
        int mid = (start+end)/2; 
        Node16 node = new Node16(list.get(mid)); 
  
        /* Recursively construct the left subtree and make it 
        left child of root */
        node.left = toBST(list, start, mid-1); 
          
        /* Recursively construct the right subtree and make it 
        right child of root */
        node.right = toBST(list, mid+1, end); 
        
        return node; 
    } 
      
    // Method that merges two trees into a single one.  
    Node16 merge(Node16 node1, Node16 node2) 
    { 
        //Stores Inorder of tree1 to list1 
        ArrayList<Integer>list1 = storeInorder(node1); 
          
        //Stores Inorder of tree2 to list2 
        ArrayList<Integer>list2 = storeInorder(node2); 
          
        // Merges both list1 and list2 into list3 
        ArrayList<Integer>list3 = merge(list1, list2, list1.size(), list2.size()); 
          
        //Eventually converts the merged list into resultant BST 
        Node16 node = toBST(list3, 0, list3.size()-1); 
        return node; 
    } 
  

}
public class Question_16 {
       public static void main(String args[])
	{
		binary_tree16 tree1 = new binary_tree16();
		tree1.root = new Node16(10);
		tree1.root.left = new Node16(8);
		tree1.root.right = new Node16(2);
		tree1.root.left.left = new Node16(3);
		tree1.root.left.right = new Node16(5);
		tree1.root.right.left = new Node16(2);
              tree1.root.right.left.right = new Node16(8);

              binary_tree16 tree2 = new binary_tree16(); 
              tree2.root = new Node16(80);     
              tree2.root.left = new Node16(40); 
              tree2.root.right = new Node16(120);

              binary_tree16 tree = new binary_tree16();
              tree.root = tree.merge(tree1.root, tree2.root); 
              System.out.println("The Inorder traversal of the merged BST is: "); 
              tree.traverse();  
       }
}
