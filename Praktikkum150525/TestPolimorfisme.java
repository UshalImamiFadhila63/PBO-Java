/*
 * Name : Ushal Imami Fadhila
 * NIM : 2401083013
 * Kelas : TK 1A
 */
package Praktikkum150525;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestPolimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("\n=== PPraktikum 15 05 2025===");
        System.out.println("Ushal Imami Fadhila");
        System.out.println("2401083013");
        System.out.println("TK 1A");
        System.out.println("-------------------------");

        System.out.println("Input Spesifikasi Kendaraan:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = input.nextInt();
        input.nextLine();

        System.out.print("Warna Kendaraan: ");
        String warna = input.nextLine();

        Kendaraan kendaraan = new Kendaraan(jmlRoda, warna);
        System.out.println("\n===Data Kendaraan===");
        kendaraan.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Mobil:");
        System.out.print("Bahan Bakar Mobil: ");
        String bahanBakar = input.nextLine();

        System.out.print("Kapasitas Mesin Mobil (cc): ");
        int kapasitasMesin = input.nextInt();
        input.nextLine();

        Mobil mobil = new Mobil(bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Mobil===");
        mobil.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Sepeda:");
        System.out.print("Jumlah Sadel Sepeda: ");
        String jmlSadel = input.nextLine();

        System.out.print("Jumlah Gir Sepeda: ");
        int jmlGir = input.nextInt();
        input.nextLine();

        Sepeda sepeda = new Sepeda(jmlSadel, jmlGir, jmlRoda, warna);
        System.out.println("\n===Data Sepeda===");
        sepeda.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Truk:");
        System.out.print("Muatan Maksimal Truk (kg): ");
        int muatanMaks = input.nextInt();
        input.nextLine();

        Truk truk = new Truk(muatanMaks, bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Truk===");
        truk.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Taksi:");
        System.out.print("Tarif Awal Taksi (Rp): ");
        int tarifAwal = input.nextInt();

        System.out.print("Tarif Per KM Taksi (Rp): ");
        int tarifPerKm = input.nextInt();
        input.nextLine();

        Taksi taksi = new Taksi(tarifAwal, tarifPerKm, bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Taksi===");
        taksi.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Sepeda Listrik:");
        System.out.print("Jarak Tempuh Sepeda Listrik (km): ");
        int jarakTempuh = input.nextInt();

        System.out.print("Kecepatan Maks Sepeda Listrik (km/h): ");
        int kecepatanMaks = input.nextInt();
        input.nextLine();

        SepedaListrik sepedaListrik = new SepedaListrik(kecepatanMaks, jarakTempuh, jmlSadel, jmlGir, jmlRoda, warna);
        System.out.println("\n===Data Sepeda Listrik===");
        sepedaListrik.display();
        System.out.println("\n-------------------------");
    }
}