import java.util.*;
public class  Question9{
    public static int del_duplicate(int[] array){
        int index = 1;
        for(int i=1;i<array.length;i++){
            if(array[i] != array[index-1]){
                array[index++] = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter Numbers: ");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        if(size>0){
            System.out.print(del_duplicate(numbers));
        }
        sc.close();
    }
}