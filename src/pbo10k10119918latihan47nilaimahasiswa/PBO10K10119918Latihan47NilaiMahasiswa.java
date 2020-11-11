/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan47nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan nilai mahasiswa beserta 
 * indexnya
 *
 */

public class PBO10K10119918Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        
        double quiz, uts, uas, nilaiAkhir;
        
        System.out.print("QUIZ \t\t = ");
        quiz = scanner.nextDouble();
        System.out.print("UTS \t\t = ");
        uts = scanner.nextDouble();
        System.out.print("UAS \t\t = ");
        uas = scanner.nextDouble();
        
        nilai.setNilaiQuiz(quiz);
        nilai.setNilaiUts(uts);
        nilai.setNilaiUas(uas);
        
        nilaiAkhir = nilai.hitungNilaiAkhir(nilai.getNilaiQuiz(), nilai.getNilaiUts(), nilai.getNilaiUas());
        
        System.out.printf("%nNilai Akhir \t = %.1f %n%n", nilaiAkhir);
        System.out.println("Index = " + nilai.tampilIndex(nilaiAkhir));
        System.out.println("Keterangan = " + nilai.tampilKeterangan(nilai.tampilIndex(nilaiAkhir)));
    }
    
}
