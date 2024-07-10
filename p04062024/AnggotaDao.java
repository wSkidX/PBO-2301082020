/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p04062024;

import java.util.List;
import java.util.ArrayList;

public class AnggotaDao {

    private final List<Anggota> data;

    public AnggotaDao() {
        data = new ArrayList<>();
        data.add(new Anggota("A001", "Ali", "Padang", "L"));
        data.add(new Anggota("A002", "Ani", "Padang", "P"));
    }

    public void insert(Anggota anggota) {
        data.add(anggota);
    }

    public void update(int index, Anggota anggota) {
        data.set(index, anggota);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Anggota getAnggota(int index) {
        return data.get(index);
    }

    public List<Anggota> getAll() {
        return data;
    }
}
