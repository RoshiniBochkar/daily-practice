import java.util.*;
public class averageofNnums {
    public static void main(String[] h){
        Scanner s = new Scanner(System.in);

        int n;
        double sum = 0;
        double average;
        int i;
        System.out.print("Enter how many nums: ");
        n = s.nextInt();
        for(i = 0; i < n; i++){
            System.out.print("Enter Number " + (i+1) + ": ");
            double num = s.nextInt();
            sum = sum+num;
        }
        average = sum/n;
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Average of all numbers: " + average);
    }
}
