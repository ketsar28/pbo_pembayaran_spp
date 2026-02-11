/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import config.Connect;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.io.File;
import java.util.HashMap;

/**
 *
 * @author HELLO
 */
public class FormUtama extends javax.swing.JFrame {

        /**
         * Creates new form FormUtama
         */
        public FormUtama() {
                initComponents();
                this.pack();
                this.setLocationRelativeTo(null);
                // this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                tampilData();
                autonumber();
        }

        private void tampilData() {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID Siswa");
                model.addColumn("Nama Siswa");
                model.addColumn("Kelas");
                model.addColumn("Jurusan");
                model.addColumn("Pembayaran");
                model.addColumn("Jumlah");

                try {
                        String sql = "select * from pembayaran";
                        Connection conn = Connect.configDB();
                        Statement stm = conn.createStatement();
                        ResultSet res = stm.executeQuery(sql);

                        while (res.next()) {
                                model.addRow(new Object[] {
                                                res.getString(1),
                                                res.getString(2),
                                                res.getString(3),
                                                res.getString(4),
                                                res.getString(5),
                                                res.getString(6)
                                });

                                // tabelSiswa.setModel(model); // masukin data ke tabel
                        }
                        tabelSiswa.setModel(model); // masukin data ke tabel
                } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                }
        }

        private void autonumber() {
                try {
                        Connection conn = Connect.configDB();
                        Statement s = conn.createStatement();
                        String sql = "SELECT MAX(id_siswa) FROM pembayaran";
                        ResultSet r = s.executeQuery(sql);
                        if (r.next()) {
                                String maxId = r.getString(1);
                                if (maxId == null) {
                                        txtIdSiswa.setText("1001");
                                } else {
                                        int id = Integer.parseInt(maxId);
                                        id++;
                                        txtIdSiswa.setText(String.valueOf(id));
                                }
                        } else {
                                txtIdSiswa.setText("1001");
                        }
                        txtIdSiswa.setEditable(false);
                } catch (Exception e) {
                        System.out.println("Autonumber error: " + e.getMessage());
                }
        }

        public void kosongkanData() {
                txtIdSiswa.setEditable(false);
                txtJumlah.setText(null);
                txtKelas.setText(null);
                txtNama.setText(null);
                cbJurusan.setSelectedItem("Silakan Pilih Jurusan");
                cbPembayaran.setSelectedItem("Silakan Pilih Bulan Pembayaran");
                autonumber();
        }

        public static void main(String[] args) {
                try {
                        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                                | UnsupportedLookAndFeelException e) {
                        java.util.logging.Logger.getLogger(FormUtama.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, e);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FormUtama().setVisible(true);
                        }
                });
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                cbJurusan = new javax.swing.JComboBox<>();
                cbPembayaran = new javax.swing.JComboBox<>();
                btnSimpan = new javax.swing.JButton();
                btnHapus = new javax.swing.JButton();
                btnUbah = new javax.swing.JButton();
                btnCetak = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabelSiswa = new javax.swing.JTable();
                txtIdSiswa = new javax.swing.JTextField();
                txtKelas = new javax.swing.JTextField();
                txtNama = new javax.swing.JTextField();
                txtJumlah = new javax.swing.JTextField();
                btnKeluar = new javax.swing.JButton();

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setText("SISTEM PEMBAYARAN SPP");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel2.setText("ID Siswa");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel3.setText("Nama Siswa");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel4.setText("Kelas");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel5.setText("Jurusan");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel6.setText("Pembayaran");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel7.setText("Jumlah");

                jLabel8.setText(":");

                jLabel9.setText(":");

                jLabel10.setText(":");

                jLabel11.setText(":");

                jLabel12.setText(":");

                jLabel13.setText(":");

                cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Silakan Pilih Jurusan", "RPL", "TKJ", "MM", "OTKP" }));

                cbPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                                "Silakan Pilih Bulan Pembayaran", "Januari", "Februari", "Maret", "April", "Mei",
                                "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

                btnSimpan.setBackground(new java.awt.Color(0, 255, 0));
                btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnSimpan.setText("Simpan");
                btnSimpan.addActionListener(this::btnSimpanActionPerformed);

                btnHapus.setBackground(new java.awt.Color(255, 0, 0));
                btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnHapus.setForeground(new java.awt.Color(255, 255, 255));
                btnHapus.setText("Hapus");
                btnHapus.addActionListener(this::btnHapusActionPerformed);

                btnUbah.setBackground(new java.awt.Color(255, 255, 0));
                btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnUbah.setText("Ubah");
                btnUbah.addActionListener(this::btnUbahActionPerformed);

                btnCetak.setBackground(new java.awt.Color(51, 51, 255));
                btnCetak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnCetak.setForeground(new java.awt.Color(255, 255, 255));
                btnCetak.setText("Cetak");
                btnCetak.addActionListener(this::btnCetakActionPerformed);

                tabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null, null },
                                                { null, null, null, null, null, null },
                                                { null, null, null, null, null, null },
                                                { null, null, null, null, null, null }
                                },
                                new String[] {
                                                "ID Siswa", "Nama Siswa", "Kelas", "Jurusan", "Pembayaran", "Jumlah"
                                }));
                tabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabelSiswaMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tabelSiswa);

                txtIdSiswa.setText("Masukan ID Siswa");

                txtKelas.setText("Masukan Kelas");

                txtNama.setText("Masukan Nama");

                txtJumlah.setText("Masukan Nominal");

                btnKeluar.setBackground(new java.awt.Color(153, 0, 0));
                btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
                btnKeluar.setText("Keluar");
                btnKeluar.addActionListener(this::btnKeluarActionPerformed);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(297, 297, 297))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(94, 94, 94)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(btnKeluar)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                22,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(txtIdSiswa,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                235,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addGap(57, 57, 57)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                72,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(jLabel11,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                16,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtNama,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                224,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(btnSimpan)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(btnHapus)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(btnUbah)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(btnCetak)
                                                                                                                                                                .addGap(187, 187,
                                                                                                                                                                                187))))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addComponent(jLabel4))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                22,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel9,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                12,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                                .addComponent(txtKelas)
                                                                                                                                .addComponent(cbPembayaran,
                                                                                                                                                0,
                                                                                                                                                229,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                84,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                72,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                16,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel12,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                                .addComponent(cbJurusan,
                                                                                                                                                0,
                                                                                                                                                224,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(txtJumlah)))))
                                                                .addContainerGap(99, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jLabel1)
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jLabel11)
                                                                                .addComponent(txtIdSiswa,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtNama,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(cbJurusan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtKelas,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(cbPembayaran,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtJumlah,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(53, 53, 53)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnSimpan)
                                                                                .addComponent(btnHapus)
                                                                                .addComponent(btnUbah)
                                                                                .addComponent(btnCetak))
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnKeluar)
                                                                .addContainerGap(48, Short.MAX_VALUE)));
        }// </editor-fold>//GEN-END:initComponents

        private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnKeluarActionPerformed
                // TODO add your handling code here:
                int tanya = JOptionPane.showConfirmDialog(null, "Beneran nih mau keluar?", "Konfirmasi",
                                JOptionPane.YES_NO_OPTION);
                if (tanya == JOptionPane.YES_OPTION) {
                        new FormLogin().setVisible(true);
                        this.dispose();
                }
        }// GEN-LAST:event_btnKeluarActionPerformed

        private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSimpanActionPerformed
                // TODO add your handling code here:

                try {
                        String sql = "insert into pembayaran values ('"
                                        + txtIdSiswa.getText() + "','"
                                        + txtNama.getText() + "','"
                                        + txtKelas.getText() + "','"
                                        + cbJurusan.getSelectedItem() + "','"
                                        + cbPembayaran.getSelectedItem() + "','"
                                        + txtJumlah.getText() + "')";
                        Connection conn = (Connection) Connect.configDB();
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "data berhasil di simpan!");
                        tampilData();
                        kosongkanData();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                }
        }// GEN-LAST:event_btnSimpanActionPerformed

        private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUbahActionPerformed
                // TODO add your handling code here:
                try {
                        String sql = "update pembayaran set nama_siswa='"
                                        + txtNama.getText() + "', kelas='"
                                        + txtKelas.getText() + "',jurusan='"
                                        + cbJurusan.getSelectedItem() + "', pembayaran='"
                                        + cbPembayaran.getSelectedItem() + "', jumlah='"
                                        + txtJumlah.getText() + "'where id_siswa='"
                                        + txtIdSiswa.getText() + "'";

                        Connection conn = (Connection) Connect.configDB();
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                        tampilData();
                        kosongkanData();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Perubahan data gagal disimpan!" + e.getMessage());
                }

        }// GEN-LAST:event_btnUbahActionPerformed

        private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHapusActionPerformed
                // TODO add your handling code here:
                int[] selectedRows = tabelSiswa.getSelectedRows();
                if (selectedRows.length == 0) {
                        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus terlebih dahulu!");
                        return;
                }

                int confirm = JOptionPane.showConfirmDialog(this,
                                "Apakah Anda yakin ingin menghapus " + selectedRows.length + " data terpilih?",
                                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                        try {
                                Connection conn = Connect.configDB();
                                String sql = "delete from pembayaran where id_siswa=?";
                                PreparedStatement pst = conn.prepareStatement(sql);

                                for (int i : selectedRows) {
                                        String id = tabelSiswa.getModel().getValueAt(i, 0).toString();
                                        pst.setString(1, id);
                                        pst.addBatch();
                                }

                                pst.executeBatch();
                                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                                tampilData();
                                kosongkanData();
                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
                        }
                }
        }// GEN-LAST:event_btnHapusActionPerformed

        private void tabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelSiswaMouseClicked
                // TODO add your handling code here:
                int baris = tabelSiswa.rowAtPoint(evt.getPoint());
                String id = tabelSiswa.getValueAt(baris, 0).toString();
                txtIdSiswa.setText(id);

                String nama = tabelSiswa.getValueAt(baris, 1).toString();
                txtNama.setText(nama);

                String kelas = tabelSiswa.getValueAt(baris, 2).toString();
                txtKelas.setText(kelas);

                String jurusan = tabelSiswa.getValueAt(baris, 3).toString();
                cbJurusan.setSelectedItem(jurusan);

                String pembayaran = tabelSiswa.getValueAt(baris, 4).toString();
                cbPembayaran.setSelectedItem(pembayaran);

                String jumlah = tabelSiswa.getValueAt(baris, 5).toString();
                txtJumlah.setText(jumlah);
        }// GEN-LAST:event_tabelSiswaMouseClicked

        private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCetakActionPerformed
                // TODO add your handling code here:
                try {
                        String reportPath = "src/view/reportSiswa.jasper";
                        File reportFile = new File(reportPath);

                        if (!reportFile.exists()) {
                                net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(
                                                "src/view/reportSiswa.jrxml",
                                                "src/view/reportSiswa.jasper");
                        }

                        Connection conn = Connect.configDB();
                        HashMap<String, Object> parameters = new HashMap<>();

                        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                        JasperViewer viewer = new JasperViewer(print, false);
                        viewer.setVisible(true);

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error report = " + e.getMessage());
                }
        }// GEN-LAST:event_btnCetakActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCetak;
        private javax.swing.JButton btnHapus;
        private javax.swing.JButton btnKeluar;
        private javax.swing.JButton btnSimpan;
        private javax.swing.JButton btnUbah;
        private javax.swing.JComboBox<String> cbJurusan;
        private javax.swing.JComboBox<String> cbPembayaran;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tabelSiswa;
        private javax.swing.JTextField txtIdSiswa;
        private javax.swing.JTextField txtJumlah;
        private javax.swing.JTextField txtKelas;
        private javax.swing.JTextField txtNama;
        // End of variables declaration//GEN-END:variables
}
