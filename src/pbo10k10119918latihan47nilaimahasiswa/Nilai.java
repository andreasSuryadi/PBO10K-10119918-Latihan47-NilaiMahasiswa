/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan47nilaimahasiswa;

/**
 *
 * @author andreas
 */
public class Nilai {
    private double nilaiQuiz, nilaiUts, nilaiUas;
    
    public void setNilaiQuiz(double nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }
    
    public double getNilaiQuiz() {
        return nilaiQuiz;
    }
    
    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }
    
    public double getNilaiUts() {
        return nilaiUts;
    }
    
    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }
    
    public double getNilaiUas() {
        return nilaiUas;
    }
    
    public double hitungNilaiAkhir(double nilaiQuiz, double nilaiUts, double nilaiUas) {
        return (nilaiQuiz * 20 / 100) + (nilaiUts * 30 / 100) + (nilaiUas * 50 / 100);
    }
    
    public char tampilIndex(double nilaiAkhir) {
        char index = 'A';
        
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            index = 'E';
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
        } else if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
        }
        
        return index;
    }
    
    public String tampilKeterangan(char index) {
        String keterangan = "";
        
        switch (index) {
            case 'A': 
                keterangan = "Sangat Baik"; 
                break;
            case 'B': 
                keterangan = "Baik"; 
                break;
            case 'C': 
                keterangan = "Cukup"; 
                break;
            case 'D': 
                keterangan = "Kurang"; 
                break;
            case 'E': 
                keterangan = "Sangat Kurang"; 
                break;
        }
        
        return keterangan;
    }
}
