/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p110624;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class PeminjamController {

    private final FormPeminjaman formPeminjaman;
    private Peminjam peminjam;
    private final PeminjamDao peminjamDao;

    public PeminjamController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
        peminjamDao = new PeminjamDao();
    }

    public void clearForm() {
        formPeminjaman.getTxtKodeAnggota().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
        formPeminjaman.getTxtTerlambat().setText("");
        formPeminjaman.getTxtDenda().setText("");
    }

    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjam> list = peminjamDao.getAll();
        for (Peminjam p : list) {
            Object[] row = {
                p.getKodeAnggota(),
                p.getKodeAnggota(),
                p.getTglPinjam(),
                p.getTglKembali(),
                p.getTerlambat(),
                p.getDenda()
            };
            tabelModel.addRow(row);
        }
    }

    public void savePeminjam() {
        peminjam = new Peminjam();
        peminjam.setKodeAnggota(formPeminjaman.getTxtKodeAnggota().getText());
        peminjam.setKodeBuku(formPeminjaman.getTxtTglPinjam().getText());
        peminjam.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjam.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjam.setDenda(formPeminjaman.getTxtDenda().getText());
        peminjamDao.insert(peminjam);
        JOptionPane.showMessageDialog(formPeminjaman, "Insert Ok");
    }

    public void updatePeminjam() {
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        if (index >= 0) {
            peminjam = peminjamDao.getPeminjam(index);
            peminjam.setKodeAnggota(formPeminjaman.getTxtKodeAnggota().getText());
            peminjam.setKodeBuku(formPeminjaman.getTxtTglPinjam().getText());
            peminjam.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjam.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
            peminjam.setDenda(formPeminjaman.getTxtDenda().getText());
            peminjamDao.update(index, peminjam);
            JOptionPane.showMessageDialog(formPeminjaman, "Update Ok");
        } else {
            JOptionPane.showMessageDialog(formPeminjaman, "Select a record to update");
        }
    }

    public void getPeminjam() {
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        if (index >= 0) {
            peminjam = peminjamDao.getPeminjam(index);
            if (peminjam != null) {
                formPeminjaman.getTxtKodeAnggota().setText(peminjam.getKodeAnggota());
                formPeminjaman.getTxtKodeBuku().setText(peminjam.getKodeBuku());
                formPeminjaman.getTxtTglPinjam().setText(peminjam.getTglPinjam());
                formPeminjaman.getTxtTglKembali().setText(peminjam.getTglKembali());
                formPeminjaman.getTxtTerlambat().setText(peminjam.getTerlambat());
                formPeminjaman.getTxtDenda().setText(peminjam.getDenda());
            }
        }
    }
      public void deletePeminjam() {
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        if (index >= 0) {
            int confirmation = JOptionPane.showConfirmDialog(formPeminjaman, "Are you sure you want to delete this record?");
            if (confirmation == JOptionPane.YES_OPTION) {
                peminjamDao.delete(index);
                JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
            }
        } else {
            JOptionPane.showMessageDialog(formPeminjaman, "Select a record to delete");
        }
    }
}
