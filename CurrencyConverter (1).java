import java.util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define conversion rates
        double usdToEurRate = 0.85; // 1 USD = 0.85 EUR
        double usdToInrRate = 74.50; // 1 USD = 74.50 INR
        double eurToUsdRate = 1.18; // 1 EUR = 1.18 USD
        double eurToInrRate = 88.00; // 1 EUR = 88.00 INR
        double inrToUsdRate = 0.013; // 1 INR = 0.013 USD
        double inrToEurRate = 0.011; // 1 INR = 0.011 EUR

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to INR");
        System.out.println("3. EUR to USD");
        System.out.println("4. EUR to INR");
        System.out.println("5. INR to USD");
        System.out.println("6. INR to EUR");
        System.out.print("Choose the conversion (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEurRate;
                System.out.printf("Converted amount: %.2f EUR%n", convertedAmount);
                break;
            case 2:
                convertedAmount = amount * usdToInrRate;
                System.out.printf("Converted amount: %.2f INR%n", convertedAmount);
                break;
            case 3:
                convertedAmount = amount * eurToUsdRate;
                System.out.printf("Converted amount: %.2f USD%n", convertedAmount);
                break;
            case 4:
                convertedAmount = amount * eurToInrRate;
                System.out.printf("Converted amount: %.2f INR%n", convertedAmount);
                break;
            case 5:
                convertedAmount = amount * inrToUsdRate;
                System.out.printf("Converted amount: %.2f USD%n", convertedAmount);
                break;
            case 6:
                convertedAmount = amount * inrToEurRate;
                System.out.printf("Converted amount: %.2f EUR%n", convertedAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}