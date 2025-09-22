import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose conversion type (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        double converted = convertTemperature(choice, temperature);
        displayConversion(choice, temperature, converted);
        
        scanner.close();
    }
    
    public static double convertTemperature(int choice, double temperature) {
        if (choice == 1) {
            return fahrenheitToCelsius(temperature);
        } else {
            return celsiusToFahrenheit(temperature);
        }
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static void displayConversion(int choice, double original, double converted) {
        if (choice == 1) {
            System.out.printf("%.2f°F = %.2f°C\n", original, converted);
        } else {
            System.out.printf("%.2f°C = %.2f°F\n", original, converted);
        }
    }
}