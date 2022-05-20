import java.util.Scanner;

class stackop{

    static int size,top,stack[];
    static int count =0;
    stackop(int s){
        size = s;
        top = -1;
        stack = new int[size];
    }

    static boolean Overflow(){
        if (size-1 == top) {
            System.out.println("Stack is full");
            return true;
        }
        else{return false;}
    }

    static boolean Underflow(){
        if (top == -1) {
            System.out.printf("\nStack is empty\n");
            return true;
        }
        else{return false;}
    }

    static void push(int element){
        if(Overflow()){}
        else{
            top++;
            stack[top]=element;
            count++;
        }
    }

    static void pop(){
        if(Underflow()){}
        else{
            System.out.println("Element Deleted: "+stack[top]);
            top--;
            count--;
        }
    }
    static void display(){
        if(Underflow()){}
        else{
            int i = top;
            while(i>=0){
                System.out.print(stack[i]+" ");
                i--;
            }
            System.out.println();
        }
    }
    static void front(){
        if(Underflow()){}
        else{
            System.out.println(stack[top]);
        }
    }
}
public class stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Integer Stack ");
        int size = sc.nextInt();

        // Create a queue 
        stackop st = new stackop(size);

        char ch;

        do{
            System.out.println("\n Queue Operations using array");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. total no of element in Stack");
            System.out.println("7. Traversal");

            int choice = sc.nextInt();

           switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to stack");
                st.push(sc.nextInt());                     
                break;                         
            case 2 :
                System.out.println("Poped Element = " );
                st.pop();
                break;                         
            case 3 :         
                System.out.println("Peek Element = ");
                st.front();
                break;                         
            case 4 : 
                System.out.println("Empty status = " );
                if(st.Underflow()){}
                else{System.out.print("Not Empty");}
                break;                
            case 5 :
                System.out.println("Full status = " );
                if(st.Overflow()){}
                else{System.out.print("Not Full");}
                break;                 
            case 6 : 
                System.out.print("Size = " );
                if(st.Underflow()){}
                else{System.out.print(st.count+"\n");}
                break; 
            case 7 :
                if(st.Underflow()){}
                else{st.display();}
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
                     
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0); 
 
        } while (ch == 'Y'|| ch == 'y');
        sc.close();
    }
    
}
