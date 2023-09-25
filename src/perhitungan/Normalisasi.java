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
public class Normalisasi extends javax.swing.JFrame {
    public String statusnikah,jumlahtanggungan,usia,jenispekerjaan,pendapatan;
    private final Connection conn = new koneksi () .connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form Datakriteria
     */
    public Normalisasi() {
        initComponents();
        datatable();
        kosong();
    }
    
    protected void kosong(){
    txtt1.setText("");
    txtt2.setText("");
    txtt3.setText("");
    txtt4.setText("");
    txtt5.setText("");
    }
    
    public void popupbobot(){
    popup Ppb = new popup();
    Ppb.pub = this;
    txt1.setText(statusnikah);
    txt2.setText(jumlahtanggungan);
    txt3.setText(usia);
    txt4.setText(jenispekerjaan);
    txt5.setText(pendapatan);
    }

    protected void datatable(){
    Object[] Baris ={"Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari.getText();
    
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
        tblKriteriaBobot.setModel (tabmode);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKriteriaBobot = new javax.swing.JTable();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 200, 126));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status Pernikahan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah Tanggungan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Pekerjaan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 77, -1));
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 77, -1));
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 77, -1));
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 77, -1));

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        jPanel2.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 77, -1));
        jPanel2.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 77, -1));

        jLabel8.setText("Total");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        tblKriteriaBobot.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKriteriaBobot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKriteriaBobotMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKriteriaBobot);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 470, 92));
        jPanel2.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 420, 80, -1));

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 178, 74));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt1ActionPerformed(evt);
            }
        });

        txtt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt2ActionPerformed(evt);
            }
        });

        txtt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt3ActionPerformed(evt);
            }
        });

        txtt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt4ActionPerformed(evt);
            }
        });

        txtt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtt5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Hasil");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtt5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtt4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jButton5.setText("Input bobot");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pendapatan");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Normalisasi");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

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
    double xjml=Integer.parseInt(txt6.getText());
    double xjml1=xstatusnikah/xjml;
    txtt1.setText(String.format("%.3f", xjml1));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt1ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
    int xstatusnikah=Integer.parseInt(txt1.getText());
    int xjumlahtanggungan=Integer.parseInt(txt2.getText());
    int xusia=Integer.parseInt(txt3.getText());
    int xjenispekerjaan=Integer.parseInt(txt4.getText());
    int xpendapatan=Integer.parseInt(txt5.getText());
    int xjml=xstatusnikah+xjumlahtanggungan+xusia+xjenispekerjaan+xpendapatan;
    txt6.setText(String.valueOf(xjml));     // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txtt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt2ActionPerformed
        double xkiri=Integer.parseInt(txt2.getText());
        double xbawah=Integer.parseInt(txt6.getText());
        double xkanan=xkiri/xbawah;
        txtt2.setText(String.format("%.3f", xkanan));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt2ActionPerformed

    private void txtt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt3ActionPerformed
        double xkiri=Integer.parseInt(txt3.getText());
        double xbawah=Integer.parseInt(txt6.getText());
        double xkanan=xkiri/xbawah;
        txtt3.setText(String.format("%.3f", xkanan));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt3ActionPerformed

    private void txtt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt4ActionPerformed
        double xkiri=Integer.parseInt(txt4.getText());
        double xbawah=Integer.parseInt(txt6.getText());
        double xkanan=xkiri/xbawah;
        txtt4.setText(String.format("%.3f", xkanan));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt4ActionPerformed

    private void txtt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtt5ActionPerformed
        double xkiri=Integer.parseInt(txt5.getText());
        double xbawah=Integer.parseInt(txt6.getText());
        double xkanan=xkiri/xbawah;
        txtt5.setText(String.format("%.3f", xkanan));    // TODO add your handling code here:
    }//GEN-LAST:event_txtt5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String sql ="insert into kriterianormalisasi values (?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtt1.getText());
            stat.setString(2, txtt2.getText());
            stat.setString(3, txtt3.getText());
            stat.setString(4, txtt4.getText());
            stat.setString(5, txtt5.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);
        }
        datatable();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblKriteriaBobotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKriteriaBobotMouseClicked
    int tabel = tblKriteriaBobot.getSelectedRow();
    txtt1.setText(tblKriteriaBobot.getValueAt(tabel, 0).toString());
    txtt2.setText(tblKriteriaBobot.getValueAt(tabel, 1).toString());
    txtt3.setText(tblKriteriaBobot.getValueAt(tabel, 2).toString());
    txtt4.setText(tblKriteriaBobot.getValueAt(tabel, 3).toString());
    txtt5.setText(tblKriteriaBobot.getValueAt(tabel, 4).toString());// TODO add your handling code here:
    }//GEN-LAST:event_tblKriteriaBobotMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    datatable();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from kriterianormalisasi where statusnikah ='"+txtt1.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtt1.requestFocus();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
        }
       datatable();}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    popup Ppb = new popup();
    Ppb.pub = this;
    Ppb.setVisible(true);
    Ppb.setResizable(false);    // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Normalisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Normalisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Normalisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Normalisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Normalisasi().setVisible(true);
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
    private javax.swing.JTable tblKriteriaBobot;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtt1;
    private javax.swing.JTextField txtt2;
    private javax.swing.JTextField txtt3;
    private javax.swing.JTextField txtt4;
    private javax.swing.JTextField txtt5;
    // End of variables declaration//GEN-END:variables
}
