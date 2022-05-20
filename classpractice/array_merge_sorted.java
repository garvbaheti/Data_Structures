import java.util.Scanner;


public class array_merge_sorted{
	static int[] mergeand_sort(int a[],int b[],int c[]){
		int i=0,j=0,k=0;
		while( i<(a.length) && j<(b.length) )
	{ 
		if (a[i] < b[j]){
			c[k++] = a[i++];
		}
		else{	
            c[k++]= b[j++];
		}
	}
	while(i<(a.length)){
        c[k++]= a[i++];
	}
	while(j<(b.length)){ 
		
			c[k++]= b[j++];
	}
	return c;
	}
    public static void main(String[] args){
		
		
		linear_search ls = new linear_search();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		ls.take_input(a,size1,sc);
		
		System.out.println("Enter Size of Array2: ");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		ls.take_input(b,size2,sc);
		// int b[] = {1,3, 8, 10, 18,23};
		
		int c[]= new int [a.length+b.length];
		c = mergeand_sort(a, b, c);
		
		ls.print_all(c);
		// for (int l=0;l<(a.length+b.length) ;l++){
		// 	System.out.print(c[l]+ " ");
		// }
    }
}