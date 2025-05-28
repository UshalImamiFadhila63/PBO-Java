/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas22052025;

/**
 *
 * @author asus
 */
public abstract class pembayaran {
    protected double totalBayar;

    public pembayaran(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public abstract void pilihMetode();
}
