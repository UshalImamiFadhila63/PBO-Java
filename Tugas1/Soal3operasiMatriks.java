/*
 * Nama : Ushal Imami Fadhila
 * NIM : 2401083013
 * Soal : buatlah program yang menampilkan menu operasi matriks(1. Tambah, 2. Kurang, 3. Kali, 4. Identitas, 5. Transpose, 6. Exit). Kemudian meminta user memilih menu yang adda. Jika user memilih 1-5, tampilkan hasil operasi matriks dengan ukuran(baris dan kolom)input user dan isi random. Atasi jika user menginputkan diluar 1-6 dan user ingin mengulang proses/
 */
package Tugas1;


import java.util.Scanner;
import java.util.Random;

public class Soal3operasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random acak = new Random();
        char ulang = 'y';
        int pilih, baris, kolom;
        int Matriks1[][], Matriks2[][], hasil[][];
        
        do {
            System.out.println("Menu Operasi Matriks");
            System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Identitas\n5. Transpose\n6. Exit");
            System.out.print("Pilih program (1-6): ");
            pilih = input.nextInt();
            
            if (pilih == 6) {
                System.out.println("program Telah Selesai.");
                break;
            }           
            if (pilih < 1 || pilih > 6) {
                System.out.println("Pilihan tidak ada di menu.");
                System.out.print("Apakah ingin mengulang program? (y/n): ");
                ulang = input.next().charAt(0);
                continue;
            }
            
            System.out.print("Masukkan jumlah baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            kolom = input.nextInt();
            
            Matriks1 = new int[baris][kolom];
            Matriks2 = new int[baris][kolom];
            hasil = new int[baris][kolom];
            
            System.out.println("Matriks 1:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    Matriks1[i][j] = acak.nextInt(50) + 1;
                    System.out.print(Matriks1[i][j] + "\t");
                }
                System.out.println();
            }
            
            if (pilih != 4 && pilih != 5) {
                System.out.println("Matriks 2:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        Matriks2[i][j] = acak.nextInt(50) + 1;
                        System.out.print(Matriks2[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            
            if (pilih == 1) {
                System.out.println("Hasil Penjumlahan:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[i][j] = Matriks1[i][j] + Matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (pilih == 2) {
                System.out.println("Hasil Pengurangan:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[i][j] = Matriks1[i][j] - Matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (pilih == 3) {
                System.out.println("Hasil Perkalian:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        for (int k = 0; k < kolom; k++) {
                            hasil[i][j] += Matriks1[i][k] * Matriks2[k][j];
                        }
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            else if (pilih == 4) {
                if (baris != kolom) {
                    System.out.println("Matriks harus persegi utk mjd identitas.");
                } else {
                    System.out.println("Matriks Identitas:");
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            hasil[i][j] = (i == j) ? 1 : 0;
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
            } 
            else if (pilih == 5) {
                System.out.println("Transpose Matriks 1:");
                for (int i = 0; i < kolom; i++) {
                    for (int j = 0; j < baris; j++) {
                        System.out.print(Matriks1[j][i] + "\t");
                    }
                    System.out.println();
                }
            }
            
            System.out.print("Apakah ingin mengulang program? (y/n): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y');
    }
    
}
