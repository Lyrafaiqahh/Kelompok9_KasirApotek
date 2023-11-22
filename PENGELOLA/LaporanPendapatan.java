import java.util.Scanner;
    public class LaporanPendapatan {
        public static void main(String[] args) {
        String stokObat;
        int pilih,InputBatuk;
        boolean laporan;
        Scanner input = new Scanner(System.in);
            
            //INPUT DATAOBAT AGAR VARIABEL DIDETEKSI DI NESTED LOOP 
            
            // NESTED LOOP JOBSHEET 11
            while (true) {
            System.out.println("LAPORAN PENDAPATAN");
            System.out.println("Kategori Obat : \n1.Batuk \n2.Pilek \n3.Pusing");
            System.out.println("-------------------------------------------------");
            System.out.print("Pilih Salah satu : ");
            pilih = input.nextInt(); 

            if (pilih == 1){
                System.out.println("OBAT BATUK");
                System.out.println("-----------------------------------");
                System.out.println("1.Actifed cough \n2.Woods Antitussive \n3.Sanadryl DMP \n4.Siladex Antitussive \n5.Vicks Formula 44 Syrup \n6.Benadryl Original \n7.Bodrex Flu & Batuk PE \n8.Konidin \n9.Anadex \n10.Vectrine Dry Syrup");
                System.out.println("-----------------------------------");
                System.out.print("Pilih salah satu : ");
                InputBatuk = input.nextInt();

                
                if (InputBatuk == 1){
                    System.out.println("ACTIFED COUGH");
                    System.out.println("Penjualan hari ini terjual dengan total"  );
                    //array 2 dimensi stok obat yang terbeli 
                    System.out.println("Apakah ingin memeriksa stok obat? (iya/tidak)")
                    stokObat = input.nextLine();

                    if (stokObat.equalsIgnoreCase("iya")) {
                        //MASUKKIN CODINGAN STOK OBAT / DATA OBAT
                    }
                    else if (stokObat.equalsIgnoreCase("tidak")){
                        // KELUAR KE MENU KATEGORI OBAT
                    }
                }

                
                    else if (InputBatuk == 2){
                    System.out.println("WOODS ANTITUSSIVE");
                    System.out.println("Penjualan hari ini terjual dengan total"  );
                }
                    else if (InputBatuk == 3) {
                    System.out.println("SANADRYL DMP");
                    System.out.println("Penjualan hari ini terjual dengan total"  );
               
                }
                    else {
                    System.out.println("MAAF INPUTAN ANDA SALAH!");
                }
            }

        
            
        }
                }
            }
     