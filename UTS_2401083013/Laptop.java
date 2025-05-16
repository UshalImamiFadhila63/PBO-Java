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
public class Laptop extends Elektronik{
        
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM=kapasitasRAM;
    }
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM;
    }
    }

