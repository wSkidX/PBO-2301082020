/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p110624;

/**
 *
 * @author Administrator
 */
public class Peminjam {
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private String terlambat;
    private String denda;
   
    public Peminjam(){
    }
    
    public Peminjam(String kodeAnggota, String kodeBuku, String tglPinjam,String tglKembali,String terlambat,String denda){
        this.kodeAnggota=kodeAnggota;
        this.kodeBuku=kodeBuku;
        this.tglPinjam=tglPinjam;
        this.tglKembali=tglKembali;
        this.terlambat=terlambat;
        this.denda=denda;
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
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(String denda) {
        this.denda = denda;
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

    public String getTerlambat() {
        return terlambat;
    }

    public String getDenda() {
        return denda;
    }
    
}