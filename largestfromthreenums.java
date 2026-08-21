import java.util.*;
public class largestfromthreenums{
    public static void main(String f[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st num: ");
        int a = s.nextInt();
        System.out.print("enter 2nd num: ");
        int b = s.nextInt();
        System.out.print("enter 3rd num: ");
        int c = s.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+ " is largest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+ " is largest number");
        }
        else{
            System.out.println(c+ " is a largest number");
        }
    }
}