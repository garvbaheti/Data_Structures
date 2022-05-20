class Node2{
    int data2;
    Node2 next;
    Node2(int data2) {
        this.data2 = data2;
    }
}

class linked_list{
    Node2 head;
    Node2 reverse(Node2 node){
        Node2 newHead;
        if((node.next == null)){
            return node;
        }
        newHead = reverse(node.next);
    
        node.next.next = node;
        node.next = null;    
        return newHead;
    }

    void reverse(){
        head = reverse(head);
    }

    void printList(){
        Node2 ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data2 + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    void insert(int data2){
        if(head == null){
            head = new Node2(data2);
            return;
        }
        tail().next = new Node2(data2);
    }

    Node2 tail() {
        Node2 tail = head;
        // Find last element of linked list known as tail
        while(tail.next != null){
            tail = tail.next;
        }      
        return tail;
    } 
}
public class Question_2 {
    public static void main(String args[]) {
        linked_list llist = new linked_list();
        llist.insert(1);
        llist.insert(2);
        llist.insert(4);
        llist.insert(5);
        llist.insert(6);
        llist.insert(7);
        System.out.println("linked list before reversing : ");
        llist.printList();        
        llist.reverse();
        System.out.println("linked list after reversing : ");
        llist.printList();
    }
}