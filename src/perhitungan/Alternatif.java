/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

/**
 *
 * @author Gusti
 */
public class Alternatif extends javax.swing.JFrame {
public String nokk,nama,alamat,jenisk,statusp,jumlaht,usia,jenisp,pendapatan;
private Connection conn = new koneksi () .connect();
private DefaultTableModel tabmode;
    /**
     * Creates new form Alternatif
     */
    public Alternatif() {
        initComponents();
        kosong ();
        aktif ();
        datatable();
    }
    
    public void popupA(){
    popupA Ppa = new popupA();
    Ppa.pua = this;
    txtNama.setText(nama);
    
    if ("Belum Menikah".equals(statusp)){
                sp1.setSelected(true);
        }else
    if ("Sudah Menikah".equals(statusp)){
                sp2.setSelected(true);
        }else
    if ("Cerai Hidup".equals(statusp)){
                sp3.setSelected(true);
        }else{
              sp4.setSelected(true);
              }
    
    if ("0-1".equals(jumlaht)){
                jt1.setSelected(true);
        }else
    if ("2-3".equals(jumlaht)){
                jt2.setSelected(true);
        }else
    if ("4-5".equals(jumlaht)){
                jt3.setSelected(true);
        }else{
              jt4.setSelected(true);
              }
    
    if ("Dibawah 31".equals(usia)){
                us1.setSelected(true);
        }else if ("31-45".equals(usia)){
                us2.setSelected(true);
        }else if ("46-60".equals(usia)){
                us3.setSelected(true);
        }else{
              us4.setSelected(true);
              }
    
    if ("Aparatur/Pejabat Negara".equals(jenisp)){
                jp1a.setSelected(true);
        }else if ("Tenaga Pengajar".equals(jenisp)){
                jp2a.setSelected(true);
        }else if ("Pertanian/Peternakan".equals(jenisp)){
                jp3a.setSelected(true);
        }else if ("Tidak/Belum Bekerja".equals(jenisp)){
              jp4a.setSelected(true);
        }else if ("Wiraswasta".equals(jenisp)){
                jp1b.setSelected(true);
        }else if ("Tenaga Kesehatan".equals(jenisp)){
                jp2b.setSelected(true);
        }else if ("Nelayan".equals(jenisp)){
                jp3b.setSelected(true);
        }else{
              jp4b.setSelected(true);
              }
    
    if ("Dibawah 1,5jt".equals(pendapatan)){
                pd1.setSelected(true);
        }else if ("1,5 - 2,5jt".equals(pendapatan)){
                pd2.setSelected(true);
        }else if ("2,6 - 3,5jt".equals(pendapatan)){
                pd3.setSelected(true);
        }else{
              pd4.setSelected(true);
              }
    
    
    }
    
    protected void aktif() {
    txtNama.requestFocus();
    }
    
    protected void kosong(){
    txtNama.setText("");
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    buttonGroup3.clearSelection();
    buttonGroup4.clearSelection();
    buttonGroup5.clearSelection();
    }
    
