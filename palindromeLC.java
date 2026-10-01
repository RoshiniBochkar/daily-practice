import java.util.*;
public class palindromeLC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x<0){
            System.out.println(x+ " is not a Palindrome");
            return;
        }
        int original = x;
        int reversed = 0;
        while(x>0){
            int lastdigit = x%10;
            reversed = reversed*10 + lastdigit;
            x = x/10;
        }
        if(original == reversed){
            System.out.println(original+ " is a Palindrome");
        }
        else{
            System.out.println(original+ " is not a Palindrome");
        }
    }
}