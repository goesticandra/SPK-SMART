/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Gusti
 */
public class HasilSPK extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;

    /**
     * Creates new form HasilSPK
     */
    public HasilSPK() {
        initComponents();
        tabelDataWarga();
        tabelBobot();
        tabelNormalisasi();
        tabelUtility();
        datatable();
    }

    protected void tabelDataWarga(){
    Object[] Baris ={"No. KK","Nama","Alamat","Jenis Kelamin","Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari1.getText();
    
    try {
        String sql ="SELECT * FROM datawarga where nokk like '%"+cariitem+"%' or nama like '%"+cariitem+"%' order by alamat asc";
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
                hasil.getString(7),
                hasil.getString(8),
                hasil.getString(9),
            });
        }
        tblWarga.setModel (tabmode);
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    
    protected void tabelBobot(){
    Object[] Baris ={"Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari2.getText();
    
    try {
        String sql ="SELECT * FROM kriteriabobot where statusnikah like '%"+cariitem+"%' or jumlahtanggungan like '%"+cariitem+"%' order by statusnikah asc";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5),
            });
        }
        tblBobot.setModel (tabmode);
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    
    protected void tabelNormalisasi(){
    Object[] Baris ={"Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari3.getText();
    
    try {
        String sql ="SELECT * FROM kriterianormalisasi where statusnikah like '%"+cariitem+"%' or jumlahtanggungan like '%"+cariitem+"%' order by statusnikah asc";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5),
            });
        }
        tblNormalisasi.setModel (tabmode);
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    
    protected void tabelUtility(){
    Object[] Baris ={"Nama","Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari4.getText();
    
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
        tblUtility.setModel (tabmode);
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    
    protected void datatable(){
    Object[] Baris ={"Nama","Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan","Total","Status"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari5.getText();
    
    try {
        String sql ="SELECT * FROM hasil where nama like '%"+cariitem+"%' or statusnikah like '%"+cariitem+"%' order by total desc";
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
                hasil.getString(7),
                hasil.getString(8),
            });
        }
        tblHasil.setModel (tabmode);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarga = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNormalisasi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBobot = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUtility = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCari1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCari2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtCari3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtCari4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHasil = new javax.swing.JTable();
        txtCari5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 200, 126));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWarga.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblWarga.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblWarga);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 500, 95));

        tblNormalisasi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblNormalisasi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblNormalisasi);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 340, 95));

        tblBobot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblBobot.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblBobot);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 340, 95));

        tblUtility.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblUtility.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblUtility);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 500, 95));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Hasil Akhir Perhitungan SPK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel2.setText("Data Warga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setText("Data Bobot Kriteria");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel4.setText("Normalisasi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel5.setText("Utility");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(txtCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 74, -1));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));
        jPanel1.add(txtCari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 74, -1));

        jButton3.setText("Cari");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));
        jPanel1.add(txtCari3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 74, -1));

        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        jPanel1.add(txtCari4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 74, -1));

        jLabel6.setText("Hasil Kelayakan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        tblHasil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblHasil);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 670, 140));
        jPanel1.add(txtCari5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 93, -1));

        jButton6.setText("Kembali");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tabelDataWarga();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    tabelBobot();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    tabelNormalisasi();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    tabelUtility();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    datatable();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(HasilSPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HasilSPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HasilSPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HasilSPK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HasilSPK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblBobot;
    private javax.swing.JTable tblHasil;
    private javax.swing.JTable tblNormalisasi;
    private javax.swing.JTable tblUtility;
    private javax.swing.JTable tblWarga;
    private javax.swing.JTextField txtCari1;
    private javax.swing.JTextField txtCari2;
    private javax.swing.JTextField txtCari3;
    private javax.swing.JTextField txtCari4;
    private javax.swing.JTextField txtCari5;
    // End of variables declaration//GEN-END:variables
}
