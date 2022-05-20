import java.util.*;
class Node8{
	int data;
	Node8 left, right;

	Node8(int item){
		data = item;
		left = right = null;
	}
}
class Binary_tree8{
       Node8 root;
       int maxlevelsum(Node8 root){
              if(root == null){
                     return 0;
              }
              int result = root.data;
              Queue<Node8> q = new LinkedList<>();
              q.add(root);

              while(!q.isEmpty()){
                     int size = q.size();
                     int sum =0;
                     while(size>0){
                            size--;
                            Node8 temp = q.poll();

                            sum += temp.data;

                            if(temp.left != null){
                                   q.add(temp.left);
                            }
                            if(temp.right != null){
                                   q.add(temp.right);
                            }
              }
              result = Math.max(sum,result);
              }
              
              return result;
       }
       
}
public class Question_8 {
       public static void main(String[] args){
              Binary_tree8 tree = new Binary_tree8();
              tree.root = new Node8(10);
		tree.root.left = new Node8(8);
		tree.root.right = new Node8(-2);
		tree.root.left.left = new Node8(-3);
		tree.root.left.right = new Node8(7);
              tree.root.left.right.left = new Node8(10);
		tree.root.right.left = new Node8(2);
              tree.root.right.left.right = new Node8(20);
              System.out.println("Maximum level-sum: " + tree.maxlevelsum(tree.root));
       }
}
