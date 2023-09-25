/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Laporan.HasilSPK;
import Pendataan.Datakriteria;
import Pendataan.Datalogin;
import Pendataan.Datawarga;
import perhitungan.Normalisasi;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import perhitungan.Alternatif;
import perhitungan.Hasil;
import perhitungan.Utility;

/**
 *
 * @author Gusti
 */
public class menuutama extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    
    private void userLogin(){
    lblUserlogin.setText(UserSession.getUserLogin());
    }
    
    private void userNama(){
    lblUserNama.setText(UserSession.getUserNama());
    }
        
    private void hakakses() {
    String user=lblUserlogin.getText();
        if(user.equals("Admin")){
       
        mndatawarga.setEnabled(true);
        mndatamaster.setEnabled(true);
        mnperhitungan.setEnabled(true);
        mnhasil.setEnabled(true);
        }
        else {
        
        mndatawarga.setEnabled(false);
        mndatamaster.setEnabled(false);
        mnperhitungan.setEnabled(false);
        mnhasil.setEnabled(true);
        }
    }
    /**
     * Creates new form menuutama2
     */
    public menuutama() {
        initComponents();
        userLogin();
        userNama();
        hakakses();
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
        lblUserlogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUserNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mndatamaster = new javax.swing.JMenu();
        mndatawarga = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnperhitungan = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnhasil = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 200, 126));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserlogin.setText("jLabel1");
        jPanel1.add(lblUserlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Halo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        lblUserNama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserNama.setText("jLabel2");
        jPanel1.add(lblUserNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sistem Pengambilan Keputusan Penerima Dana Santunan Warga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Perumahan Griya Putra Mandiri Depok");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        jMenuBar1.setBackground(new java.awt.Color(255, 178, 75));

        mndatamaster.setBackground(new java.awt.Color(255, 178, 75));
        mndatamaster.setText("Data Master");

        mndatawarga.setBackground(new java.awt.Color(255, 178, 75));
        mndatawarga.setText("Data Warga");
        mndatawarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndatawargaActionPerformed(evt);
            }
        });
        mndatamaster.add(mndatawarga);

        jMenuItem1.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem1.setText("Data Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mndatamaster.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem2.setText("Data Bobot");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mndatamaster.add(jMenuItem2);

        jMenuBar1.add(mndatamaster);

        mnperhitungan.setBackground(new java.awt.Color(255, 178, 75));
        mnperhitungan.setText("Perhitungan");

        jMenuItem3.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem3.setText("Normalisasi");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnperhitungan.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem4.setText("Alternatif");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnperhitungan.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem5.setText("Utility");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnperhitungan.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem6.setText("Hasil Akhir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnperhitungan.add(jMenuItem6);

        jMenuBar1.add(mnperhitungan);

        mnhasil.setBackground(new java.awt.Color(255, 178, 75));
        mnhasil.setText("Laporan");

        jMenuItem7.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem7.setText("Hasil SPK");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnhasil.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 178, 75));
        jMenuItem8.setText("Data Warga");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnhasil.add(jMenuItem8);

        jMenuBar1.add(mnhasil);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Datalogin frmA = new Datalogin();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    Datakriteria frmA = new Datakriteria();
    frmA.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Normalisasi frmA = new Normalisasi();
    frmA.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Alternatif frmA = new Alternatif();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    Utility frmA = new Utility();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mndatawargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndatawargaActionPerformed
    Datawarga frmA = new Datawarga();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_mndatawargaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    Hasil frmA = new Hasil();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    HasilSPK frmA = new HasilSPK();
    frmA.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    try{
        String path="./src/Laporan/Data Warga.jasper";
        HashMap parameter = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);
        JasperViewer.viewReport(print, false);
    } catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada" +ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserNama;
    private javax.swing.JLabel lblUserlogin;
    private javax.swing.JMenu mndatamaster;
    private javax.swing.JMenuItem mndatawarga;
    private javax.swing.JMenu mnhasil;
    private javax.swing.JMenu mnperhitungan;
    // End of variables declaration//GEN-END:variables
}
