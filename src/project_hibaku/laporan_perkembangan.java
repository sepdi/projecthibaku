/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_hibaku;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author userpc
 */
public class laporan_perkembangan extends javax.swing.JDialog {

    /**
     * Creates new form laporan_perkembangan
     */
    Connection kon;
    public laporan_perkembangan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        kon=koneksi.getKoneksi("localhost", "3306", "root", "","hibaku");
        showData();
    }
    DefaultTableModel dtm;
    public void showData (){
        String[] kolom = {"No","NAMA PENERIMA","NIK","NAMA KELOMPOK","ALAMAT","WILAYAH","DONASI DITERIMA","BARANG DITERIMA","JUMLAH","KETERANGAN","PERKEMBANGAN"};
        dtm = new DefaultTableModel (null,kolom);
        try {
            Statement stmt = kon.createStatement();
            String query = "SELECT*FROM perkembangan";
            ResultSet rs = stmt.executeQuery (query);
            int No = 1;
            while (rs.next ()){
            String nama = rs.getString ("NAMA_PENERIMA");
            String nik = rs.getString("NIK");
            String kelompok = rs.getString("NAMA_KELOMPOK");
            String alamat = rs.getString("ALAMAT");
            String wilayah = rs.getString("WILAYAH");
            String jenis = rs.getString("DONASI_DITERIMA");
            String barang = rs.getString("BARANG_DITERIMA");
            String jumlah = rs.getString("JUMLAH");
            String keterangan = rs.getString("KETERANGAN");
            String perkembangan = rs.getString("PERKEMBANGAN");
            dtm.addRow(new String []{No+"", nama, nik, kelompok , alamat, wilayah, jenis, barang, jumlah, keterangan, perkembangan});
            No++;
            
            }
            }
        catch (SQLException ex){
        ex.printStackTrace();
        
        }
          tbllaporan.setModel(dtm);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbllaporan = new javax.swing.JTable();
        btndelete3 = new javax.swing.JButton();
        btncari3 = new javax.swing.JButton();
        txtcari3 = new javax.swing.JTextField();
        btnconvert3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbllaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbllaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllaporanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllaporan);

        btndelete3.setText("Delete");
        btndelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete3ActionPerformed(evt);
            }
        });

        btncari3.setText("Search");
        btncari3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari3ActionPerformed(evt);
            }
        });

        btnconvert3.setText("Convert");
        btnconvert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvert3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btncari3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcari3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnconvert3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete3)
                            .addComponent(btncari3)
                            .addComponent(btnconvert3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtcari3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int baris;
    private void tbllaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllaporanMouseClicked
    baris = tbllaporan.getSelectedRow();
    }//GEN-LAST:event_tbllaporanMouseClicked

    private void btndelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete3ActionPerformed
int ok = JOptionPane.showConfirmDialog(null,"Apakah Anda yakin?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        String delete = tbllaporan.getValueAt(baris, 2).toString();
        if(ok==0){
        try {
            Statement stmt = kon.createStatement();
            String query = "DELETE FROM perkembangan WHERE NIK = '"+delete+"'";
            int berhasil = stmt.executeUpdate(query);
            if (berhasil==1){
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
                dtm.getDataVector().removeAllElements();
                showData();
            }
            else {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DIHAPUS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();       
        }}
    }//GEN-LAST:event_btndelete3ActionPerformed
public void exportCalc(JTable tabel,File f)
	{
		try
		{
			int a,b;
			dtm = (DefaultTableModel) tabel.getModel();
			FileWriter fw = new FileWriter(f);
			for(a=0;a<dtm.getColumnCount();a=a+1)
			{
				fw.write(dtm.getColumnName(a) + " \t");
			}
			fw.write(" \n");
				for(a=0;a<dtm.getRowCount();a=a+1)
				{
					for(b=0;b<dtm.getColumnCount();b=b+1)
					{
						fw.write(dtm.getValueAt(a, b).toString() + " \t");
					}
					fw.write(" \n");
				}
				fw.close();
			JOptionPane.showMessageDialog(null,"Data berhasil di export ke Excel");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
    private void btnconvert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvert3ActionPerformed
    exportCalc(tbllaporan, new File("C:/Users/userpc/Documents/laporan perkembangan.xls"));
    }//GEN-LAST:event_btnconvert3ActionPerformed

    private void btncari3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari3ActionPerformed
        try
        {
            Statement st = kon.createStatement();
            String search = txtcari3.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM perkembangan WHERE NIK like '%"+search+"%' "
                    + "OR NAMA_PENERIMA like '%"+search+"%' "
                            + "OR NAMA_KELOMPOK like '%"+search+"%' "
                                    + "OR ALAMAT like '%"+search+"%'"
                                            + "OR WILAYAH like '%"+search+"%' "
                                                    + "OR DONASI_DITERIMA like '%"+search+"%' "
                                                            + "OR BARANG_DITERIMA like '%"+search+"%' "
                                                                    + "OR JUMLAH like '%"+search+"%'");
            DefaultTableModel dtm = (DefaultTableModel) tbllaporan.getModel();

            dtm.setRowCount(0);
            String [] data = new String[9];
            int i = 1;
            int No = 1;
            while (rs.next ()){
            String nama = rs.getString ("NAMA_PENERIMA");
            String nik = rs.getString("NIK");
            String kelompok = rs.getString("NAMA_KELOMPOK");
            String alamat = rs.getString("ALAMAT");
            String wilayah = rs.getString("WILAYAH");
            String jenis = rs.getString("DONASI_DITERIMA");
            String barang = rs.getString("BARANG_DITERIMA");
            String jumlah = rs.getString("JUMLAH");
            String keterangan = rs.getString("KETERANGAN");
            String perkembangan = rs.getString("NIK");
            dtm.addRow(new String []{No+"", nama, nik, kelompok , alamat, wilayah, jenis, barang, jumlah, keterangan, perkembangan});
            No++;
            i++;
            }
            rs.close();
            txtcari3.setText("");
        }
        catch(Exception ex)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
            System.err.println("error (search) : " +ex);
        }
    }//GEN-LAST:event_btncari3ActionPerformed

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
            java.util.logging.Logger.getLogger(laporan_perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_perkembangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                laporan_perkembangan dialog = new laporan_perkembangan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btncari3;
    private javax.swing.JButton btnconvert3;
    private javax.swing.JButton btndelete3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllaporan;
    private javax.swing.JTextField txtcari3;
    // End of variables declaration//GEN-END:variables

    
    }

