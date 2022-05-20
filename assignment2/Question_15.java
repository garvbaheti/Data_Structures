import java.util.*;
class Node15
{
	int data;
	Node15 left, right;

	Node15(int item)
	{
		data = item;
		left = right = null;
	}
}
class Binary_tree15{
       Node15 root;
       void maxSumLevel(Node15 root){
              if(root == null){
                     return;
              }
              Queue<Node15> q = new LinkedList<>();
              int n[]  = new int[1000];
              q.add(root);
              int k =0;
              while(!q.isEmpty()){
                     
                     int size = q.size();
                     int sum =0;
                     while(size-- > 0){
                            Node15 temp = q.poll();

                            sum += temp.data;

                            if(temp.left != null){
                                   q.add(temp.left);
                            }
                            if(temp.right != null){
                                   q.add(temp.right);
                            }
                            
                     }
                     n[k++]=sum;
       }
       for(int j=0;j<k;j++){
              System.out.println(n[j]);
       }
}

}
public class Question_15 {
       public static void main(String[] args){
              Binary_tree15 tree = new Binary_tree15();
              tree.root = new Node15(10);
		tree.root.left = new Node15(8);
		tree.root.right = new Node15(9);
		tree.root.left.left = new Node15(2);
		tree.root.left.right = new Node15(7);
		tree.root.right.left = new Node15(11);
              tree.maxSumLevel(tree.root);
       }
}
