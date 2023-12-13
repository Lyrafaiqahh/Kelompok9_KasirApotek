import java.util.Scanner;

public class cek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opsi;
        do {
            System.out.println("Pilih opsi:");
            System.out.println("1. Lihat Data");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            opsi = scanner.nextInt();

            switch (opsi) {
                case 1:
                    tampilkanTabel();
                    break;
                case 2:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (opsi != 2);
    }

    private static void tampilkanTabel() {
        // Data contoh (bisa diganti dengan data sesuai kebutuhan)
        String[][] data = {
                {"001", "John", "25"},
                {"002", "Doe", "30"},
                {"003", "Jane", "22"}
        };

        int numRows = data.length;
        int numCols = data[0].length;

        // Menampilkan header dengan garis
        tampilkanGaris(numCols);
        for (int j = 0; j < numCols; j++) {
            System.out.print("| " + data[0][j] + " ");
        }
        System.out.println("|");
        tampilkanGaris(numCols);

        // Menampilkan baris data dengan garis
        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("| " + data[i][j] + " ");
            }
            System.out.println("|");
            tampilkanGaris(numCols);
        }
    }

    private static void tampilkanGaris(int numCols) {
        for (int j = 0; j < numCols; j++) {
            System.out.print("+--------------");
        }
        System.out.println("+");
    }
}
