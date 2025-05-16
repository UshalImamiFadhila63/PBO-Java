/*
 * Name : Ushal Imami Fadhila
 * NIM : 2401083013
 * Kelas : TK 1A
 */
package UTS_2401083013;

/**
 *
 * @author asus
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone (){
        
    }

    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai=kapasitasBaterai;
    }
    
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera=jumlahKamera;
    }
 
    @Override
     public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + kapasitasBaterai + " | " + jumlahKamera;
    }
    
}
