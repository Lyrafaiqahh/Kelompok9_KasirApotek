import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System.out.print("Masukkan jumlah peserta yang mengikuti seleksi: ");
        int jumlahPeserta = input.nextInt();

        for (int i = 1; i <= jumlahPeserta; i++) {
            System.out.println("\nData peserta ke-" + i + ":");

            System.out.print("Masukkan nilai tes potensi akademik: ");
            double tesPotensiAkademik = input.nextDouble();

            System.out.print("Masukkan nilai tes Bahasa Inggris: ");
            double tesBahasaInggris = input.nextDouble();

            System.out.print("Masukkan nilai tes nasionalisme: ");
            double tesNasionalisme = input.nextDouble();

            double rataRata = (tesPotensiAkademik + tesBahasaInggris + tesNasionalisme) / 3.0;

            System.out.println("Nilai rata-rata peserta ke-" + i + " adalah: " + rataRata);
        }  


        
    }
}