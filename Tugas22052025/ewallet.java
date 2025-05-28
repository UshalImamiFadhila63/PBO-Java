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
public class ewallet extends pembayaran implements metodePembayaran {
   public ewallet(double totalBayar) {
        super(totalBayar);
    }

    
   @Override
    public void pilihMetode() {
        System.out.println("Metode: E-Wallet");
    }

   
   @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses E-Wallet:");
        System.out.println("1. Buka aplikasi e-wallet");
        System.out.println("2. Scan QR code");
        System.out.println("3. Bayar Rp" + totalBayar);
        System.out.println("Pembayaran selesai!");
    }
}
