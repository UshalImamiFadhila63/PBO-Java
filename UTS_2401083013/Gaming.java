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
public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
    }
    
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis=kartuGrafis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(int rafreshRate){
        this.refreshRate=refreshRate;
    }
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        int ukuranLayar = super.getUkuranLayar();
        int kapasitasRAM = super.getKapasitasRAM();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM + " | " + kartuGrafis + " | " + refreshRate;
    }
}
