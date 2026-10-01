import java.util.Scanner;

public class fibonacci{
    public static void main(String[] z){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = scan.nextInt();
        if(n==0){
            System.out.println(n);
        }if(n==1){
            System.out.println(n);
        }
        int a = 0;
        int b = 1;
        int sum;
        for(int i = 2; i <= n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(b);
    }
}