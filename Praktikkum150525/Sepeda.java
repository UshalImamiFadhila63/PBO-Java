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
public class Sepeda extends Kendaraan {
 
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda() {
        
    }
    public Sepeda(String jmlSadel, int jmlGir) {
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    public Sepeda(String jmlSadel, int jmlGir, int jmlRoda, String warna) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel=jmlSadel;
    }
    
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir(int jmlGir){
        this.jmlGir=jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    public void display(){
        System.out.println("class sepeda : ");
        System.out.println("Jumlah Roda : " + this.jmlRoda);
        System.out.println("Warna : " + this.warna);
        System.out.println("Jumlah Sadel : " + this.jmlSadel);
        System.out.println("Jumlah Gir : " + this.jmlGir);
    }
}
