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
public class SepedaListrik extends Sepeda {
   
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
        
    }
    public SepedaListrik(int kecepatanMaks, int jarakTempuh) {
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }
    public SepedaListrik(int kecepatanMaks, int jarakTempuh, String jmlSadel, int jmlGir, int jmlRoda, String warna) {
        super(jmlSadel, jmlGir, jmlRoda, warna); 
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh=jarakTempuh;
    }
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public void display() {
        super.display(); 
        System.out.println("Kecepatan Maksimal = " + this.kecepatanMaks + " km/h");
        System.out.println("Jarak Tempuh = " + this.jarakTempuh + " km");
    }
}
