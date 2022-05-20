import java.util.Scanner;

class circular{
    static int front, rear, size ,count;
    static int queue[];

    public circular(int c){
        front = rear = -1;
        size = c;
        queue = new int[size];
    }

    static boolean Overflow(){
        if ((front==0 && rear == size -1) || (front == rear + 1)) {
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

    static void enqueue(int element){

        if(Overflow()){return;}
        else if( front==-1 && rear==-1){
            front = rear = 0;
            queue[rear]=element;
            count++;  
        }
        else if(rear == size-1 && front!=0){
            rear = 0;
            queue[rear]=element;
            count++;
        }
        else{
            rear++;
            queue[rear] = element;
            count++;
        }

    }

    static void dequeue(){
        if(Underflow()){}
        else if(front == rear){
            System.out.println(queue[front]);
            front = rear = -1;
            count--;
        }
        else if(front == size-1){
            System.out.println(queue[front]);
            front =0;
            count--;
            
        }
        else{
            System.out.println(queue[front]);
            front++;
            count--;
        }
    }

    static void Front()
    {
        if (Underflow()) {}
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }

    static void display(){
        if(Underflow()){}
        else if(front<= rear){
            int i = front;
            while(i<=rear){
                System.out.print(queue[i]+" ");
            i++;
            }
            System.out.println();
        }
        else{
            int i = front;
            while(i<=size-1){
                System.out.print(queue[i]+" ");
                i++;
            }
            i=0;
            while(i<=rear){
                System.out.print(queue[i]+" ");
                i++;

            }
        }
    }
}


public class CircularQueue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Integer queue ");
        int size = sc.nextInt();

        // Create a queue 
        circular cq = new circular(size);

        char ch;
        do{
            System.out.println("\n Circular Queue Operations using array");
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
                cq.enqueue(sc.nextInt());                     
                break;                         
            case 2 :
                System.out.println("deque Element = " );
                cq.dequeue();
                break;                         
            case 3 :         
                System.out.println("Peek Element = ");
                cq.Front();
                break;                         
            case 4 : 
                System.out.println("Empty status = " );
                if(cq.Underflow()){}
                else{System.out.print("Not Empty");}
                break;                
            case 5 :
                System.out.println("Full status = " );
                if(cq.Overflow()){}
                else{System.out.print("Not Full");}
                break;                 
            case 6 : 
                System.out.println("Size = " );
                if(cq.Underflow()){}
                else{
                System.out.print(cq.count);
            }
                break; 
            case 7 :
                if(cq.Underflow()){}
                else{cq.display();}
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
