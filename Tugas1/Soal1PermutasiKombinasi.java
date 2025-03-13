/*
 *Nama : Ushal Imami Fadhila
 * NIM : 2401083013
 * Soal : Buatlah program yang menentukan nilai Permutasi dan kombinasi dari 2 angka yang diinputkan oleh user
 */
package Tugas1;

import java.util.Scanner;

public class Soal1PermutasiKombinasi {
    public static void main(String[] args) {
        int i, n, r;
        int permutasi=1, kombinasi=1, x=1;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = in.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = in.nextInt();
        System.out.println("--------------------");

        for (i=n; i>(n-r); i--) {
            permutasi *= i;
        }
        for (i=r; i>1; i--) {
            x *= i;
        }
        kombinasi = permutasi / x;

        System.out.println("Nilai Permutasi: "+permutasi);
        System.out.println("Nilai Kombinasi: "+kombinasi);
    }
    
}
