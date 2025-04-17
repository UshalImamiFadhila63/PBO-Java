package Praktikkum170425;

import java.util.Scanner;

public class pesawatMain3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = 0;
        int pilihan;
        Pesawat[] daftarPesawat = null; // Deklarasi daftarPesawat di luar

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Input Data Pesawat");
            System.out.println("2. Tampilkan Daftar Pesawat");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");
            pilihan = in.nextInt();
            in.nextLine(); // membersihkan new line

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan banyak pesawat = ");
                    jumlah = in.nextInt();
                    in.nextLine(); // membersihkan new line
                    daftarPesawat = new Pesawat[jumlah]; // Inisialisasi di sini

                    // Input data pesawat
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Input Data Pesawat ke " + (i + 1));
                        System.out.print("Nama Pesawat: ");
                        String nama = in.nextLine();
                        System.out.print("Tahun Produksi: ");
                        int tahunProduksi = in.nextInt();
                        System.out.print("Menggunakan mesin? (true/false): ");
                        boolean mesin = in.nextBoolean();
                        System.out.print("Jumlah maksimum penumpang: ");
                        int muatan = in.nextInt();
                        in.nextLine(); // membersihkan new line

                        daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
                    }
                    break;

                case 2:
                    // Menampilkan daftar pesawat
                    if (daftarPesawat != null && jumlah > 0) {
                        System.out.println("\t DAFTAR PESAWAT\n");
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("Data Pesawat ke " + (i + 1) + "==");
                            daftarPesawat[i].Cetak();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Belum ada data pesawat yang dimasukkan.");
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);

        in.close();
    }
}