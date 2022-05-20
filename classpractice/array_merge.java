import java.util.Scanner;

public class array_merge{
    static int [] merge_array(int a[],int b[],int c[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<(a.length)){
            c[k++]= a[i++];
        }
        while(j<(b.length)){ 
            
                c[k++]= b[j++];
        }
        return c;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        linear_search ls = new linear_search();

        System.out.println("Enter Size of Array1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		ls.take_input(a,size1,sc);
		
		System.out.println("Enter Size of Array2: ");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		ls.take_input(b,size2,sc);

        int c[]= new int [a.length+b.length];
		c = merge_array(a, b, c);

        ls.print_all(c);

    }
}