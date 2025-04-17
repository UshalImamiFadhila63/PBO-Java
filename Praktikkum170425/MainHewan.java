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
public class MainHewan {
    public static void main(String[] args) {
       //pembuatan objek
       Hewan hewanku=new Hewan("Makhluk hidup");
       Kucing kucingku=new Kucing("Bobby");
       Anjing anjingku=new Anjing ("Helly");
       
       //mengakses super class
       System.out.println("Tampilkan akses super class hewan");
       hewanku.tampilkanNama();
       hewanku.bersuara();
       
       //mengakses sub class kucing
       System.out.println("\nTampilkan akses sub class Kucing");
       kucingku.tampilkanNama();
       kucingku.bersuara();
       
       //mengakses sub class Anjing
       System.out.println("\nTampilkan akses sub class Anjing");
       anjingku.tampilkanNama();
       anjingku.bersuara();
               
    }
    
}
