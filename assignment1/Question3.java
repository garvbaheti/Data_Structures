class Stack {
	private int top = -1, size;
    private int[] st;

    Stack(int size) {
        this.size = size;
        st = new int[size];
    }

    int sizeStack() {
        return top + 1;
    }
    
    boolean overflow() {
        return top == size - 1;
    }

    int peek(){
		return st[top];
	}

    boolean underflow() {
        return top == -1;
    }

    void push(int a) {
        if (overflow()) {
            System.out.println("Stack is full");
            return;
        }

        top += 1;
        st[top] = a;
    }

    int pop() {
        if (underflow()) {
            System.out.println("The stack is already empty.");
            return -1;
        }

        int popped = st[top];
        top = top - 1;
        return popped;
    }

    void traverse() {
        if (underflow()) {
            System.out.println("The stack is empty.");
        }
        for (int i = top; i > -1; i--) {
            System.out.println(st[i] + " ");
        }
        System.out.println();
    }
}
class Queue
{
	private int size;
	private Stack s1; 
	private Stack s2;
	Queue(int s){
		this.size = s;
		s1 = new Stack(size);
		s2 = new Stack(size);
	}
	
	void enQueue(int a)
	{
		while (!s1.underflow())
		{
			s2.push(s1.pop());
		}

		s1.push(a);

		while (!s2.underflow())
		{
			s1.push(s2.pop());
		}
	}

	int deQueue()
	{
		if (s1.underflow())
		{
			System.out.println("Q is Empty");
			System.exit(0);
		}
		int a = s1.peek();
		s1.pop();
		return a;
	}
}

class Question3
{
	public static void main(String[] args)
	{
		Queue q = new Queue(4);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}