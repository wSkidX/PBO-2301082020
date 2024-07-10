/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p080624;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hafiz
 */

public class PinjamanController {
    private FormPinjaman formPinjaman;
    private Pinjaman pinjaman;
    private PinjamanDao pinjamanDao;
    
    public PinjamanController(FormPinjaman formPinjaman){
        this.formPinjaman = formPinjaman;
        pinjamanDao = new PinjamanDao();
    }

    
    public void clearForm(){
        formPinjaman.getTxtKodeAnggota().setText("");
        formPinjaman.getTxtKodeBuku().setText("");
        formPinjaman.getTxtTglPinjam().setText("");
        formPinjaman.getTxtTglKembali().setText("");
   }

    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formPinjaman.getTblPinjaman().getModel();
        tabelModel.setRowCount(0);
        List<Pinjaman> list = pinjamanDao.getAll();
        for(Pinjaman a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getKodeBuku(),
                a.getTglPinjam(),
                a.getTglKembali(),
                a.getTerlambat(),
                a.getDenda(),
                a.getTotal()
            };
            tabelModel.addRow(row);
        }
    }

    
    public void savePinjaman(){
        pinjaman = new Pinjaman();
        pinjaman.setKodeAnggota(formPinjaman.getTxtKodeAnggota().getText());
        pinjaman.setKodeBuku(formPinjaman.getTxtKodeBuku().getText());
        pinjaman.setTglPinjam(formPinjaman.getTxtTglPinjam().getText());
        pinjaman.setTglKembali(formPinjaman.getTxtTglKembali().getText());
        pinjamanDao.insert(pinjaman);
        JOptionPane.showMessageDialog(formPinjaman, "Inser OK");
    }

    
    public void updatePinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjaman = pinjamanDao.getPinjaman(index);
        pinjaman.setKodeAnggota(formPinjaman.getTxtKodeAnggota().getText());
        pinjaman.setKodeBuku(formPinjaman.getTxtKodeBuku().getText());
        pinjaman.setTglPinjam(formPinjaman.getTxtTglPinjam().getText());
        pinjaman.setTglKembali(formPinjaman.getTxtTglKembali().getText());
        pinjamanDao.update(index, pinjaman);
        JOptionPane.showMessageDialog(formPinjaman, "Update OK");
    }

    
    public void getPinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjaman = pinjamanDao.getPinjaman(index);
        if (pinjaman != null){
            formPinjaman.getTxtKodeAnggota().setText(pinjaman.getKodeAnggota());
            formPinjaman.getTxtKodeBuku().setText(pinjaman.getKodeBuku());
            formPinjaman.getTxtTglPinjam().setText(pinjaman.getTglPinjam());
            formPinjaman.getTxtTglKembali().setText(pinjaman.getTglKembali());
        }
    }

    
    public void deletePinjaman(){
        int index = formPinjaman.getTblPinjaman().getSelectedRow();
        pinjamanDao.delete(index);
        JOptionPane.showMessageDialog(formPinjaman, "Delete OK");
    }
    
}
