/*
 * Nama : Ushal Imami Fadhila
 * NIM : 2401083013
 * Soal : Sebuah swalayan menjual tiga merek produk susu bayi. Swalayan tersebut mengadakan [rogram diskon yang berbeda untuk ketiga merek tersebu.
        >merek X : harga satu kotaknya adalah Rp. 40.000,-, Diskon 10% diberikan untuk pembelian minmal 3 kotak susu
        >merek Y : harga satu kotaknya adalah rP. 50.0000,-, Diskon 12% diberikan jika konsumen memilih lebih dari 3 kotak
        >merek Z : harga satu kotaknya adalah Rp. 60.000,-,Diskon 15% diberikan untuk pembelian susu ke 2, 3, dan seterusnya(harga kotak pertama tetap).
        buatlah program yang menghitung total pembelian, diskon (jika ada dan total [embayaran)
 */
package Tugas1;

import java.util.Scanner;


public class Soal5Swalayan {
    public static void main(String[] args) {
         int nX, nY, nZ;
        double totalX, totalY, totalZ, diskonX = 0, diskonY = 0 , diskonZ = 0;
        final int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        Scanner input = new Scanner(System.in);

        System.out.println("-- Pembelian Kotak Susu --");
        System.out.print("Jumlah merk X: ");
        nX = input.nextInt();
        System.out.print("Jumlah merk Y: ");
        nY = input.nextInt();
        System.out.print("Jumlah merk Z: ");
        nZ = input.nextInt();

        totalX = nX * hargaX;
        totalY = nY * hargaY;
        totalZ = nZ * hargaZ;

        if (nX >= 3)
            diskonX = totalX * 0.10;
        if (nY > 3)
            diskonY = totalY * 0.12;
        if (nZ > 1)
            diskonZ = (nZ - 1) * hargaZ * 0.15;
        
        double totalDiskon = diskonX + diskonY + diskonZ;
        double totalPembelian = totalX + totalY + totalZ;
        double totalBayar = totalPembelian - totalDiskon;
        
        System.out.println("Total Pembelian : Rp. " + totalPembelian);
        System.out.println("Total Diskon    : Rp. " + totalDiskon);
        System.out.println("Total Pembayaran: Rp. " + totalBayar);
    }
    
}
