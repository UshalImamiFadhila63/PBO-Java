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
public class PesawatMain2 {

    public static void main(String[] args) {
        // buat objek bertipe array
        
        Pesawat[] daftarPesawat=new Pesawat[3];
        
        daftarPesawat[0]=new Pesawat("AirAsia",2015, true, 180);
        daftarPesawat[1]=new Pesawat("Lion Air", 2018, false,100);
        daftarPesawat[2]=new Pesawat("Merpati", 2010, true,75);
        
        System.out.println("DAFTAR PESAWAT\n");
        for (int i=0;i<3;i++){
            System.out.println("Data pesawat ke  " +(i+1)+"==");
            daftarPesawat[i].Cetak();
            System.out.println();
    }
    }
}
    

