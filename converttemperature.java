import java.util.*;
public class converttemperature{
    public static void main(String d[]){
        Scanner s = new Scanner(System.in);

        System.out.println("===Temperature Conversion===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");

        int choice = s.nextInt();
        System.out.print("Enter temperature: ");
        double temp = s.nextDouble();
        double result = 0;

        if(choice == 1){
            result = (temp*9)/5 + 32;
            System.out.println(temp + "°C" + " = " + result + "°F");
        }
        else if(choice == 2){
            result = (temp-32)*5/9;
            System.out.println(temp + "°F" + " = " + result + "°C");
        }
        else if(choice == 3){
            result = temp + 273.15;
            System.out.println(temp + "°C" + " = " + result + "°K");
        }
        else if(choice == 4){
            result = temp - 273.15;
            System.out.println(temp + "°K" + " = " + result + "°C");
        }
        else if(choice == 5){
            result = (temp-32)*5/9 + 273.15;
            System.out.println(temp + "°F" + " = " + result + "°K");
        }
        else if(choice == 6){
            result = (temp - 273.15)*9/5 + 32;
            System.out.println(temp + "°K" + " = " + result + "°F");
        }
        else{
            System.out.println("Invalid choice choose between 1-6 only");
        }
    }
}