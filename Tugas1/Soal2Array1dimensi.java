/*
 * Nama : Ushal Imami Fadhila
 * NIM :2401083013
 * soal:Terdapat dua buah array 1 dimensi dengan ukuran diinputkan oleh user. kedua array diisi dengan nilai random. buatlah program yang menampilkan hasil gabungan dari kedua array tersebut pada array ke 3, dengan ketentuan array yang ukuran lebih besar nilainya berada diawal array 3.
contoh :
ukuran array A:3
    12 3 5 */
package Tugas1;

import java.util.Scanner;
import java.util.Random;

public class Soal2Array1dimensi {

    public static void main(String[] args) {
        int A[], B[], C[];
        int nA, nB, i;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Masukkan ukuran Array A: ");
        nA = scanner.nextInt();
        System.out.print("Masukkan Ukuran Array B: ");
        nB = scanner.nextInt();
        System.out.println("--------------------------");
        
        A = new int[nA];
        B = new int[nB];
        C = new int[nA + nB];
        
        System.out.println("Array A: ");
        for (i = 0; i < nA; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Array B: ");
        for (i = 0; i < nB; i++) {
            B[i] = rand.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println("Array C: ");
        if (nA >= nB) {
            for(i = 0; i < nA; i++) 
                System.out.print(A[i] + " ");
            for(i = 0; i < nB; i++)
                System.out.print(B[i] + " ");
        } else {
            for(i = 0; i < nB; i++)
                System.out.print(B[i] + " ");
            for(i = 0; i < nA; i++) 
                System.out.print(A[i] + " ");
        }       
        System.out.println();
    }   
}
