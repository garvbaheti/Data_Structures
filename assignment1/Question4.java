import java.util.*;
public class  Question4{
    public static void main(String[] args){
        Stack s = new Stack(1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        while(num>0){
            int rem=num%2;
            s.push(rem);
            num/=2;
        }
        s.traverse();
        sc.close();
    }
}