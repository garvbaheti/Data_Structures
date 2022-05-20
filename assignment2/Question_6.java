class Node6{
	int data;
	Node6 left, right;

	Node6(int item){
		data = item;
		left = right = null;
	}
}

class bi_tree6{
	Node6 root;
	
	//creating an array to store a path 
	void printPaths(Node6 node){
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}

	void printPathsRecur(Node6 node, int path[], int pathLen){
		if (node == null){
			return;}

		path[pathLen++] = node.data;
		/* it's a leaf, so print the path that led to here */
		if (node.left == null && node.right == null){
                     for (int i = 0; i < pathLen; i++){
                            System.out.print(path[i] + " ");
                     }
                     System.out.println("");
              }
      		
		else{
			/* otherwise try both subtrees */
			printPathsRecur(node.left, path, pathLen);
			printPathsRecur(node.right, path, pathLen);
		}
	}
}
public class Question_6{
	// driver program to test above functions
	public static void main(String args[]){
		bi_tree6 tree = new bi_tree6();
		tree.root = new Node6(10);
		tree.root.left = new Node6(8);
		tree.root.right = new Node6(2);
		tree.root.left.left = new Node6(3);
		tree.root.left.right = new Node6(5);
		tree.root.right.left = new Node6(2);

		tree.printPaths(tree.root);
	}
}