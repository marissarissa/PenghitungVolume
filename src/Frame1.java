/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marissa Nur Aini
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnvolume1 = new javax.swing.JButton();
        etPanjang = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTinggiBalok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnvolume2 = new javax.swing.JButton();
        jPanjangBalok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLebarBalok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        etinggi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnvolume3 = new javax.swing.JButton();
        etjari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Program Penghitung Volume Bangun Ruang");

        jPanel5.setLayout(null);

        btnvolume1.setText("Volume");
        btnvolume1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolume1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnvolume1);
        btnvolume1.setBounds(170, 200, 73, 23);
        jPanel5.add(etPanjang);
        etPanjang.setBounds(140, 140, 120, 30);

        jLabel16.setText("Masukkan Panjang Sisi");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(150, 110, 130, 14);

        jLabel18.setText("cm");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(280, 150, 20, 14);

        jTabbedPane1.addTab("Kubus", jPanel5);

        jPanel1.setLayout(null);

        jLabel2.setText("cm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 60, 20, 14);
        jPanel1.add(jTinggiBalok);
        jTinggiBalok.setBounds(400, 50, 120, 30);

        jLabel3.setText("Masukkan Tinggi Sisi");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 30, 147, 14);

        btnvolume2.setText("Volume");
        btnvolume2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolume2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolume2);
        btnvolume2.setBounds(150, 250, 73, 23);
        jPanel1.add(jPanjangBalok);
        jPanjangBalok.setBounds(130, 60, 120, 30);

        jLabel8.setText("Masukkan Panjang Sisi");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 40, 147, 14);
        jPanel1.add(jLebarBalok);
        jLebarBalok.setBounds(130, 140, 120, 30);

        jLabel9.setText("Masukkan Lebar Sisi");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 110, 147, 14);

        jLabel10.setText("cm");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 70, 20, 10);

        jLabel11.setText("cm");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(270, 140, 20, 14);
        jPanel1.add(etinggi);
        etinggi.setBounds(130, 210, 120, 30);

        jLabel14.setText("cm");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 210, 20, 14);

        jLabel15.setText("Masukkan Tinggi Sisi");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(130, 180, 150, 14);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel4.setLayout(null);

        btnvolume3.setText("Volume");
        btnvolume3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolume3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnvolume3);
        btnvolume3.setBounds(170, 150, 73, 23);
        jPanel4.add(etjari);
        etjari.setBounds(150, 90, 120, 30);

        jLabel12.setText("Masukkan Jari-jari");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(150, 70, 147, 14);

        jLabel13.setText("cm");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(290, 100, 20, 14);

        jTabbedPane1.addTab("Bola", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolume1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolume1ActionPerformed
        int sisi;
        sisi = Integer.parseInt(etPanjang.getText());
        int hasil = sisi*sisi*sisi;
        try {
            JOptionPane.showMessageDialog(null, "Volume Kubus adalah : "+hasil, "Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal ", JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolume1ActionPerformed

    private void btnvolume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolume2ActionPerformed
        int panjang, lebar, tinggi;
        panjang = Integer.parseInt(jPanjangBalok.getText());
        lebar = Integer.parseInt(jLebarBalok.getText());
        tinggi = Integer.parseInt(etinggi.getText());
        int hasil = panjang*lebar*tinggi;
        try{
            JOptionPane.showMessageDialog(null, "Volume Balok adalah : "+hasil, "Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+ e,"Gagal ", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolume2ActionPerformed

    private void btnvolume3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolume3ActionPerformed
        int jari;
        jari = Integer.parseInt(etjari.getText());
        float hasil = (float) (4/3*3.14*jari*jari);
        try{
            JOptionPane.showMessageDialog(null, "Volume Bola adalah "+ hasil, "Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolume3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolume1;
    private javax.swing.JButton btnvolume2;
    private javax.swing.JButton btnvolume3;
    private javax.swing.JTextField etPanjang;
    private javax.swing.JTextField etinggi;
    private javax.swing.JTextField etjari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLebarBalok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jPanjangBalok;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTinggiBalok;
    // End of variables declaration//GEN-END:variables
}
