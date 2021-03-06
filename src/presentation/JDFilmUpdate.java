package presentation;

import dao.*;
import factory.*;
import transferObject.*;
import java.util.*;
import javax.swing.text.*;  // pour DateFormatter
import java.text.*;         // pour DateFormat
import javax.swing.*;

public class JDFilmUpdate extends javax.swing.JDialog {
    
    /** Creates new form JDApparInsert */
    public JDFilmUpdate(java.awt.Frame parent, String titre, Film f) {
        super(parent, titre, true);
        initComponents();
        fillComponents(f);
        getRootPane().setDefaultButton(jButtonOK);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/3);
        setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextTitre = new javax.swing.JTextField();
        jYearChooserSortie = new com.toedter.calendar.JYearChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Titre");

        jLabel3.setText("Année de sortie");

        jLabel4.setText("Durée en minutes");

        jLabel1.setText("Identifiant");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel4)
                    .add(jLabel3))
                .add(28, 28, 28)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jYearChooserSortie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSpinField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jYearChooserSortie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSpinField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOK);

        jButtonAnnul.setText("Annuler");
        jButtonAnnul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAnnul);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
// TODO add your handling code here:
        Film film = new Film();
        film.setIdFilm(Integer.parseInt(jTextId.getText()));
        film.setTitre(jTextTitre.getText());
        film.setAnnée(jYearChooserSortie.getValue());
        film.setDurée(jSpinField1.getValue());
        boolean ok = daoFilm.updateFilm(film);
        if (!ok)
            JOptionPane.showMessageDialog(null,"Modification impossible !","Avertissement",JOptionPane.ERROR_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed
    
    private void fillComponents(Film f)
    {
        jTextTitre.setText(f.getTitre());
        jYearChooserSortie.setValue(f.getAnnée());
        jSpinField1.setValue(f.getDurée());
        jTextId.setText(String.valueOf(f.getIdFilm()));
        jTextId.setEditable(false);
        
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnul;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextTitre;
    private com.toedter.calendar.JYearChooser jYearChooserSortie;
    // End of variables declaration//GEN-END:variables
    private DAOFilm daoFilm = Factory.getDAOFilm();

}
