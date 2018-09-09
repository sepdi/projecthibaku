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
public class laporan_penerima extends javax.swing.JDialog {

    /**
     * Creates new form laporan_penerima
     */
     Connection kon;
    public laporan_penerima(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         kon=koneksi.getKoneksi("localhost", "3306", "root", "","hibaku");
        showData();
    }
    DefaultTableModel dtm;
    public void showData (){
        String[] kolom = {"No","NAMA PENERIMA","NIK","NAMA KELOMPOK","ALAMAT","WILAYAH","DONASI DITERIMA","BARANG DITERIMA","JUMLAH","KETERANGAN"};
        dtm = new DefaultTableModel (null,kolom);
        try {
            Statement stmt = kon.createStatement();
            String query = "SELECT*FROM penerima";
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
            dtm.addRow(new String []{No+"", nama, nik,kelompok, alamat,wilayah, jenis, barang, jumlah, keterangan});
            No++;
            
            }
        
        }
        catch (SQLException ex){
        ex.printStackTrace();
        
        }
          tblpenerima.setModel(dtm);
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
        tblpenerima = new javax.swing.JTable();
        btndelete2 = new javax.swing.JButton();
        btncari2 = new javax.swing.JButton();
        txtcari2 = new javax.swing.JTextField();
        btnconvert2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblpenerima.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpenerima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpenerimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpenerima);

        btndelete2.setText("Delete");
        btndelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete2ActionPerformed(evt);
            }
        });

        btncari2.setText("Search");
        btncari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari2ActionPerformed(evt);
            }
        });

        btnconvert2.setText("Convert");
        btnconvert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvert2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncari2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcari2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnconvert2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete2)
                    .addComponent(btncari2)
                    .addComponent(txtcari2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconvert2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int baris;
    private void tblpenerimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpenerimaMouseClicked
    baris = tblpenerima.getSelectedRow();
    }//GEN-LAST:event_tblpenerimaMouseClicked

    private void btndelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete2ActionPerformed
     int ok = JOptionPane.showConfirmDialog(null,"Apakah Anda yakin?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        String delete = tblpenerima.getValueAt(baris, 2).toString();
     if(ok==0){
        try {
            Statement stmt = kon.createStatement();
            String query = "DELETE FROM penerima WHERE NIK = '"+delete+"'";
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
    }//GEN-LAST:event_btndelete2ActionPerformed
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

    private void btnconvert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvert2ActionPerformed
        exportCalc(tblpenerima, new File("C:/Users/userpc/Documents/laporan penerima.xls"));
    }//GEN-LAST:event_btnconvert2ActionPerformed

    private void btncari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari2ActionPerformed
    try
        {
            Statement st = kon.createStatement();
            String search = txtcari2.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM penerima WHERE NIK like '%"+search+"%' "
                    + "OR NAMA_PENERIMA like '%"+search+"%' "
                            + "OR NAMA_KELOMPOK like '%"+search+"%' "
                                    + "OR ALAMAT like '%"+search+"%' "
                                        + "OR WILAYAH like '%"+search+"%' "
                                            + "OR DONASI_DITERIMA like '%"+search+"%' "
                                                    + "OR BARANG_DITERIMA like '%"+search+"%' "
                                                            + "OR JUMLAH like '%"+search+"%' "
                                                                 + "OR KETERANGAN like '%"+search+"%'");
            
            DefaultTableModel dtm = (DefaultTableModel) tblpenerima.getModel();

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
            dtm.addRow(new String []{No+"", nama, nik,kelompok, alamat,wilayah, jenis, barang, jumlah, keterangan});
            No++;
                i++;
            }
            rs.close();
            txtcari2.setText("");
        }
        catch(Exception ex)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
            System.err.println("error (search) : " +ex);
        }
    }//GEN-LAST:event_btncari2ActionPerformed

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
            java.util.logging.Logger.getLogger(laporan_penerima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_penerima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_penerima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_penerima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                laporan_penerima dialog = new laporan_penerima(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btncari2;
    private javax.swing.JButton btnconvert2;
    private javax.swing.JButton btndelete2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpenerima;
    private javax.swing.JTextField txtcari2;
    // End of variables declaration//GEN-END:variables


}
