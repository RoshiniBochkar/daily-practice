import java.util.*;
public class averageoftwonums {
    public static void main(String[] i){
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1st num: ");

        double x = s.nextDouble();
        System.out.print("enter 2nd num: ");

        double y = s.nextDouble();
        System.out.println("average of "+x+" and "+y+" is: "+ (double)(x+y)/2);
    }
}
