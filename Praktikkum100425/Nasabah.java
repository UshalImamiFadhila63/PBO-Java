/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikkum100425;

/**
 *
 * @author asus
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAkhir = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public void settabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    @Override
    public String toString(){
        //return namaAwal + " " +namaAkhir + "-" + (tabungan != null ? tabungan.toString() : "Tidak Ada Tabungan");
       if(tabungan != null){
           return namaAwal + " " +namaAkhir + "-"+tabungan.toString ();
       }else {
           return namaAwal + " " + namaAkhir + "- Tidak Ada tabungan"; 
       }
    }

    void setTabungan(Tabungan tabungan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


