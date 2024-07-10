/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p080624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hafiz
 */
public class PinjamanDao {
    private List<Pinjaman> data = new ArrayList();
    
    public PinjamanDao(){
        
    }
    
    public void insert(Pinjaman  pinjaman){
        data.add(pinjaman);
    }
    
    public void update(int index,Pinjaman  pinjaman){
        data.set(index, pinjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pinjaman getPinjaman(int index){
        return data.get(index);
    }
    
    public List<Pinjaman> getAll(){
        return data;
    }
    
}
