/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_hibaku;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author userpc
 */
public class Form_Perkembangan extends javax.swing.JDialog {

    /**
     * Creates new form Form_Laporan
     */
    Connection kon;
    public Form_Perkembangan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        kon=koneksi.getKoneksi("localhost", "3306", "root", "","hibaku");
        cbbarangditerimaperkembangan.disable();
    }
    public void Simpandata(){
        String donasi="";
        String barang="";
        String nama=txtnamaperkembangan.getText();
        String nik=txtnikperkembangan.getText();
        String kelompok=txtnamakelompokperkembangan.getText();
        String alamat=txtalamatperkembangan.getText();
        String wilayah=txtwilayahperkembangan.getText();
        String jumlah=txtjumlahditerimaperkembangan.getText();
        String keterangan=txtketerangan2.getText();
        String perkembangan=txtperkembangan.getText();
        
        if(rbbarangperkembangan.isSelected()){
            donasi = "Barang";}
        if(rbuangperkembangan.isSelected()){
            donasi = "Uang";}
        
        
        if(cbbarangditerimaperkembangan.getSelectedItem()=="DOMBA JANTAN"){
        barang="DOMBA JANTAN";}
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="DOMBA BETINA"){
        barang="DOMBA BETINA"; }
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="DOMBA PETERNAK JANTAN"){
        barang="DOMBA PETERNAK JANTAN";}
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="DOMBA PETERNAK BETINA")
        barang="DOMBA PETERNAK BETINA";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="SAPI POTONG BETINA (PEDET)")
        barang="SAPI POTONG BETINA (PEDET)";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="SAPI PERAH")
        barang="SAPI PERAH";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="KERBAU")
        barang="KERBAU";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="ITIK")
        barang="ITIK";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="ITIK PADJAJARAN")
        barang="ITIK PADJAJARAN";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="(DOC)AYAM PETELUR")
        barang="(DOC)AYAM PETELUR";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="BIBIT TERNAK")
        barang="BIBIT TERNAK";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="PAKAN TERNAK")
        barang="PAKAN TERNAK";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="OBAT-OBATAN")
        barang="OBAT-OBATAN";
        else if (cbbarangditerimaperkembangan.getSelectedItem()=="ALAT DAN MESIN PETERNAKAN"){
        barang="ALAT DAN MESIN PETERNAKAN";
        }else{
        barang="";}
        
         try {
            Statement stmt =kon.createStatement();
            String query = "INSERT INTO perkembangan (NAMA_PENERIMA,NIK,NAMA_KELOMPOK,ALAMAT,WILAYAH,DONASI_DITERIMA,BARANG_DITERIMA,JUMLAH,KETERANGAN,PERKEMBANGAN)"
                    + "VALUES('"+nama+"','"+nik+"','"+kelompok+"','"+alamat+"','"+wilayah+"','"+donasi+"','"+barang+"','"+jumlah+"','"+keterangan+"','"+perkembangan+"')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null,"DATA BERHASIL DIMASUKKAN");
            }else{
                   JOptionPane.showMessageDialog(null,"DATA GAGAL DIMASUKKAN");
            }            }
            catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "TERJADI KESALAHAN");
            
                    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnamaperkembangan = new javax.swing.JTextField();
        txtnikperkembangan = new javax.swing.JTextField();
        txtnamakelompokperkembangan = new javax.swing.JTextField();
        txtalamatperkembangan = new javax.swing.JTextField();
        txtwilayahperkembangan = new javax.swing.JTextField();
        rbuangperkembangan = new javax.swing.JRadioButton();
        rbbarangperkembangan = new javax.swing.JRadioButton();
        cbbarangditerimaperkembangan = new javax.swing.JComboBox<>();
        txtjumlahditerimaperkembangan = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txtperkembangan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtketerangan2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("FORM PERKEMBANGAN DONASI");

        jLabel2.setText("NAMA KETUA KELOMPOK");

        jLabel3.setText("NIK");

        jLabel4.setText("NAMA KELOMPOK");

        jLabel5.setText("ALAMAT");

        jLabel6.setText("KECAMATAN");

        jLabel7.setText("DONASI YANG DITERIMA");

        jLabel8.setText("SARANA PRODUKSI TERNAK");

        jLabel9.setText("JUMLAH YANG DITERIMA");

        jLabel10.setText("PERKEMBANGAN");

        jLabel11.setText(":");

        jLabel12.setText(":");

        jLabel13.setText(":");

        jLabel14.setText(":");

        jLabel15.setText(":");

        jLabel16.setText(":");

        jLabel17.setText(":");

        jLabel18.setText(":");

        jLabel19.setText(":");

        buttonGroup1.add(rbuangperkembangan);
        rbuangperkembangan.setText("UANG");
        rbuangperkembangan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                rbuangperkembanganAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        buttonGroup1.add(rbbarangperkembangan);
        rbbarangperkembangan.setText("BARANG");
        rbbarangperkembangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbarangperkembanganActionPerformed(evt);
            }
        });

        cbbarangditerimaperkembangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "DOMBA JANTAN", "DOMBA BETINA", "DOMBA PERTERNAK JANTAN", "DOMBA PETERNAK BETINA", "SAPI POTONG BETINA (PEDET)", "SAPI PERAH", "KERBAU", "ITIK", "ITIK PADJAJARAN", "(DOC) AYAM PETELUR", "BIBIT TERNAK", "PAKAN TERNAK", "OBAT-OBATAN", "ALAT DAN MESIN PETERNAKAN" }));
        cbbarangditerimaperkembangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbarangditerimaperkembanganActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        txtperkembangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperkembanganActionPerformed(evt);
            }
        });

        jLabel20.setText("KETERANGAN");

        jLabel21.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(125, 125, 125))
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtjumlahditerimaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbarangditerimaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbuangperkembangan)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbbarangperkembangan))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtwilayahperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtalamatperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnamakelompokperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnikperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnamaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtketerangan2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsimpan)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnreset))
                                    .addComponent(txtperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(txtnamaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(txtnikperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(txtnamakelompokperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(txtalamatperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(txtwilayahperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16)
                    .addComponent(rbuangperkembangan)
                    .addComponent(rbbarangperkembangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17)
                    .addComponent(cbbarangditerimaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18)
                    .addComponent(txtjumlahditerimaperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21))
                    .addComponent(txtketerangan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19)
                    .addComponent(txtperkembangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbuangperkembanganAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_rbuangperkembanganAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_rbuangperkembanganAncestorAdded

    private void rbbarangperkembanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbarangperkembanganActionPerformed
     if(rbbarangperkembangan.isSelected()){
            cbbarangditerimaperkembangan.enable();}
    }//GEN-LAST:event_rbbarangperkembanganActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
     Simpandata();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    txtnamaperkembangan.setText(null);
    txtnikperkembangan.setText(null);
    txtnamakelompokperkembangan.setText(null);
    txtalamatperkembangan.setText(null);
    txtwilayahperkembangan.setText(null);
    rbuangperkembangan.setSelected(false);
    rbbarangperkembangan.setSelected(false);
    txtjumlahditerimaperkembangan.setText(null);
    txtketerangan2.setText(null);
    txtperkembangan.setText(null);
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtperkembanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperkembanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperkembanganActionPerformed

    private void cbbarangditerimaperkembanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbarangditerimaperkembanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbarangditerimaperkembanganActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form_Perkembangan dialog = new Form_Perkembangan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbarangditerimaperkembangan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbbarangperkembangan;
    private javax.swing.JRadioButton rbuangperkembangan;
    private javax.swing.JTextField txtalamatperkembangan;
    private javax.swing.JTextField txtjumlahditerimaperkembangan;
    private javax.swing.JTextField txtketerangan2;
    private javax.swing.JTextField txtnamakelompokperkembangan;
    private javax.swing.JTextField txtnamaperkembangan;
    private javax.swing.JTextField txtnikperkembangan;
    private javax.swing.JTextField txtperkembangan;
    private javax.swing.JTextField txtwilayahperkembangan;
    // End of variables declaration//GEN-END:variables

}
