/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program penentuan nilai terbesar dan terkecil yang inputannya berasal dari user.
 * 
 */
public class PBO6K10116599Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int  banyakNilai, nilai;
        String namaPetugas;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas=scan.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        banyakNilai = scan.nextInt();
        int []a = new int [banyakNilai];
        
        for (int z=1; z<banyakNilai;
                z++)
        
        for(int i=0;i<banyakNilai;i++) { 
            System.out.print("Masukkan Nilai Mahasiswa ke-" +z+ " = ");
              z++;
            a[i]=scan.nextInt();
        }
        

        
        // Menampilkan Nilai Mahasiswa yang diinputkan
            System.out.println();
            System.out.println("=====Hasil NIlai Mahasiswa=====");
                for(int j=0;j<banyakNilai;j++) {
                    System.out.println(" Nilai Mahasiswa ke-"+(j+1)+": "+a[j]);
            }
        
        
        // Nilai terbesar        
                int nilaiTerbesar = a[0];        
        for(int i=1;i<banyakNilai;i++) {
            if(nilaiTerbesar < a[i])
            {
                nilaiTerbesar=a[i];
            }
        } 
        
        // Nilai terkecil
        int nilaiTerkecil=a[0];        
        for(int i=1;i<banyakNilai;i++)
        {
            if(nilaiTerkecil>a[i]) {
                nilaiTerkecil=a[i];
            }
        }

        
        // Menampilkan nilai terbesar dan terkecil
        System.out.println();     
        System.out.println("Nilai terbesar adalah " +nilaiTerbesar+ " ");
        System.out.println("Nilai terkecil adalah " +nilaiTerkecil+ " ");
        System.out.println();
        System.out.println("Petugas : " +namaPetugas);
        
    }
    
}
