/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p080624;

import java.awt.TextField;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hafiz
 */
public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private ListBuku listBuku;
    
    
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        listBuku = new ListBuku();
    }
    
    
    public void clearForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahunTerbit().setText("");
    }
    
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = listBuku.getAll();
        for(Buku a : list){
            Object[] row = {
                a.getKodeBuku(),
                a.getJudulBuku(),
                a.getPengarang(),
                a.getPenerbit(),
                a.getTahunTerbit()
            };
            tabelModel.addRow(row);
        }
    }

    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahunTerbit(Integer.parseInt(formBuku.getTxtTahunTerbit().getText()));
        listBuku.insert(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    

    public void UpdateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = listBuku.getBuku(index);
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahunTerbit(Integer.parseInt(formBuku.getTxtTahunTerbit().getText()));
        listBuku.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update OK");
    }

    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = listBuku.getBuku(index);
        if (buku != null) {
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudulBuku().setText(buku.getJudulBuku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtTahunTerbit().setText(String.valueOf(buku.getTahunTerbit()));
        }
    }
    

    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        listBuku.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete OK");
    }
    
}
