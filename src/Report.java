import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author --User31--
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BReport = new javax.swing.JButton();
        BReport1 = new javax.swing.JButton();
        BReport2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 360));
        setResizable(false);
        getContentPane().setLayout(null);

        BReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/penyewa.png"))); // NOI18N
        BReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportActionPerformed(evt);
            }
        });
        getContentPane().add(BReport);
        BReport.setBounds(20, 110, 60, 60);

        BReport1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kamar.png"))); // NOI18N
        BReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReport1ActionPerformed(evt);
            }
        });
        getContentPane().add(BReport1);
        BReport1.setBounds(20, 180, 60, 60);

        BReport2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/transaksi.png"))); // NOI18N
        BReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReport2ActionPerformed(evt);
            }
        });
        getContentPane().add(BReport2);
        BReport2.setBounds(20, 250, 60, 60);

        jLabel1.setFont(new java.awt.Font("Maximum High Tension", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Report Penyewa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 130, 140, 20);

        jLabel2.setFont(new java.awt.Font("Maximum High Tension", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Report Transaksi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 270, 140, 20);

        jLabel3.setFont(new java.awt.Font("Maximum High Tension", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Report Kamar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 200, 120, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 90, 260, 10);

        jLabel5.setFont(new java.awt.Font("Mojito in June", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REPORT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 40, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot_181.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 300, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportActionPerformed
        // TODO add your handling code here:
        try {
            Desktop desktop = Desktop.getDesktop();
            URI url = new URI("http://localhost/phpmyadmin/sql.php?db=kost&table=tabkost1&printview=1&sql_query=SELECT+%2A+FROM+%60tabkost1%60&token=8a0b2233b39fc45137653af26d289cc7");
            if (Desktop.isDesktopSupported()) {
                try {
                    desktop.browse(url);
                } catch (IOException ex) {
                    Logger.getLogger(Penyewa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Penyewa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BReportActionPerformed

    private void BReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReport1ActionPerformed
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
    }//GEN-LAST:event_BReport1ActionPerformed

    private void BReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReport2ActionPerformed
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
    }//GEN-LAST:event_BReport2ActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReport;
    private javax.swing.JButton BReport1;
    private javax.swing.JButton BReport2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
