package Q5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static class MenuItem {
        private final String name;
        private final double price;

        private MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    private static final MenuItem[] ENTREES = {
            new MenuItem("Tofu Burger", 3.49),
            new MenuItem("Cajun Chicken", 4.59),
            new MenuItem("Buffalo Wings", 3.99),
            new MenuItem("Rainbow Fillet", 2.99)
    };

    private static final MenuItem[] SIDES = {
            new MenuItem("Rice Cracker", 0.79),
            new MenuItem("No-Salt Fries", 0.69),
            new MenuItem("Zucchini", 1.09),
            new MenuItem("Brown Rice", 0.59)
    };

    private static final MenuItem[] DRINKS = {
            new MenuItem("Cafe Mocha", 1.99),
            new MenuItem("Cafe Latte", 1.90),
            new MenuItem("Espresso", 2.49),
            new MenuItem("Oolong Tea", 0.99)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> order = new LinkedHashMap<>();
        Map<String, Double> prices = new LinkedHashMap<>();

        while (true) {
            printMainMenu();
            int categoryChoice = scanner.nextInt();

            if (categoryChoice == 0) {
                break;
            }

            MenuItem[] selectedCategory = getCategoryItems(categoryChoice);
            String categoryName = getCategoryName(categoryChoice);

            if (selectedCategory == null) {
                System.out.println("Invalid category selection.\n");
                continue;
            }

            printCategoryItems(categoryName, selectedCategory);
            System.out.print("Enter item ID (1-4): ");
            int itemId = scanner.nextInt();
            if (itemId < 1 || itemId > selectedCategory.length) {
                System.out.println("Invalid item ID.\n");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Quantity must be at least 1.\n");
                continue;
            }

            MenuItem item = selectedCategory[itemId - 1];
            addToOrder(order, prices, item, quantity);
            System.out.println("Added " + quantity + " x " + item.name + "\n");
        }

        printOrderSummary(order, prices);
    }

    private static void printMainMenu() {
        System.out.println("=== MyJava Burgers ===");
        System.out.println("1. Entree");
        System.out.println("2. Side Dish");
        System.out.println("3. Drink");
        System.out.println("0. Checkout");
        System.out.print("Select a category: ");
    }

    private static MenuItem[] getCategoryItems(int choice) {
        switch (choice) {
            case 1:
                return ENTREES;
            case 2:
                return SIDES;
            case 3:
                return DRINKS;
            default:
                return null;
        }
    }

    private static String getCategoryName(int choice) {
        switch (choice) {
            case 1:
                return "Entree";
            case 2:
                return "Side Dish";
            case 3:
                return "Drink";
            default:
                return "";
        }
    }

    private static void printCategoryItems(String categoryName, MenuItem[] items) {
        System.out.println("\n--- " + categoryName + " Menu ---");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-15s $%.2f%n", i + 1, items[i].name, items[i].price);
        }
    }

    private static void addToOrder(Map<String, Integer> order, Map<String, Double> prices, MenuItem item, int quantity) {
        order.put(item.name, order.getOrDefault(item.name, 0) + quantity);
        prices.put(item.name, item.price);
    }

    private static void printOrderSummary(Map<String, Integer> order, Map<String, Double> prices) {
        System.out.println("\n=== Order Summary ===");
        if (order.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        double total = 0.0;
        System.out.printf("%-18s %-10s %-8s %-10s%n", "Item", "Unit Price", "Qty", "Subtotal");
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String itemName = entry.getKey();
            int qty = entry.getValue();
            double unitPrice = prices.get(itemName);
            double subtotal = unitPrice * qty;
            total += subtotal;

            System.out.printf("%-18s $%-9.2f %-8d $%-9.2f%n", itemName, unitPrice, qty, subtotal);
        }
        System.out.printf("Overall Total: $%.2f%n", total);
    }
}