    protected void datatable(){
    Object[] Baris ={"Nama","Status Pernikahan","Jumlah Tanggungan","Usia","Jenis Pekerjaan","Pendapatan"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtCari.getText();
    
    try {
        String sql ="SELECT * FROM alternatif where nama like '%"+cariitem+"%' or jumlahtanggungan like '%"+cariitem+"%' order by nama asc";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sp1 = new javax.swing.JRadioButton();
        sp2 = new javax.swing.JRadioButton();
        sp3 = new javax.swing.JRadioButton();
        sp4 = new javax.swing.JRadioButton();
        jt1 = new javax.swing.JRadioButton();
        jt2 = new javax.swing.JRadioButton();
        jt3 = new javax.swing.JRadioButton();
        jt4 = new javax.swing.JRadioButton();
        us1 = new javax.swing.JRadioButton();
        us2 = new javax.swing.JRadioButton();
        us3 = new javax.swing.JRadioButton();
        us4 = new javax.swing.JRadioButton();
        jp1a = new javax.swing.JRadioButton();
        jp1b = new javax.swing.JRadioButton();
        jp2a = new javax.swing.JRadioButton();
        jp2b = new javax.swing.JRadioButton();
        jp3a = new javax.swing.JRadioButton();
        jp3b = new javax.swing.JRadioButton();
        jp4a = new javax.swing.JRadioButton();
        jp4b = new javax.swing.JRadioButton();
        pd1 = new javax.swing.JRadioButton();
        pd2 = new javax.swing.JRadioButton();
        pd3 = new javax.swing.JRadioButton();
        pd4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlternatif = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 200, 126));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 200, 126));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Kembali");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Alternatif dan Nilainya");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButton1.setText("Pilih Data Warga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama Warga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Status Pernikahan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah Tanggungan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Usia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Pekerjaan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pendapatan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        buttonGroup1.add(sp1);
        sp1.setText("Belum Menikah");
        jPanel1.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        buttonGroup1.add(sp2);
        sp2.setText("Menikah");
        jPanel1.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        buttonGroup1.add(sp3);
        sp3.setText("Cerai Hidup");
        jPanel1.add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        buttonGroup1.add(sp4);
        sp4.setText("Cerai Mati");
        jPanel1.add(sp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        buttonGroup2.add(jt1);
        jt1.setText("0-1");
        jPanel1.add(jt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        buttonGroup2.add(jt2);
        jt2.setText("2-3");
        jPanel1.add(jt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        buttonGroup2.add(jt3);
        jt3.setText("4-5");
        jPanel1.add(jt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        buttonGroup2.add(jt4);
        jt4.setText("Lebih dari 5");
        jPanel1.add(jt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        buttonGroup3.add(us1);
        us1.setText("Dibawah 31");
        jPanel1.add(us1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        buttonGroup3.add(us2);
        us2.setText("31-45");
        jPanel1.add(us2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        buttonGroup3.add(us3);
        us3.setText("46-60");
        jPanel1.add(us3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        buttonGroup3.add(us4);
        us4.setText("Diatas 60");
        jPanel1.add(us4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        buttonGroup4.add(jp1a);
        jp1a.setText("Aparatur/Pejabat Negara");
        jPanel1.add(jp1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        buttonGroup4.add(jp1b);
        jp1b.setText("Wiraswasta");
        jPanel1.add(jp1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        buttonGroup4.add(jp2a);
        jp2a.setText("Tenaga Pengajar");
        jPanel1.add(jp2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        buttonGroup4.add(jp2b);
        jp2b.setText("Tenaga Kesehatan");
        jPanel1.add(jp2b, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        buttonGroup4.add(jp3a);
        jp3a.setText("Pertanian/Peternakan");
        jPanel1.add(jp3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        buttonGroup4.add(jp3b);
        jp3b.setText("Nelayan");
        jPanel1.add(jp3b, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        buttonGroup4.add(jp4a);
        jp4a.setText("Tidak/Belum Bekerja");
        jPanel1.add(jp4a, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        buttonGroup4.add(jp4b);
        jp4b.setText("Pensiunan");
        jPanel1.add(jp4b, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        buttonGroup5.add(pd1);
        pd1.setText("Dibawah 1,5jt");
        jPanel1.add(pd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        buttonGroup5.add(pd2);
        pd2.setText("1,5 - 2,5jt");
        jPanel1.add(pd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        buttonGroup5.add(pd3);
        pd3.setText("2,6 - 3,5jt");
        jPanel1.add(pd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        buttonGroup5.add(pd4);
        pd4.setText("Diatas 3,6jt");
        jPanel1.add(pd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jButton3.setText("Ubah");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 69, -1));

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 69, -1));

        jButton5.setText("Reset");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 920, 150));
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 111, -1));

        jButton6.setText("Cari");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String statusp = null;
        if(sp1.isSelected()){
            statusp = "7";
        }else if(sp2.isSelected()){
            statusp = "8";
        }else if(sp3.isSelected()){
            statusp = "9";
        }else if(sp4.isSelected()){
            statusp = "10";
        }
    
    String jumlaht = null;
        if(jt1.isSelected()){
            jumlaht = "7";
        }else if(jt2.isSelected()){
            jumlaht = "8";
        }else if(jt3.isSelected()){
            jumlaht = "9";
        }else if(jt4.isSelected()){
            jumlaht = "10";
        }
        
    String usia = null;
        if(us1.isSelected()){
            usia = "7";
        }else if(us2.isSelected()){
            usia = "8";
        }else if(us3.isSelected()){
            usia = "9";
        }else if(us4.isSelected()){
            usia = "10";
        }
        
    String jenisp = null;
        if(jp1a.isSelected()){
            jenisp = "6";
        }else if(jp1b.isSelected()){
            jenisp = "6";
        }else if(jp2a.isSelected()){
            jenisp = "8";
        }else if(jp2b.isSelected()){
            jenisp = "8";
        }else if(jp3a.isSelected()){
            jenisp = "9";
        }else if(jp3b.isSelected()){
            jenisp = "9";
        }else if(jp4a.isSelected()){
            jenisp = "10";
        }else if(jp4b.isSelected()){
            jenisp = "10";
        }
        
        String pendapatan = null;
        if(pd1.isSelected()){
            pendapatan = "10";
        }else if(pd2.isSelected()){
            pendapatan = "9";
        }else if(pd3.isSelected()){
            pendapatan = "8";
        }else if(pd4.isSelected()){
            pendapatan = "7";
        }
        
    String sql ="insert into alternatif values (?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtNama.getText());
            stat.setString(2, statusp);
            stat.setString(3, jumlaht);
            stat.setString(4, usia);
            stat.setString(5, jenisp);
            stat.setString(6, pendapatan);
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            txtNama.requestFocus();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+e);
        }
        datatable();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblAlternatifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlternatifMouseClicked
    int bar = tblAlternatif.getSelectedRow();
            String a = tblAlternatif.getValueAt(bar, 0).toString();

            
            txtNama.setText(a);  // TODO add your handling code here:
    }//GEN-LAST:event_tblAlternatifMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    popupA Ppa = new popupA();
    Ppa.pua = this;
    Ppa.setVisible(true);
    Ppa.setResizable(false);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from alternatif where nama ='"+txtNama.getText()+"'";
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
       datatable();}        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Alternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alternatif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jp1a;
    private javax.swing.JRadioButton jp1b;
    private javax.swing.JRadioButton jp2a;
    private javax.swing.JRadioButton jp2b;
    private javax.swing.JRadioButton jp3a;
    private javax.swing.JRadioButton jp3b;
    private javax.swing.JRadioButton jp4a;
    private javax.swing.JRadioButton jp4b;
    private javax.swing.JRadioButton jt1;
    private javax.swing.JRadioButton jt2;
    private javax.swing.JRadioButton jt3;
    private javax.swing.JRadioButton jt4;
    private javax.swing.JRadioButton pd1;
    private javax.swing.JRadioButton pd2;
    private javax.swing.JRadioButton pd3;
    private javax.swing.JRadioButton pd4;
    private javax.swing.JRadioButton sp1;
    private javax.swing.JRadioButton sp2;
    private javax.swing.JRadioButton sp3;
    private javax.swing.JRadioButton sp4;
    private javax.swing.JTable tblAlternatif;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JRadioButton us1;
    private javax.swing.JRadioButton us2;
    private javax.swing.JRadioButton us3;
    private javax.swing.JRadioButton us4;
    // End of variables declaration//GEN-END:variables
}
