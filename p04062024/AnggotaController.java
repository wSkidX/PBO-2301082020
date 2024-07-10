/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p04062024;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class AnggotaController {

    private final FormAnggota formAnggota;
    private Anggota anggota;
    private final AnggotaDao anggotaDao;

    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDao();
    }

    public void clearForm() {
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }

    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAll();
        for (Anggota a : list) {
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }

    public void saveAnggota() {
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
    }

    public void updateAnggota() {
        int index = formAnggota.getTblAnggota().getSelectedRow();
        if (index >= 0) {
            anggota = anggotaDao.getAnggota(index);
            anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
            anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
            anggotaDao.update(index, anggota);
            JOptionPane.showMessageDialog(formAnggota, "Update Ok");
        } else {
            JOptionPane.showMessageDialog(formAnggota, "Select a record to update");
        }
    }

    public void getAnggota() {
        int index = formAnggota.getTblAnggota().getSelectedRow();
        if (index >= 0) {
            anggota = anggotaDao.getAnggota(index);
            if (anggota != null) {
                formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
                formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
                formAnggota.getTxtAlamat().setText(anggota.getAlamat());
                formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
            }
        }
    }

    public void deleteAnggota() {
        int index = formAnggota.getTblAnggota().getSelectedRow();
        if (index >= 0) {
            int confirmation = JOptionPane.showConfirmDialog(formAnggota, "Are you sure you want to delete this record?");
            if (confirmation == JOptionPane.YES_OPTION) {
                anggotaDao.delete(index);
                JOptionPane.showMessageDialog(formAnggota, "Delete OK");
            }
        } else {
            JOptionPane.showMessageDialog(formAnggota, "Select a record to delete");
        }
    }
}
