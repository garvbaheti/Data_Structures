import java.util.*;
public class  Question8{
    public static void palindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1){
            System.out.println("--A Palindrome--");
        }
        else if(s.charAt(0) == s.charAt(s.length()-1)){
            palindrome(s.substring(1, s.length()-1));
        }
        else{
            System.out.println("--Not a Palindrome--");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Word to check for Palindrome: ");
        String word = scan.next();
        palindrome(word);
        scan.close();
    }
}