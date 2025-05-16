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
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;
    
    public Elektronik(){
        
    }

     public String getMerek(){
         return merek;
     }
     
     public void setMerek(String merek){
         this.merek=merek;
     }
     
     public int  getTahunProduksi(){
         return tahunProduksi;
     }
     
     public void  setTahunProduksi(int tahunProduksi){
         this.tahunProduksi=tahunProduksi;
     }
     
     public  int getGaransi(){
         return garansi;
     }
     
     public void setGaransi(int garansi){
         this.garansi=garansi;
     }
     public String display(){
        return merek + " | " + tahunProduksi + " | " + garansi;
     }
}
