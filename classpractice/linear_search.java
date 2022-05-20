import java.util.Scanner;

public class linear_search {

    public static void search_norm(int[] array,int key){
        System.out.println("Element is at index: ");
        for (int j=0;j<array.length;j++){
            if (array[j]==key){
                System.out.println(j);
            }
        }
    }

    public static void print_all(int[] array){
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }

    public static void take_input(int[] array,int size,Scanner sc){
        int i=0;
        System.out.println("Enter elements of array: ");
        do{
            array[i++]=sc.nextInt();
        }while(i<size);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        // System.out.println("Enter elements of array: ");
        int arr[] = new int[size];

        take_input(arr,size,sc);

        print_all(arr);
        
        System.out.println("Enter element to be searched in array: ");
        int key=sc.nextInt();
        search_norm(arr,key);
        sc.close();
        
    }
}