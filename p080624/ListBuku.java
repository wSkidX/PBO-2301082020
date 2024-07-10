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
public class ListBuku {
    private List<Buku> data = new ArrayList();
    
    public ListBuku(){
        data.add(new Buku("B001","Hujan","Tere Liye","Jakarta : Gramedia Pustaka Utama, 2019",2016));
    }
    
    public void insert (Buku buku){
        data.add(buku);
    }
    
    public void update (int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Buku getBuku (int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
    
    
}
