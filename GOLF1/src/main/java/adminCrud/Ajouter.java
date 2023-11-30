
package adminCrud;

import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class Ajouter extends javax.swing.JInternalFrame {
    private Connection con;
    private javax.swing.JDesktopPane jDesktopPane1;
    public Ajouter() {
        initComponents();
    }
    public Ajouter(Connection con,javax.swing.JDesktopPane jDesktopPane1) {
        this.con=con;
        this.jDesktopPane1=jDesktopPane1;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Joueur = new javax.swing.JButton();
        Entarineur = new javax.swing.JButton();
        Arbitre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ajouter membre");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Vous voulez ajouter un :");

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
                        .addGap(259, 259, 259)
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
        AjouterJoueur adc=new AjouterJoueur(con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_JoueurActionPerformed

    private void EntarineurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntarineurActionPerformed
        ajouterEntraineur adc=new ajouterEntraineur(con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_EntarineurActionPerformed

    private void ArbitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbitreActionPerformed
        AjouterArbitre adc=new AjouterArbitre(con);
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
