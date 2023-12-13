import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class struk {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Item> items = initItems();
        List<Purchase> purchases = new ArrayList<>();

        System.out.println("Selamat datang di Program Kasir!");

        do {
            displayMenu(items);
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= items.size()) {
                Item selectedItem = items.get(choice - 1);
                System.out.print("Jumlah yang ingin dibeli: ");
                int quantity = scanner.nextInt();

                if (quantity > 0) {
                    Purchase purchase = new Purchase(selectedItem, quantity);
                    purchases.add(purchase);
                    System.out.println("Item berhasil ditambahkan ke keranjang!");
                } else {
                    System.out.println("Jumlah harus lebih dari 0. Item tidak ditambahkan ke keranjang.");
                }
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.print("Apakah Anda ingin menambah item lainnya? (y/t): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        // Cetak Struk
        System.out.println("\n===== Struk Pembelian =====");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Item", "Harga", "Jumlah", "Total");
        System.out.println("===========================");
        int totalPembelian = 0;

        for (Purchase purchase : purchases) {
            System.out.printf("%-20s%-10d%-10d%-10d\n",
                    purchase.getItem().getName(),
                    purchase.getItem().getPrice(),
                    purchase.getQuantity(),
                    purchase.getTotal());
            totalPembelian += purchase.getTotal();
        }

        System.out.println("===========================");
        System.out.printf("%-40s%-10d\n", "Total Pembelian", totalPembelian);
        System.out.println("===========================");

        System.out.println("\nTerima kasih telah berbelanja!");
    }

    private static void displayMenu(List<Item> items) {
        System.out.println("\n===== Menu =====");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d. %-15sRp%-10d\n", i + 1, items.get(i).getName(), items.get(i).getPrice());
        }
        System.out.println("=================");
        System.out.print("Pilih item yang ingin dibeli (1-" + items.size() + "): ");
    }

    private static List<Item> initItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item A", 5000));
        items.add(new Item("Item B", 10000));
        items.add(new Item("Item C", 15000));
        items.add(new Item("Item D", 20000));
        return items;
    }

    static class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    static class Purchase {
        private Item item;
        private int quantity;

        public Purchase(Item item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        public Item getItem() {
            return item;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getTotal() {
            return item.getPrice() * quantity;
        }
    }
}

