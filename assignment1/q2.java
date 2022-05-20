import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int x = scan.nextInt();
        int[] array = new int[num];
        int i;
        for(i = 0; i<num; i++) {
            array[i] = scan.nextInt();
        }
        i = 0;
        while(i<x) {
            int temp = array[0];
            for(int j=0; j<num-1;j++) {
                array[j] = array[j+1];
            }
            array[num-1] = temp;
            i++;
        }

        for(i=0; i<num;i++) {
            System.out.print(array[i]+" ");
        }
    }
}