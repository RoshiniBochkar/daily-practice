import java.util.*;
public class castingdemo {
    public static void main(String[] j){
        Scanner s = new Scanner(System.in);
        System.out.print("enter double num to cast into int: ");
        double d = s.nextDouble();
        int i;
        System.out.println("original number: "+d);
        i = (int) d;
        System.out.println("after casting into int: "+i);
    }
}
