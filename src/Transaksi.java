import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.conek;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author --User31--
 */
public class Transaksi extends javax.swing.JFrame {
    int s;
    private DefaultTableModel model;    

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        bersih();
        model = new DefaultTableModel();
        tabel.setModel(model);
            model.addColumn("Nama");
            model.addColumn("Awal");
            model.addColumn("Failitas");
            model.addColumn("Lain");
            model.addColumn("Lambat");
            model.addColumn("Total"); 
            
            getData();
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CBRegis = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TAwal = new javax.swing.JTextField();
        TLain = new javax.swing.JTextField();
        TLambat = new javax.swing.JTextField();
        TTotal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BHitung = new javax.swing.JButton();
        CBFasilitas = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TNama = new javax.swing.JTextField();
        BSave = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BDelete = new javax.swing.JButton();
        BClear = new javax.swing.JButton();
        BReport = new javax.swing.JButton();
        BHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        CBRegis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "17A1", "17A2", "17A3", "17A4", "17A5", "17A6", "17A7", "17A8", "17A9", "17A10", "17B1", "17B2", "17B3", "17B4", "17B5", "17B6", "17B7", "17B8", "17B9", "17B10", "18A1", "18A2", "18A3", "18A4", "18A5", "18A6", "18A7", "18A8", "18A9", "18A10", "18B1", "18B2", "18B3", "18B4", "18B5", "18B6", "18B7", "18B8", "18B9", "18B10" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Biaya Awal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 80, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fasilitas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 80, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biaya Lain-lain");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Keterlambatan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 80, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Biaya Total");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 80, 14);

        TAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAwalActionPerformed(evt);
            }
        });
        getContentPane().add(TAwal);
        TAwal.setBounds(100, 40, 190, 30);
        getContentPane().add(TLain);
        TLain.setBounds(100, 100, 190, 30);
        getContentPane().add(TLambat);
        TLambat.setBounds(100, 130, 120, 30);

        TTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTotalActionPerformed(evt);
            }
        });
        getContentPane().add(TTotal);
        TTotal.setBounds(100, 180, 190, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 170, 190, 10);

        BHitung.setText("Hitung");
        BHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BHitung);
        BHitung.setBounds(220, 130, 70, 30);

        CBFasilitas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almari", "Springbed", "Kipas", "Rak Sepatu", "Meja Belajar", "Jemuran" }));
        CBFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBFasilitasActionPerformed(evt);
            }
        });
        getContentPane().add(CBFasilitas);
        CBFasilitas.setBounds(100, 70, 190, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 220, 410, 10);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabel);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 230, 410, 100);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 20, 70, 14);
        getContentPane().add(TNama);
        TNama.setBounds(100, 10, 190, 30);

        BSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/save.jpg"))); // NOI18N
        BSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSaveActionPerformed(evt);
            }
        });
        getContentPane().add(BSave);
        BSave.setBounds(300, 10, 60, 60);

        BEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/edit.jpg"))); // NOI18N
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });
        getContentPane().add(BEdit);
        BEdit.setBounds(300, 80, 60, 59);

        BDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/HAPUS.jpg"))); // NOI18N
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(BDelete);
        BDelete.setBounds(300, 150, 60, 60);

        BClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/delete.jpg"))); // NOI18N
        BClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClearActionPerformed(evt);
            }
        });
        getContentPane().add(BClear);
        BClear.setBounds(370, 150, 60, 60);

        BReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.jpg"))); // NOI18N
        BReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportActionPerformed(evt);
            }
        });
        getContentPane().add(BReport);
        BReport.setBounds(370, 80, 60, 60);

        BHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/home.jpg"))); // NOI18N
        BHome.setBorder(null);
        BHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BHome);
        BHome.setBounds(370, 10, 60, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot_181.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 450, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bersih (){
    TNama.setText(" ");
    TAwal.setText(" ");
    TLain.setText(" ");
    TLambat.setText(" ");
    TTotal.setText(" ");
    CBFasilitas.setSelectedItem(0);
    
    }
    
    public void getData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
                    
        try {
            Statement stat = (Statement) conek.GetConnection().createStatement();
            String sql = "Select * from tabtransaksi";
            ResultSet res = stat.executeQuery (sql);
            
        while(res.next()){
            Object[]obj = new Object[6];
            obj[0] = res.getString("Nama");
            obj[1] = res.getString("Awal");
            obj[2] = res.getString("Fasilitas");
            obj[3] = res.getString("Lain");
            obj[4] = res.getString("Lambat");
            obj[5] = res.getString("Total");
            
            
            model.addRow(obj);
                }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            }
    }
    private void TAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAwalActionPerformed

    private void TTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTotalActionPerformed

    private void BSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSaveActionPerformed
        // TODO add your handling code here:
        String nama = TNama.getText();
        String awal = TAwal.getText();
        String lain = TLain.getText();
        String lambat = TLambat.getText();
        String total = TTotal.getText();
        String fasilitas = (String) CBFasilitas.getSelectedItem();

        try {
            Statement statement = (Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tabtransaksi VALUES('"+ nama +"','"+ awal +"','"+ fasilitas +"','"+ lain +"','"+ lambat +"','"+ total +"');");
            statement.close();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
            TNama.setText(" ");
            TAwal.setText(" ");
            TLain.setText(" ");
            TLambat.setText(" ");
            TTotal.setText(" ");
            CBFasilitas.setSelectedItem(0);
        }
        catch (Exception t){
            JOptionPane.showMessageDialog(null,"Data gagal disimpan!");
        }
        getData();
    }//GEN-LAST:event_BSaveActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
    int i = tabel.getSelectedRow();
    if (i>=0){
    
    TNama.setText(tabel.getValueAt(i, 0).toString());
    TAwal.setText(tabel.getValueAt(i, 1).toString());
    TLain.setText(tabel.getValueAt(i, 3).toString());
    TLambat.setText(tabel.getValueAt(i, 4).toString());
    TTotal.setText(tabel.getValueAt(i, 5).toString());
    CBFasilitas.setSelectedItem(tabel.getValueAt(i, 2).toString());
    
        try {
            Statement statement = (Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("Update tabtransaksi set (Nama='"+ TNama.getText() +"Awal='"+ TAwal.getText() +"Fasilitas='"+ CBFasilitas.getSelectedItem() +"Lain='"+ TLain.getText() +"Lambat='"+ TLambat.getText() +"Total='"+ TTotal.getText() +"');");
            statement.close();
            getData();
            JOptionPane.showMessageDialog(null,"Data berhasil diedit!");
        }
        catch (Exception t){
            JOptionPane.showMessageDialog(null,"Edit Data Sekarang!");
        }
        }
        getData();
    }//GEN-LAST:event_BEditActionPerformed

    
    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        // TODO add your handling code here:
        TNama.setText(" ");
        TAwal.setText(" ");
        TLain.setText(" ");
        TLambat.setText(" ");
        TTotal.setText(" ");
        CBFasilitas.setSelectedItem(0);
    }//GEN-LAST:event_BDeleteActionPerformed

    private void BClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClearActionPerformed
        // TODO add your handling code here:
        String fasilitas = (String) CBFasilitas.getSelectedItem();

        try {
            Statement statement=(Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from tabtransaksi where fasilitas=('"+ fasilitas +"');");
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus!");
            TNama.setText(" ");
            TAwal.setText(" ");
            TLain.setText(" ");
            TLambat.setText(" ");
            TTotal.setText(" ");
            CBFasilitas.setSelectedItem(0);
            CBFasilitas.requestFocus();

        }
        catch (Exception t){
            JOptionPane.showMessageDialog(null,"Data gagal dihapus!");
        }
        getData();
    }//GEN-LAST:event_BClearActionPerformed

    private void BHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHomeActionPerformed
        // TODO add your handling code here:
        new MenUtama().show();
        this.dispose();
    }//GEN-LAST:event_BHomeActionPerformed

    private void CBFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBFasilitasActionPerformed
        // TODO add your handling code here:
       if (CBFasilitas.getSelectedIndex() == 0){
           s = 450000;
       }
       else
       if (CBFasilitas.getSelectedIndex() == 1){
           s = 300000;
       }
       else
       if (CBFasilitas.getSelectedIndex() == 2){
           s = 250000;
       } 
       else
       if (CBFasilitas.getSelectedIndex() == 3){
           s = 50000;
       }
       else
       if (CBFasilitas.getSelectedIndex() == 4){
           s = 350000;
       }
       else
       if (CBFasilitas.getSelectedIndex() == 5){
           s = 50000;
       }       
       else{
           s  = 0;
       }
       TLain.setText(String.valueOf(s));
    }//GEN-LAST:event_CBFasilitasActionPerformed

    private void BHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHitungActionPerformed
        // TODO add your handling code here:
        float aw,ln,lt,total,ttl;
        aw = Float.parseFloat(TAwal.getText());
        ln = Float.parseFloat(TLain.getText());
        lt = Float.parseFloat(TLambat.getText());
        total = aw + ln + (lt*200000);
        ttl = Float.valueOf(total);
        TTotal.setText(""+ttl);
    }//GEN-LAST:event_BHitungActionPerformed

    private void BReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportActionPerformed
        // TODO add your handling code here:
        try {
            Desktop desktop = Desktop.getDesktop();
            URI url = new URI("http://localhost/phpmyadmin/sql.php?db=kost&table=tabtransaksi&printview=1&sql_query=SELECT+%2A+FROM+%60tabtransaksi%60&token=8a0b2233b39fc45137653af26d289cc7");
            if (Desktop.isDesktopSupported()) {
                try {
                    desktop.browse(url);
                } catch (IOException ex) {
                    Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BReportActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BClear;
    private javax.swing.JButton BDelete;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHitung;
    private javax.swing.JButton BHome;
    private javax.swing.JButton BReport;
    private javax.swing.JButton BSave;
    private javax.swing.JComboBox CBFasilitas;
    private javax.swing.JComboBox CBRegis;
    private javax.swing.JTextField TAwal;
    private javax.swing.JTextField TLain;
    private javax.swing.JTextField TLambat;
    private javax.swing.JTextField TNama;
    private javax.swing.JTextField TTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
