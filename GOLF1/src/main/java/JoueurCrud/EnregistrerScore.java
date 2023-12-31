/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JoueurCrud;

import Classes.joueur;
import ig.Connecteur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class EnregistrerScore extends javax.swing.JInternalFrame {
private Connection con;
 final joueur player;
    /**
     * Creates new form EnregistrerScore
     * @param p
     * @param con
     */
    public EnregistrerScore(joueur p,Connection con) {
        initComponents();
        this.player=p;
        this.con=con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        comptlabel2 = new javax.swing.JLabel();
        scoreAenregistrer = new javax.swing.JSpinner();
        idcomptEs = new javax.swing.JSpinner();
        valider_enreg_score = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        comptlabel3 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        jLabel12.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enregistrer mon score");

        comptlabel2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        comptlabel2.setText("Id_competition");

        valider_enreg_score.setBackground(new java.awt.Color(0, 153, 51));
        valider_enreg_score.setText("valider");
        valider_enreg_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_enreg_scoreActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 102, 0));
        jButton17.setText("réinitialiser");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        comptlabel3.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        comptlabel3.setText("Score");

        cancel.setBackground(new java.awt.Color(255, 102, 0));
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(idcomptEs, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(scoreAenregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comptlabel2)
                                .addComponent(comptlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valider_enreg_score, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comptlabel2)
                    .addComponent(idcomptEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comptlabel3)
                    .addComponent(scoreAenregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(valider_enreg_score))
                .addGap(64, 64, 64)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        idcomptEs.setValue(0);
        scoreAenregistrer.setValue(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void valider_enreg_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_enreg_scoreActionPerformed
        Connecteur connect=new Connecteur();
        con = connect.connecttodb();
        int compet=(int)idcomptEs.getValue();
        int score=(int)scoreAenregistrer.getValue();
        if(compet==0)
        {JOptionPane.showMessageDialog(null,"vous devez remplir le champ id_competition");
        }
        else
        {try{

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String st = ("select competition.* from competition where competition.id_compt="+compet+";");
            ResultSet rs = stmt.executeQuery(st);
            ResultSetMetaData metaData = rs.getMetaData();
            Date dateact = java.sql.Date.valueOf(LocalDate.now()); 
            if(rs.next()){
                if(rs.getDate(5).before(dateact) || rs.getDate(5).equals(dateact))
                {
                    Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    String str=("UPDATE score SET score.pts="+score+" WHERE score.id_joueur='"+player.getId()+"' and score.id_compt="+compet+";");
                    int res = stmt.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"votre score est enregistrer  avec succés");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"vous ne pouvez pas ajouter votre score dans une competition qui n'est pas encore jouée");

                }

            }
            else
            {                            JOptionPane.showMessageDialog(null,"il n'existe plus une competition dont son id est:"+compet);

            }

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"problème de connexion");

        }

        }// TODO add your handling code here:
    }//GEN-LAST:event_valider_enreg_scoreActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel comptlabel2;
    private javax.swing.JLabel comptlabel3;
    private javax.swing.JSpinner idcomptEs;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JSpinner scoreAenregistrer;
    private javax.swing.JButton valider_enreg_score;
    // End of variables declaration//GEN-END:variables
}
