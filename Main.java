import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[size];

        for (int i = 0; i < size; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        System.out.println("\n--- Invoice Details ---");

        for (Invoice invoice : invoices) {
            System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        }

        scanner.close();
    }
}
