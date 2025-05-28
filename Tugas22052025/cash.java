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
public class cash extends pembayaran implements metodePembayaran  {
     public cash(double totalBayar) {
        super(totalBayar);
    }

   
     @Override
    public void pilihMetode() {
        System.out.println("Metode: Pembayaran Tunai");
    }


     @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Pembayaran Tunai:");
        System.out.println("1. Serahkan uang ke kasir");
        System.out.println("2. Tunggu kembalian jika ada");
        System.out.println("Pembayaran selesai!");
    }
}
