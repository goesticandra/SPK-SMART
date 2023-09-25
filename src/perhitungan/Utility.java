/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;




/**
 *
 * @author Gusti
 */
public class Utility extends javax.swing.JFrame {
    public String nama,statusnikah,jumlahtanggungan,usia,jenispekerjaan,pendapatan;
    private final Connection conn = new koneksi () .connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form Datakriteria
     */
    public Utility() {
        initComponents();
        datatable();
        kosong();
    }
    
    protected void kosong(){
    txtNama.setText("");
    txt1.setText("");
    txt2.setText("");
    txt3.setText("");
    txt4.setText("");
    txt5.setText("");
    txtt1.setText("");
    txtt2.setText("");
    txtt3.setText("");
    txtt4.setText("");
    txtt5.setText("");
    }
    
    public void popupAlternatif(){
    popupU Ppu = new popupU();
    Ppu.puu = this;
    txtNama.setText(nama);
    txt1.setText(statusnikah);
    txt2.setText(jumlahtanggungan);
    txt3.setText(usia);
    txt4.setText(jenispekerjaan);
    txt5.setText(pendapatan);
    }

    protected void datatable(){
    Object[] Baris ={"Nama","Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari.getText();
    
    try {
        String sql ="SELECT * FROM utility where nama like '%"+cariitem+"%' or statusnikah like '%"+cariitem+"%' order by nama asc";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5),
                hasil.getString(6),
            });
        }
        tblAlternatif.setModel (tabmode);
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlternatif = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtt1 = new javax.swing.JTextField();
        txtt2 = new javax.swing.JTextField();
        txtt3 = new javax.swing.JTextField();
        txtt4 = new javax.swing.JTextField();
        txtt5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 200, 126));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Utility");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status Pernikahan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah Tanggungan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Pekerjaan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pendapatan");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 77, -1));
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 77, -1));
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 77, -1));
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 77, -1));
        jPanel2.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 77, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nama");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        tblAlternatif.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAlternatif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlternatifMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlternatif);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 577, 146));
        jPanel2.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 89, -1));

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 178, 75));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, 90, -1));

        txtt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 90, -1));

        txtt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 90, -1));

        txtt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 90, -1));

        txtt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt5ActionPerformed(evt);
            }
        });
        jPanel1.add(txtt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Hasil Utility");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, -1, -1));

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 42, 75, -1));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 76, 75, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 190));

        jButton5.setText("Input Alternatif");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));
        jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 77, -1));

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 75, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt1ActionPerformed
    double xstatusnikah=Integer.parseInt(txt1.getText());
    
    double xjml=(xstatusnikah-7)/(10-7); //rumus
    txtt1.setText(String.format("%.3f", xjml));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt1ActionPerformed

    private void txtt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt2ActionPerformed
        double xjumlahtanggungan=Integer.parseInt(txt2.getText());
    
        double xjml=(xjumlahtanggungan-7)/(10-7); //rumus
    txtt2.setText(String.format("%.3f", xjml));     // TODO add your handling code here:
    }//GEN-LAST:event_txtt2ActionPerformed

    private void txtt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt3ActionPerformed
        double xusia=Integer.parseInt(txt3.getText());
        double xjml=(xusia-7)/(10-7); //rumus
    txtt3.setText(String.format("%.3f", xjml));// TODO add your handling code here:
    }//GEN-LAST:event_txtt3ActionPerformed

    private void txtt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt4ActionPerformed
        double xjenisp=Integer.parseInt(txt4.getText());
        double xjml=(xjenisp-6)/(10-6); //rumus
        txtt4.setText(String.format("%.3f", xjml));   // TODO add your handling code here:
    }//GEN-LAST:event_txtt4ActionPerformed

    private void txtt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt5ActionPerformed
        double xpendapatan=Integer.parseInt(txt5.getText());
        double xjml=(xpendapatan-7)/(10-7); //rumus
    txtt5.setText(String.format("%.3f", xjml));   // TODO add your handling code here:
    }//GEN-LAST:event_txtt5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String sql ="insert into utility values (?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtNama.getText());
            stat.setString(2, txtt1.getText());
            stat.setString(3, txtt2.getText());
            stat.setString(4, txtt3.getText());
            stat.setString(5, txtt4.getText());
            stat.setString(6, txtt5.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);
        }
        datatable();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblAlternatifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlternatifMouseClicked
    int tabel = tblAlternatif.getSelectedRow();
    txtNama.setText(tblAlternatif.getValueAt(tabel, 0).toString());
    txtt1.setText(tblAlternatif.getValueAt(tabel, 1).toString());
    txtt2.setText(tblAlternatif.getValueAt(tabel, 2).toString());
    txtt3.setText(tblAlternatif.getValueAt(tabel, 3).toString());
    txtt4.setText(tblAlternatif.getValueAt(tabel, 4).toString());
    txtt5.setText(tblAlternatif.getValueAt(tabel, 5).toString());
// TODO add your handling code here:
    }//GEN-LAST:event_tblAlternatifMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    datatable();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from utility where nama ='"+txtt1.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtNama.requestFocus();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
        }
       datatable();}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    popupU Ppu = new popupU();
    Ppu.puu = this;
    Ppu.setVisible(true);
    Ppu.setResizable(false);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlternatif;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtt1;
    private javax.swing.JTextField txtt2;
    private javax.swing.JTextField txtt3;
    private javax.swing.JTextField txtt4;
    private javax.swing.JTextField txtt5;
    // End of variables declaration//GEN-END:variables
}
