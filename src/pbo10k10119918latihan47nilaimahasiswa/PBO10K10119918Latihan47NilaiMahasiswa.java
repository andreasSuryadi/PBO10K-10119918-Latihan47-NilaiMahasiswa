/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan47nilaimahasiswa;

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
        Nilai nilai = new Nilai();
        
        double nilaiAkhir;
        
        nilai.setNilaiQuiz(75.0);
        nilai.setNilaiUts(45.0);
        nilai.setNilaiUas(34.0);
        
        System.out.println("QUIZ \t\t = " + nilai.getNilaiQuiz());
        System.out.println("UTS \t\t = " + nilai.getNilaiUts());
        System.out.println("UAS \t\t = " + nilai.getNilaiUas());
        
        nilaiAkhir = nilai.hitungNilaiAkhir(nilai.getNilaiQuiz(), nilai.getNilaiUts(), nilai.getNilaiUas());
        
        System.out.printf("%nNilai Akhir \t = %.1f %n%n", nilaiAkhir);
        System.out.println("Index = " + nilai.tampilIndex(nilaiAkhir));
        System.out.println("Keterangan = " + nilai.tampilKeterangan(nilai.tampilIndex(nilaiAkhir)) + "\n\n");
        
        nilai.setNilaiQuiz(60.0);
        nilai.setNilaiUts(80.0);
        nilai.setNilaiUas(75.0);
        
        System.out.println("QUIZ \t\t = " + nilai.getNilaiQuiz());
        System.out.println("UTS \t\t = " + nilai.getNilaiUts());
        System.out.println("UAS \t\t = " + nilai.getNilaiUas());
        
        nilaiAkhir = nilai.hitungNilaiAkhir(nilai.getNilaiQuiz(), nilai.getNilaiUts(), nilai.getNilaiUas());
        
        System.out.printf("%nNilai Akhir \t = %.1f %n%n", nilaiAkhir);
        System.out.println("Index = " + nilai.tampilIndex(nilaiAkhir));
        System.out.println("Keterangan = " + nilai.tampilKeterangan(nilai.tampilIndex(nilaiAkhir)) + "\n\n");
        
        nilai.setNilaiQuiz(30.0);
        nilai.setNilaiUts(80.0);
        nilai.setNilaiUas(40.0);
        
        System.out.println("QUIZ \t\t = " + nilai.getNilaiQuiz());
        System.out.println("UTS \t\t = " + nilai.getNilaiUts());
        System.out.println("UAS \t\t = " + nilai.getNilaiUas());
        
        nilaiAkhir = nilai.hitungNilaiAkhir(nilai.getNilaiQuiz(), nilai.getNilaiUts(), nilai.getNilaiUas());
        
        System.out.printf("%nNilai Akhir \t = %.1f %n%n", nilaiAkhir);
        System.out.println("Index = " + nilai.tampilIndex(nilaiAkhir));
        System.out.println("Keterangan = " + nilai.tampilKeterangan(nilai.tampilIndex(nilaiAkhir)));
    }
    
}
