import java.util.*;
public class MenuDrivenStoreData {
    private static Map<String, Map<String, Double>> storeData = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1.Add Store Data");
            System.out.println("2.Display Store Products");
            System.out.println("3.Highest Priced Product");
            System.out.println("4.Find Stores by Product");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addStoreData();
                    break;
                case 2:
                    displayStoreProducts();
                    break;
                case 3:
                    highestPricedProduct();
                    break;
                case 4:
                    findStoresByProduct();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
    }
    private static void addStoreData() {
        System.out.print("Enter Store ID: ");
        String storeId = sc.nextLine();
        Map<String, Double> products = storeData.getOrDefault(storeId, new HashMap<>());
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products.put(name, price);
        }
        storeData.put(storeId, products);
    }
    private static void displayStoreProducts() {
        System.out.print("Enter Store ID: ");
        String storeId = sc.nextLine();
        Map<String, Double> products = storeData.get(storeId);
        if (products == null) {
            System.out.println("No Data");
            return;
        }
        for (Map.Entry<String, Double> e : products.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    private static void highestPricedProduct() {
        System.out.print("Enter Store ID: ");
        String storeId = sc.nextLine();
        Map<String, Double> products = storeData.get(storeId);
        if (products == null) {
            System.out.println("No Data");
            return;
        }
        String pname = "";
        double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> e : products.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                pname = e.getKey();
            }
        }
        System.out.println(pname + " : " + max);
    }
    private static void findStoresByProduct() {
        System.out.print("Enter product name: ");
        String product = sc.nextLine();
        boolean found = false;
        for (Map.Entry<String, Map<String, Double>> s : storeData.entrySet()) {
            if (s.getValue().containsKey(product)) {
                System.out.println(s.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}