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
public class SmartWatch extends Smartphone{
   
    private int ukuranLayar;
    private boolean tahanAir;
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    
    public boolean getTahanAir(){
        return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
        this.tahanAir=tahanAir;
    }
    @Override
    public String display(){
           String merek = super.getMerek();
           int tahunProduksi = super.getTahunProduksi();
           int garansi = super.getGaransi();
           int kapasitasBaterai = super.getKapasitasBaterai();
           int jumlahKamera = super.getJumlahKamera();

           return merek + " | " + tahunProduksi + " | " + garansi + " | " + kapasitasBaterai + " | " + jumlahKamera + " | " + ukuranLayar + " | " + tahanAir;
       }





}
