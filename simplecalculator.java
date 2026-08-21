import java.util.*;
public class simplecalculator {
    public static void main(String c[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter action to perform(add, subtract, multiply, divide): ");

        String st = s.nextLine();
        System.out.print("enter 1st num: ");
        int a = s.nextInt();
        System.out.print("enter 2nd num: ");
        int b = s.nextInt();
        if(st.equals("add")){
            System.out.println("sum is : " + (a+b));
        }
        else if(st.equals("subtract")){
            System.out.println("diff is : " + (a-b));
        }
        else if(st.equals("multiply")){
            System.out.println("multiplication is : " + (a*b));
        }
        else if(st.equals("divide")){
            if(b == 0){
                System.out.println("numerator is not divisible by zero");
            }
            else{
                System.out.println("division is : " + (double)a/b);
            }
        }
        else{
            System.out.println("invalid");
        }
    }
}
