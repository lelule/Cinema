package presentation;

import dao.*;
import factory.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import transferObject.*;
import java.util.*;
import javax.swing.text.*;  // pour DateFormatter
import java.text.*;         // pour DateFormat
import javax.swing.*;

public class JDSeanceInsert extends javax.swing.JDialog {
    
    /** Creates new form JDApparInsert */
    public JDSeanceInsert(java.awt.Frame parent, String titre) {
        super(parent, titre, true);
        initComponents();
        fillComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboFilm = new javax.swing.JComboBox();
        jComboJour = new javax.swing.JComboBox();
        jComboHeure = new javax.swing.JComboBox();
        jComboSalle = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel2.setText("Film");

        jLabel3.setText("Jour");

        jLabel4.setText("Heure");

        jLabel5.setText("Salle");

        jComboFilm.setEditable(true);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboSalle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboHeure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel1)
                                .add(436, 436, 436))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboFilm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboJour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboFilm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboJour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jComboHeure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jComboSalle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40)
                .add(jLabel1)
                .addContainerGap(320, Short.MAX_VALUE))
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

        Seance s =new Seance();
        s.setFilm((Film)jComboFilm.getSelectedItem());
        s.setJour((Jour)jComboJour.getSelectedItem());
        s.setHeure((Heure)jComboHeure.getSelectedItem());
        s.setSalle((Salle)jComboSalle.getSelectedItem());
        boolean ok=false;
        ArrayList <Seance> listeSeance = daoSea.selectSeances();
        if(!listeSeance.contains(s) ){
            ok = daoSea.insertSeance(s);
        }
        if (!ok){
            JOptionPane.showMessageDialog(null,"Insertion impossible !","Avertissement",JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed
    
    private void fillComponents()
    {
        ArrayList <Jour> j = daoJour.selectJours();
        for (int i=0;i<j.size();i++){
            jComboJour.addItem(j.get(i));
        }
        ArrayList <Heure> h = daoHeure.selectHeures();
        for (int i=0;i<h.size();i++){
            jComboHeure.addItem(h.get(i));
        }
        ArrayList <Salle> salle = daoSalle.selectSalles();
        for (int i=0;i<salle.size();i++){
            jComboSalle.addItem(salle.get(i));
        }
        ArrayList <Film> f = daoFilm.selectFilms();
        for (int i=0;i<f.size();i++){
            jComboFilm.addItem(f.get(i));
        }
        
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnul;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboFilm;
    private javax.swing.JComboBox jComboHeure;
    private javax.swing.JComboBox jComboJour;
    private javax.swing.JComboBox jComboSalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private DAOSeance daoSea = Factory.getDAOSeance();
    private DAOJour daoJour= Factory.getDAOJour();
    private DAOHeure daoHeure = Factory.getDAOHeure();
    private DAOSalle daoSalle = Factory.getDAOSalle();
    private DAOFilm daoFilm = Factory.getDAOFilm();

}
