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
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");        
        banyakNilai = scan.nextInt();
        
        
         
         
          int i;
        i=1;
         do {
              System.out.print("Nilai Mahasiswa ke-" +i+ " : ");
              i++;
        nilai = scan.nextInt();
         } while(i<=banyakNilai);
       
      
        System.out.println();
        System.out.println("=====Hasil NIlai Mahasiswa=====");
        System.out.println("Nilai terbesar : ");
        System.out.println("Nilai terkecil : ");
        System.out.println();
        System.out.println("Petugas : " +namaPetugas);
        
    }
    
}
