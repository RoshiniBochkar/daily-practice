import java.util.*;
public class numbertriangle {
    public static void main(String[] z){
        Scanner s = new Scanner(System.in);
        System.out.print("enter start number: ");
        int m = s.nextInt();
        System.out.print("enter end number: ");
        int n = s.nextInt();
        for(int i = m; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
