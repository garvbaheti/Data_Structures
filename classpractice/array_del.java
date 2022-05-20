import java.util.Scanner;

public class array_del {
    static Object resizeArray (Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int preserveLength = Math.min(oldSize, newSize);
          if (preserveLength > 0)
              System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        return newArray;
  }
    public static void main(String[] args) {
        int i,pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        
        int size = sc.nextInt();
        int s[] = new int[size];
        System.out.println("Enter the elemets of array: ");
        for(i=0;i<size;i++){
            s[i]=sc.nextInt();
        }
        System.out.println("Array: ");
        for(int j=0;j<size;j++){
            System.out.println(s[j]);
        }
        
        System.out.println("Enter the position to be deleted: ");
        pos = sc.nextInt();

        int p =pos;
        while(p<=size-1){
            s[p-1]=s[p];
            p++;
        }
        //size-=1;

        s = (int[])resizeArray(s, size);
        System.out.println("Array: ");

        for(int k=0;k<s.length;k++){
            System.out.println(s[k]);
        }
    
    }
}

/*
import java.util.Scanner;

public class delete {

    public static void main(String[] args) {
        int i,pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        
        int size = sc.nextInt();
        int s[] = new int[size];
        System.out.println("Enter the elemets of array: ");
        for(i=0;i<size;i++){
            s[i]=sc.nextInt();
        }
        System.out.println("Array: ");
        for(int j=0;j<size;j++){
            System.out.println(s[j]);
        }
        
        System.out.println("Enter the position to be deleted: ");
        pos = sc.nextInt();

        int p =pos+1;
        while(p<=size-1){
            s[p-1]=s[p];
            p++;
        }
        if (pos<=size){
            s[size-1]=0;
            size-=1;
        }
            

        System.out.println("Array: ");

        for(int k=0;k<size;k++){
            System.out.println(s[k]);
        }
    
    }
} */