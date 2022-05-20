import java.util.*;
class Node{
    int data;
    public Node link;
    public Node(){
        data=0;
        link=null;
    } 
    public Node(int d, Node n){
        data = d;
        link = n;
    }
    public void set_data(int d){
        data = d;
    }
    public int get_data(){
        return data;
    }
    public void set_link(Node n){
        link = n;
    }
    public Node get_link(){
        return link;
    }
}
class Linked_List{
    public Node head;
    public int size;
    public Linked_List(){
        head=null;
        size=0;
    }
    public void insert_start(int a){
        Node new_node = new Node(a,null);
        new_node.set_link(head);
        head = new_node;
        size++;
    }
    public void insert_end(int b){
        Node new_node= new Node(b,null);
        Node ptr = head;
        while(ptr.get_link()!=null){
            ptr=ptr.get_link();
        }
        new_node.set_link(null);
        ptr.set_link(new_node);
        size++;
    }
    public void insert_after(int val,int posn){
        Node new_node = new Node (val,null);
        Node ptr = head;
        while(ptr.get_data()!=posn){
            ptr=ptr.get_link();
        }
        ptr.set_link(new_node);
        size++;
    }
    public void insert_before(int val1,int posn1){
        Node new_node = new Node (val1,null);
        Node ptr = head;
        Node pptr = head;
        while(ptr.get_data()!=posn1){
            pptr=ptr;
            ptr=ptr.get_link();
        }
        pptr.set_link(new_node);
        new_node.set_link(ptr);
        size++;
    }
    public void del_first(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            head = head.get_link();
            size--;
        }
    }
    public void del_last(){
        Node ptr;
        Node pptr;
        if(head==null){
            System.out.println("Empty");
        }
        else{
            ptr=head;
            pptr=head;
            while(ptr.get_link()!=null){
                pptr=ptr;
                ptr=ptr.get_link();
            }
            pptr.set_link(null);
            size--;
        }
    }
    public void del_before(int val2){
        Node ptr=head;
        Node pptr;
        while(ptr.get_data()!=val2){
            ptr=ptr.get_link();
        }
        pptr=ptr;
        ptr.set_link(pptr);
        size--;
    }
    public void del_after(int val3){
        Node ptr=head;
        while(ptr.get_data()!=val3) {
            ptr=ptr.get_link();
        }
        ptr.set_link(ptr.get_link().get_link());
        size--;
    }
    public void display(){
        Node ptr = head;
        while(ptr.get_link()!=null){
            System.out.print(ptr.get_data()+"->");
            ptr=ptr.get_link();
        }
        System.out.print(ptr.get_data()+"\n");
    }
    public int get_size(){
        return size;
    }
}
public class  s_linked_list{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Singly Linked List options");
        /* Creating object of class Linked_List */
        Linked_List list=new Linked_List();
        char ch;
        /*  Perform list operations  */
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Linked List size");
            System.out.println("Enter your choice");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Insert options--");
                    do{
                        System.out.println("1. Insert at beginning");
                        System.out.println("2. Insert at end");
                        System.out.println("3. Insert before the Position");
                        System.out.println("4. Insert after the Position");
                        int choice1=sc.nextInt();
                        switch(choice1)
                        {
                            case 1:
                                System.out.println("Insert at Beginning");
                                System.out.println("Value");
                                int a=sc.nextInt();
                                list.insert_start(a);
                                list.display();
                                break;
                            case 2:
                                System.out.println("Insert at End");
                                System.out.println("Value");
                                int b=sc.nextInt();
                                list.insert_end(b);
                                list.display();
                               break;
                            case 3:
                               System.out.println("Insert before Position: ");
                               int d=sc.nextInt();
                               System.out.println("Enter Value");
                               int c=sc.nextInt();
                               list.insert_before(c, d);
                               list.display();
                              break;
                            case 4:
                              System.out.println("Insert after Position: ");
                              int e=sc.nextInt();
                              System.out.println("Enter Value");
                              int f=sc.nextInt();
                              list.insert_after(f, e);
                              list.display();
                             break;
                        }
                        System.out.println("Do you want to continue");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 2:
                    System.out.println("Delete options--");
                    do{
                        System.out.println("1. Delete at Beginning");
                        System.out.println("2. Delete at End");
                        System.out.println("3. Delete at before position");
                        System.out.println("4. Delete at after position");
                        int choice2=sc.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("Delete at Beginnig");
                                list.del_first();
                                list.display();
                                break;
                            case 2:
                                System.out.println("Delete at end");
                                list.del_last();
                                list.display();
                                break;
                            case 3:
                                System.out.println("Delete before position: ");
                                int g = sc.nextInt();
                                list.del_before(g);
                                list.display();
                                break;
                            case 4:
                                System.out.println("Delete after position: ");
                                int h = sc.nextInt();
                                list.del_after(h);
                                list.display();
                                break;
                                }
                        System.out.println("Do you want to continue");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 3:
                    System.out.println("Your linked list is");
                    list.display();
                    break;
                case 4 : 
                    System.out.println("Size of Linked List is= "+ list.get_size() +" \n");
                    break;     
                }
            list.display();
            System.out.println("Do you want to continue");
            ch=sc.next().charAt(0);
        }
        while(ch == 'y'||ch =='Y');
    }
}