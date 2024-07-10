/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p080624;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author hafiz
 */
public class Pinjaman {
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private int terlambat;
    private int denda;
    private int total;
    
    public Pinjaman(){
        
    }
    
    public Pinjaman(String kodeAnggota, String kodeBuku, String tglPinjam,
            String tglKembali, int terlambat, int denda, int total){
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.terlambat = terlambat;
        this.denda = denda;
        this.total = total;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public int getDenda() {
        return denda;
    }

    public int getTotal() {
        return total;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
        calculateTerlambatAndDenda();
    }

    private void calculateTerlambatAndDenda() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate pinjamDate = LocalDate.parse(this.tglPinjam, formatter);
        LocalDate kembaliDate = LocalDate.parse(this.tglKembali, formatter);

        long daysBetween = ChronoUnit.DAYS.between(pinjamDate, kembaliDate);
        int terlambat = (int) daysBetween;
        if (terlambat > 5) {
            this.terlambat = (terlambat-5);
            this.denda = 500;
            this.total = this.terlambat * this.denda;
        }else{
            this.terlambat = 0;
            this.denda = 0;
            this.total = 0;
        }

    }
    
    
}
