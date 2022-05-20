class Node17{
	int data;
	Node17 left, right;
	Node17(int item){
		data = item;
		left = right = null;
	}
}

class Bi_tree
{
	Node17 root;
       public static int level = 0;
       public boolean levelCheck(Node17 node, int currentLevel){
              if(root == null){  
                     System.out.println("Tree is empty");  
                     return true;  
              }  
              else {  
                  //Checks whether node is null  
                  if(node==null)  
                      return true;  
         
                  if(node.left == null && node.right == null) {  
                      //If first leaf is encountered, set level to current level  
                      if(level == 0) {  
                          level = currentLevel ;  
                          return true;  
                      }  
                      //Checks whether the other leaves are at same level of that of first leaf  
                      else   
                         return (level == currentLevel) ;  
                   }
                  //Checks for leaf node in left and right subtree recursively.  
                  return(levelCheck(node.left, currentLevel + 1) && levelCheck(node.right, currentLevel + 1));  
               }  
          }  
	
}
public class Question_17{
	// driver program to test above functions
	public static void main(String args[])
	{
		Bi_tree tree = new Bi_tree();
		tree.root = new Node17(10);
		tree.root.left = new Node17(8);
		tree.root.right = new Node17(2);
		tree.root.left.left = new Node17(3);
		tree.root.left.right = new Node17(5);
		tree.root.right.left = new Node17(2);
              tree.root.right.left.right = new Node17(8);
              if(tree.levelCheck(tree.root, 1)){
                     System.out.println("All leaves are at same level");
              }
              else{
                     System.out.println("All leaves are not at same level");
              }

	}
}