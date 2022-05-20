import java.util.*;

class Queue {
    static int front, rear, size;
    static int queue[];
 
    Queue(int c)
    {
        front = rear = -1;
        size = c;
        queue = new int[size];
    }
 
    // function to insert an element
    // at the rear of the queue
    
    static boolean Overflow(){
        if (rear == size) {
            System.out.printf("\nQueue is full\n");
            return true;
        }
        else{return false;}
    }

    static boolean Underflow(){
        if (front == -1 && rear == -1) {
            System.out.printf("\nQueue is empty\n");
            return true;
        }
        else{return false;}
    }

    static void queueEnqueue(int data)
    {
        // check queue is full or not
        if (Overflow()) {
            return;
        }
        else if(front==-1 && rear==-1){
            front=0;
            rear=0;
            queue[rear] = data;
            rear++; 
        }
        // insert element at the rear
        else {
            queue[rear] = data;
            rear++; 
        }
        
        return;
    }
 
    // function to delete an element
    // from the front of the queue
    static void queueDequeue()
    {
        // if queue is empty
        if (Underflow()) {
            
            return;
        }
 
        else if(front == rear){
            front= -1;
            rear=-1;
        }
        else {
            System.out.println(queue[front]);
            front++;
        }
        return;
    }
    
 
    // print queue elements
    static void queueDisplay()
    {
        int i;
        if (Underflow()) {
            return;
        }
        else{
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d  ", queue[i]);
        }
        System.out.println();
        return;
    }
    }
 
    // print front of queue
    static void queueFront()
    {
        if (Underflow()) {}
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
}
 
public class linearQueue {
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Integer queue ");
        int size = sc.nextInt();

        // Create a queue 
        Queue q = new Queue(size);

        char ch;
        do{
            System.out.println("\n Queue Operations using array");
            System.out.println("1. enque");
            System.out.println("2. deque");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. total no of element in queue");
            System.out.println("7. Traversal");
            int choice = sc.nextInt();
           switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to enque");
                q.queueEnqueue(sc.nextInt());                     
                break;                         
            case 2 :
                System.out.println("deque Element = " );
                q.queueDequeue();
                break;                         
            case 3 :         
                System.out.println("Peek Element = ");
                q.queueFront();
                break;                         
            case 4 : 
                System.out.println("Empty status = " );
                if(q.Underflow()){}
                else{System.out.print("Not Empty");}
                break;                
            case 5 :
                System.out.println("Full status = " );
                if(q.Overflow()){}
                else{System.out.print("Not Full");}
                break;                 
            case 6 : 
                System.out.println("Size = " );
                if(q.Underflow()){}
                else{int count=0;
                    for (int i = q.front; i < q.rear; i++) {
                    count++;
                }
                System.out.print(count);
            }
                break; 
            case 7 :
                if(q.Underflow()){}
                else{q.queueDisplay();}
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
                     
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0); 
 
        } while (ch == 'Y'|| ch == 'y');
    }
}