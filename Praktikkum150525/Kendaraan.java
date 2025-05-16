/*
 * Name : Ushal Imami Fadhila
 * NIM : 2401083013
 * Kelas : TK 1A
 */
package Praktikkum150525;

/**
 *
 * @author asus
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    
    public Kendaraan(){
        
    }
    public Kendaraan(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda=jmlRoda;
    }
    
    public int  getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String warna){
        this.warna=warna;
    }
    
    public String getWarna(){
        return warna;
    }
    public void display(){
        System.out.println("class kendaraan : ");
        System.out.println("Jumlah Roda : " + this.jmlRoda);
        System.out.println("Warna : " + this.warna);
    }
}
