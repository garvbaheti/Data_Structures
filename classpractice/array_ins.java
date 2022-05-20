import java.util.*;
class array_ins{
    public static void main(String[] args){
        int val,i,pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        
        int size = sc.nextInt();
        int s[] = new int[size+1];
        System.out.println("Enter the elemets of array: ");
        for(i=0;i<size;i++){
            s[i]=sc.nextInt();
        }
        System.out.println("Array: ");
        for(int j=0;j<size;j++){
            System.out.println(s[j]);
        }
        System.out.println("Enter the value to be inserted: ");
        val = sc.nextInt();

        System.out.println("Enter the position to be inserted: ");
        pos = sc.nextInt();
        
        int p =size-1;
        while(p>=pos){
            s[p+1]=s[p];
            p--;
        }
        size+=1;
        s[pos]=val;
        
        System.out.println("Array: ");
        for(int k=0;k<size;k++){
            System.out.println(s[k]);
        }
        
        sc.close();
    }
}
