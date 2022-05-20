import java.util.*;

class reverse_string{
    public String reverse_string(String S){
        int i=0;
        String string_rev = "";
        String [] all_words = S.split(" ");


        while(i < all_words.length){
            String word = all_words[i];
            String rev = "";
            int j = word.length()-1;
            while(j >= 0){
                rev += word.charAt(j);
                j--;
            }

            string_rev += rev + " ";
            i++;
        }
        return string_rev;
    }
}
public class  Question2{
    public static void main(String[] args){
        reverse_string rs = new reverse_string();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = scan.nextLine();
        System.out.println(rs.reverse_string(sentence));
        scan.close();
    }
}