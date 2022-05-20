import java.util.*;

class Node12
{
	int data;
	Node12 left, right;
	Node12(int item)
	{
		data = item;
		left = right = null;
	}
}
class b_t{
       Node12 root;

  Node12 sortedArrayToBST(int arr[], int start, int end)
{
    /* Base Case */
    if (start > end)
        return null;
 
    /* Get the middle element
       and make it root */
    int mid = (start + end) / 2;
     Node12 root = new Node12(arr[mid]);
 
    /* Recursively construct the
       left subtree and make it
       left child of root */
    root.left = sortedArrayToBST(arr, start, mid - 1);
 
    /* Recursively construct the
       right subtree and make it
       right child of root */
    root.right = sortedArrayToBST(arr, mid + 1, end);
 
    return root;
}
void printLevelOrder(Node12 root)
{
    if (root == null)  return;
 
    Queue<Node12 > q= new LinkedList<Node12>();
    q.add(root);
   
    while (q.size()>0)
    {
        Node12 node = q.element();
        System.out.print( node.data + " ");
        q.remove();
        if (node.left != null)
            q.add(node.left);
        if (node.right != null)
            q.add(node.right);
    }
}  
}
public class Question_12 {
       public static void main(String[] args){
           b_t tree = new b_t();
           int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
           int n = arr.length;
           tree.root = tree.sortedArrayToBST(arr, 0, n - 1);
           tree.printLevelOrder(tree.root);
       }     
}
