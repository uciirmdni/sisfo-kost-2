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
 * @author --Suci Ramadhani--
 */
public class Kamar extends javax.swing.JFrame {
    private DefaultTableModel model;

    /**
     * Creates new form Kamar
     */
    public Kamar() {
        initComponents();
        bersih();
        model = new DefaultTableModel();
        tabel.setModel(model);
            model.addColumn("Kode");
            model.addColumn("Nama");
            model.addColumn("Status"); 
            
            getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void bersih (){
    CBKode.setSelectedItem(0);
    TNama.setText(" ");
    CBStatus.setSelectedItem(0);
    TCari.setText(" ");
    }
    
    public void getData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
                    
        try {
            Statement stat = (Statement) conek.GetConnection().createStatement();
            String sql = "Select * from tabkamar";
            ResultSet res = stat.executeQuery (sql);
            
        while(res.next()){
            Object[]obj = new Object[3];
            obj[0] = res.getString("Kode");
            obj[1] = res.getString("Nama");
            obj[2] = res.getString("Status");
            
            model.addRow(obj);
                }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBKode = new javax.swing.JComboBox();
        CBStatus = new javax.swing.JComboBox();
        TNama = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        BSave = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BReport = new javax.swing.JButton();
        BHome = new javax.swing.JButton();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        BClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 370));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 70, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 70, 14);

        CBKode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        getContentPane().add(CBKode);
        CBKode.setBounds(90, 10, 180, 30);

        CBStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kosong", "Terisi" }));
        getContentPane().add(CBStatus);
        CBStatus.setBounds(90, 70, 180, 30);
        getContentPane().add(TNama);
        TNama.setBounds(90, 40, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 160, 260, 10);

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
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 260, 140);

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
        BEdit.setBounds(300, 70, 60, 59);

        BReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.jpg"))); // NOI18N
        BReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportActionPerformed(evt);
            }
        });
        getContentPane().add(BReport);
        BReport.setBounds(300, 190, 60, 60);

        BHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/home.jpg"))); // NOI18N
        BHome.setBorder(null);
        BHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BHome);
        BHome.setBounds(300, 250, 60, 60);

        TCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCariActionPerformed(evt);
            }
        });
        getContentPane().add(TCari);
        TCari.setBounds(50, 120, 220, 30);

        BCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/flat_ui_icon_pack_v111.jpg"))); // NOI18N
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });
        getContentPane().add(BCari);
        BCari.setBounds(10, 120, 30, 30);

        BClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/delete.jpg"))); // NOI18N
        BClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClearActionPerformed(evt);
            }
        });
        getContentPane().add(BClear);
        BClear.setBounds(300, 130, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot_181.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 380, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSaveActionPerformed
        // TODO add your handling code here:
        String kode = (String) CBKode.getSelectedItem();
        String nama = TNama.getText();
        String status = (String) CBStatus.getSelectedItem();
        
        try {
            Statement statement = (Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("insert into tabkamar VALUES('"+ kode +"','"+ nama +"','"+ status +"');");
            statement.close();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
            TNama.setText(" ");
            CBKode.setSelectedItem(0);
            CBStatus.setSelectedItem(0);
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
    CBKode.setSelectedItem(tabel.getValueAt(i, 0).toString());
    TNama.setText(tabel.getValueAt(i, 1).toString());
    CBStatus.setSelectedItem(tabel.getValueAt(i, 2));
    }
    
       try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("Update tabkamar set (Kode='"+ CBKode.getSelectedItem() +"', Nama='"+ TNama.getText()+"',Status='"+ CBStatus.getSelectedItem() +"');");
            JOptionPane.showMessageDialog(null,"Data berhasil diedit!");
        TNama.setText(" ");
        CBKode.setSelectedItem(0);
        CBStatus.setSelectedItem(0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Edit Data sekarang!");
        }
       
            getData();
    }//GEN-LAST:event_BEditActionPerformed

    private void BHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHomeActionPerformed
        // TODO add your handling code here:
        new MenUtama().show();
        this.dispose();
    }//GEN-LAST:event_BHomeActionPerformed

    private void BReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportActionPerformed
        // TODO add your handling code here:
         try {
            Desktop desktop = Desktop.getDesktop();
            URI url = new URI("http://localhost/phpmyadmin/sql.php?db=kost&table=tabkamar&printview=1&sql_query=SELECT+%2A+FROM+%60tabkamar%60&token=8a0b2233b39fc45137653af26d289cc7");
            if (Desktop.isDesktopSupported()) {
                try {
                    desktop.browse(url);
                } catch (IOException ex) {
                    Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BReportActionPerformed

    private void TCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCariActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TCariActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
        model = new DefaultTableModel();
            model.addColumn("Kode");
            model.addColumn("Nama");
            model.addColumn("Status"); 
        
        try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
            String sql = "Select * from tabkamar where Kode like '%" + TCari.getText() + "%'" +
            "or Nama like '%" + TCari.getText() + "%'" +
            "or Status like '%" + TCari.getText() + "%'";
            ResultSet res = statement.executeQuery (sql);
            
        while(res.next()){
            Object[]obj = new Object[3];
            obj[0] = res.getString("Kode");
            obj[1] = res.getString("Nama");
            obj[2] = res.getString("Status");
            
            model.addRow(obj);
                }
        tabel.setModel(model);
        }catch(SQLException err){
        }
    }//GEN-LAST:event_BCariActionPerformed

    private void BClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClearActionPerformed
        // TODO add your handling code here:
        String kode = (String) CBKode.getSelectedItem();

        try {
            Statement statement=(Statement)conek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from tabkamar where kode=('"+ kode +"');");
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus!");
            TNama.setText(" ");            
            CBKode.setSelectedItem(0);
            CBStatus.setSelectedItem(0);
            CBKode.requestFocus();

        }
        catch (Exception t){
            JOptionPane.showMessageDialog(null,"Data gagal dihapus!");
        }
        getData();
    }//GEN-LAST:event_BClearActionPerformed

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
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BClear;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHome;
    private javax.swing.JButton BReport;
    private javax.swing.JButton BSave;
    private javax.swing.JComboBox CBKode;
    private javax.swing.JComboBox CBStatus;
    private javax.swing.JTextField TCari;
    private javax.swing.JTextField TNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
