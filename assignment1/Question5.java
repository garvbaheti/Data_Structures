public class Question5{
    static int del_even(Stack s){
        int flag=0;
        Stack temp = new Stack(5);
        while(!s.underflow()){
            int c = s.pop();
            if (c%2==1){
                temp.push(c);
            }
            else{
                flag++;
            }
        }
        while(!temp.underflow()){
            s.push(temp.pop());
        }
        return flag;
    }
    public static void main(String[] args){
        Stack se = new Stack(5);
        se.push(1);
        se.push(2);
        se.push(3);
        se.push(4);
        se.push(5);
        System.out.println(del_even(se));
        se.traverse();
    }
}