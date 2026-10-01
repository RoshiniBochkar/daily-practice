import java.util.*;
public class validpalindromeLC {
    public static void main(String[] z){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scan.nextLine();
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println(s + " is not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(s + " is a Palindrome");
    }
}
