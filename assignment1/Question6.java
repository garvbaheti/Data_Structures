public class  Question6{
    public static void Stcopy(Stack s, Stack c){
        if(!s.underflow()){
            int x = s.pop();
            Stcopy(s,c);
            c.push(x);
            s.push(x);
        }
    }
    public static void main(String[] args){
        Stack s = new Stack (5);
        Stack sc = new Stack (5);
        s.push(7);
        s.push(6);
        Stcopy(s, sc);
        sc.traverse();
    }
}