import java.util.*; 

class Question1 { 

    int front=-1; int rear = -1; 
    int [] queue ; int size; 
    
    void set_size(int size) { 
        this.size = size; 
        queue = new int[size]; 
    } 

    void enque(int val) { 
        if(front == -1 && rear == -1) { 
            front = 0; rear=0; queue[rear] = val; } 
        else if(rear == size-1) { 
                System.out.println("Overflow"); } 
        else { rear++; queue[rear] = val; } 
    } 
    
    void deque() { 
        if(front==-1&& rear==-1) { 
        System.out.print("Underflow"); } 
        else if(front >=rear) { 
            front = -1 ; rear = -1; } 
        else { front++; } 
    } 
    
    void traversal() { 
        if(front==-1 && rear==-1) { 
        System.out.print("Empty queue"); } 
        else { for(int i=front;i<=rear;i++) { 
            System.out.print(queue[i]+" "); } 
        } 
        System.out.println(); 
    } 

    void reversal(int []queue) { 
        if(rear==-1 && front==-1) { 
            return; 
        } 
        int temp = queue [front]; 
        deque(); 
        reversal(queue); 
        enque(temp); 
    }
public static void main(String[] args) { 

    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the size of queue: "); 

    Question1 queue = new Question1(); 

    int size = scan.nextInt();

    queue.set_size(size);

    System.out.println("Enter Elements: "); 

    for(int i=0;i<size;i++) { 
        queue.enque(scan.nextInt());
    } 
        queue.traversal(); 
        queue.reversal(queue.queue); 
        queue.traversal(); 
        scan.close();
    } 
}