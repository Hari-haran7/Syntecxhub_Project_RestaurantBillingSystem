import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        MenuItem burger = new MenuItem("Burger", 120);
        MenuItem pizza = new MenuItem("Pizza", 180);
        MenuItem coke = new MenuItem("Coke", 40);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Burger - Rs.120");
            System.out.println("2. Pizza - Rs.180");
            System.out.println("3. Coke - Rs.40");
            System.out.println("4. Remove Last Item");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                bill.addItem(burger, qty);

            } else if (choice == 2) {

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                bill.addItem(pizza, qty);

            } else if (choice == 3) {

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                bill.addItem(coke, qty);

            } else if (choice == 4) {

                bill.removeLastItem();

            } else if (choice == 5) {

                bill.generateBill();

            } else if (choice == 6) {

                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}