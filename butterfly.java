import java.util.*;
public class butterfly {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int i;
        int j;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(j = 1; j <= 2*n - 2*i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = n; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(j = 1; j <= 2*n - 2*i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
