/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikkum170425;

/**
 *
 * @author asus
 */
public class PesawatMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat objek pada class pesawat
        Pesawat p=new Pesawat("Air asia", 2020, true, 130);
        System.out.println("Kondisi Awal");
        p.Cetak();
        
        System.out.println("\nKondisi setelah reset");
        p.reset("Lion Air", 1998, false,80);
        p.Cetak();
    }
    
}
