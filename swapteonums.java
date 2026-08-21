import java.util.*;
public class swapteonums{
    public static void main(String[] k){
        Scanner s = new Scanner(System.in);
        System.out.println("===enter nums to swap===");
        System.out.print("enter a value: ");
        int x = s.nextInt();
        System.out.print("enter b value: ");
        int y = s.nextInt();
        System.out.println("before swap: a = "+x+" b = "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("after swap: a = "+x+" b = "+y);
        
    }
}