import java.util.*;
public class  Question10{

    static void matrix_multiply(int A[][],int B[][]){
        if(B.length!=A[0].length){
            System.out.println("Not Possible");
        }
        else{
            int c[][] = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++){
                        c[i][j] += A[i][k] * B[k][j];}
                }
            }
            for (int l = 0; l < A.length; l++) {
                for (int m = 0; m < B[0].length; m++){
                    System.out.print(c[l][m] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter A Matrix Row: ");
        int r1 = sc.nextInt();
        System.out.println("Enter A Matrix Column: ");
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter A Matrix Elements: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter B Matrix Row: ");
        int r2 = sc.nextInt();
        System.out.println("Enter B Matrix Column: ");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter B Matrix Elements: ");
        for(int k=0;k<r2;k++){
            for(int l=0;l<c2;l++){
                b[k][l]=sc.nextInt();
            }
        }
        sc.close();
        matrix_multiply(a,b);
        
    }
}