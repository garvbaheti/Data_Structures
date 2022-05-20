class Node
{
    Node left, right;
    char data;
    Node(char data)
    {
        this.data = data;
        left = right;
    }
}
  
class Binary_Tree
{
    Node root;

    void rev_level_order(Node node){
        int i;
        for (i = height(node); i >= 1; i--){
            level_print(node, i);
        }
    }

    void level_print(Node node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1)
        {
            level_print(node.left, level - 1);
            level_print(node.right, level - 1);
        }
    }
  
    int height(Node node)
    {
       // to get height of tree
        if (node == null)
            return 0;
        else
        {
            int left_height = height(node.left);
            int right_height = height(node.right);

            if (left_height > right_height)
                return (left_height + 1);
            else
                return (right_height + 1);
        }
    }
}
//runner class
public class Question_1{
       public static void main(String args[])
    {
       Binary_Tree tree = new Binary_Tree();
       //creating tree
        tree.root = new Node ('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.right.left = new Node('F');
        tree.root.right.right = new Node('G');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.left.right.left = new Node('H');  
        tree.root.left.right.right = new Node('I');
        //printing the traversal in reverse level order
        System.out.println("Traversal: ");
        tree.rev_level_order(tree.root);

    }
}

        