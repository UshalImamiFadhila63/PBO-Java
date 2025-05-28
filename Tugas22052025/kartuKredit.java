/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas22052025;

/**
 *
 * @author asus
 */
public class kartuKredit extends pembayaran implements metodePembayaran {
      public kartuKredit(double totalBayar) {
        super(totalBayar);
    }

  
    @Override
    public void pilihMetode() {
        System.out.println("Metode: Kartu Kredit");
    }

      @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Kartu Kredit:");
        System.out.println("1. Gesek kartu di mesin EDC");
        System.out.println("2. Masukkan PIN");
        System.out.println("3. Transaksi Rp" + totalBayar + " berhasil");
        System.out.println("Pembayaran selesai!");
    }
}
