import java.util.*;
public class fizzbuzz {
    public static void main(String[] z){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuss");
            } else if(i%3==0 && i%5!=0){
                result.add("Fizz");
            } else if(i%3!=0 && i%5==0){
                result.add("Buss");
            } else{
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
    }
}
