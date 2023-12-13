import java.util.Scanner;

public class ContohSoal {

    public static void main(String[] args) {
        // Memanggil fungsi A
        fungsiA();
    }

    public static void fungsiA() {
        System.out.println("Mulai fungsi A");

        // Memanggil fungsi B dengan input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (true/false): ");
        boolean nilaiInput = scanner.nextBoolean();
        fungsiB(nilaiInput);

        // Kode ini akan dieksekusi setelah fungsiB() selesai
        System.out.println("Selesai fungsi A");
    }

    public static void fungsiB(boolean kondisi) {
        System.out.println("Mulai fungsi B");

        if (kondisi) {
            // Jika kondisi benar, return untuk keluar dari fungsiB
            return;
        } else {
            // Kode ini tidak akan dieksekusi jika kondisi benar
            System.out.println("Else if di fungsi B");
        }

        // Kode ini hanya akan dieksekusi jika kondisi benar
        System.out.println("Selesai fungsi B");
    }
}
