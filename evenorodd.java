import java.util.*;
public class evenorodd {
    public static void main(String e[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the num: ");
        int a = s.nextInt();
        if(a%2 == 0){
            System.out.println(a+ " is an even number");
        }
        else{
            System.out.println(a+ " is an odd number");
        }
    }
}
