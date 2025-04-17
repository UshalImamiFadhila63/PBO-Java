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
public class Hewan {
    protected String nama;
    
    public Hewan (String nama ){
        this .nama=nama;//this.nama untuk memanggil nama yg di atribut sedangkan setelah sama dengan merupakan parameter
        
    }
    public void bersuara(){
        System.out.println("Hewan bersuara...");
    }
    public void tampilkanNama(){
        System.out.println("Nama hewan "+ nama);
    }
}
