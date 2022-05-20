import java.util.Scanner;

public class binary_search{

    static void binarySearch(int arr[], int first, int last, int key){  

        int mid = (first + last)/2;  

        while( first <= last ){  

           if ( arr[mid] < key ){  
             first = mid + 1;     
           }
           
           else if ( arr[mid] == key ){  
             System.out.println("Element is found at index: " + mid);  
             break;  
           }
           else{
              last = mid - 1;
           }  
           mid = (first + last)/2;
           
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }  
      }  
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array");

        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Elements of Array"); 

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter Element to Search");

        int key = scan.nextInt();;  
        
        int last=arr.length-1;  
        
        binarySearch(arr,arr[0],last,key);     
        
        scan.close();

    }
}