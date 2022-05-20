class Node
{
    int data;       // integer data
    Node next;      // pointer to the next node
}
 
class Stackll
{
    private Node top;
    private int nodesCount;
 
    public Stackll() {
        this.top = null;
        this.nodesCount = 0;
    }
 
    // Utility function to add an element `x` to the stack
    public void push(int x)        // insert at the beginning
    {
        // allocate a new node in a heap
        Node node = new Node();
 
        // check if stack is full. Then inserting an element would
        // lead to stack overflow
        if (node == null){
            System.out.println("Overflow");
            return;}
 
        System.out.println("Inserting " + x);
 
        // set data in the allocated node
        node.data = x;
 
        // set the .next pointer of the new node to point to the current
        // top node of the list
        node.next = top;
 
        // update top pointer
        top = node;
 
        // increase stack's size by 1
        this.nodesCount += 1;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }
 
    // Utility function to return the top element of the stack
    public int peek()
    {
        // check for an empty stack
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }
 
    // Utility function to pop a top element from the stack
    public int pop()        // remove at the beginning
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
 
        // take note of the top node's data
        int top = peek();
 
        System.out.println("Deleted " + top);
 
        // decrease stack's size by 1
        this.nodesCount -= 1;
 
        // update the top pointer to point to the next node
        this.top = (this.top).next;
 
        return top;
    }
 
    // Utility function to return the size of the stack
    public int size() {
        return this.nodesCount;
    }
}
 
public class stack_linked_list
{
    public static void main(String[] args)
    {
        Stackll stack = new Stackll();
 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}