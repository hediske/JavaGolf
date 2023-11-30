
package adminCrud;

import java.sql.Connection;
import javax.swing.JDesktopPane;


public class SupprimerMembre extends javax.swing.JInternalFrame {

    private Connection con;
    private JDesktopPane jDesktopPane1;

   
    public SupprimerMembre() {
        initComponents();
    }
       public SupprimerMembre(Connection con ,javax.swing.JDesktopPane jDesktopPane1) {
        this.con=con;
        this.jDesktopPane1=jDesktopPane1;
        initComponents();
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
        Joueur = new javax.swing.JButton();
        Entarineur = new javax.swing.JButton();
        Arbitre = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Supprimer membre");

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Vous voulez supprimer un :");

        Joueur.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Joueur.setText("Joueur");
        Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoueurActionPerformed(evt);
            }
        });

        Entarineur.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Entarineur.setText("Entraineur");
        Entarineur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntarineurActionPerformed(evt);
            }
        });

        Arbitre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Arbitre.setText("Arbitre");
        Arbitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbitreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Entarineur, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Arbitre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entarineur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arbitre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoueurActionPerformed
        SupprimerJoueur adc=new SupprimerJoueur(con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_JoueurActionPerformed

    private void EntarineurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntarineurActionPerformed
        SupprimerEntraineur adc=new SupprimerEntraineur(con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_EntarineurActionPerformed

    private void ArbitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbitreActionPerformed
        SupprimerArbitre adc=new SupprimerArbitre(con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_ArbitreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arbitre;
    private javax.swing.JButton Entarineur;
    private javax.swing.JButton Joueur;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
