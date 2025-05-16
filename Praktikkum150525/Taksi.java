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
public class Taksi extends Mobil{
    
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi() {

    }
    public Taksi(int tarifAwal, int tarifPerKm) {
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    public Taksi(int tarifAwal, int tarifPerKm, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna) {
        super(bahanBakar, kapasitasMesin, jmlRoda, warna); 
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal=tarifAwal;
    }
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm=tarifPerKm;  
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    @Override
    public void display() {
        super.display(); 
        System.out.println("Tarif Awal = Rp " + this.tarifAwal);
        System.out.println("Tarif Per KM = Rp " + this.tarifPerKm);
    }
}
