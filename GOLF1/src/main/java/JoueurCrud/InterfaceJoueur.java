/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JoueurCrud;

import Classes.joueur;
import ig.Connecteur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class InterfaceJoueur extends javax.swing.JFrame {
private Connection con;
 private joueur player;
    /**
     * Creates new form InterfaceJoueur
     */
    public InterfaceJoueur() {
        initComponents();
        this.player=new joueur();
        Connecteur connect=new Connecteur();
        con=connect.connecttodb();
        this.joueurloginname.setText("Bienvenue! ");

    }
    public InterfaceJoueur(joueur j,Connection con)
    {
    this.player=j;
        this.con=con;
        initComponents();
        this.joueurloginname.setText("Bienvenue! "+j.getNom()+" "+j.getPrenom());}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joueurloginname = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        assistcompt = new javax.swing.JButton();
        afficompetitions = new javax.swing.JButton();
        voirscore = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        joueurloginname.setBackground(new java.awt.Color(255, 255, 255));
        joueurloginname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        joueurloginname.setForeground(new java.awt.Color(0, 153, 0));
        joueurloginname.setText("jLabel1");
        joueurloginname.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                joueurloginnamePropertyChange(evt);
            }
        });

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(605, 408));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        assistcompt.setBackground(new java.awt.Color(51, 153, 0));
        assistcompt.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        assistcompt.setForeground(new java.awt.Color(255, 255, 255));
        assistcompt.setText("Assister à une compétition");
        assistcompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistcomptActionPerformed(evt);
            }
        });

        afficompetitions.setBackground(new java.awt.Color(51, 153, 0));
        afficompetitions.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        afficompetitions.setForeground(new java.awt.Color(255, 255, 255));
        afficompetitions.setText("Afficher les compétition");
        afficompetitions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficompetitionsActionPerformed(evt);
            }
        });

        voirscore.setBackground(new java.awt.Color(51, 153, 0));
        voirscore.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        voirscore.setForeground(new java.awt.Color(255, 255, 255));
        voirscore.setText("Voir mon score");
        voirscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voirscoreActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Enregistrer mon score");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 153, 0));
        jButton5.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Gangant");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 0));
        jButton6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Voire mon progression");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(joueurloginname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(afficompetitions, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assistcompt)
                    .addComponent(voirscore, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(joueurloginname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afficompetitions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(assistcompt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(voirscore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joueurloginnamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_joueurloginnamePropertyChange
        // TODO add your handling code her
    }//GEN-LAST:event_joueurloginnamePropertyChange

    private void afficompetitionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficompetitionsActionPerformed
        AfficherCompetitions j=new AfficherCompetitions();
         
         jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(j);
        j.show();
     
    // TODO add your handling code here:
    }//GEN-LAST:event_afficompetitionsActionPerformed

    private void assistcomptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistcomptActionPerformed
AssisterCompetition ac=new AssisterCompetition(this.player,this.con);
     jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(ac);
        ac.show(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_assistcomptActionPerformed

    private void voirscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voirscoreActionPerformed
VoirScore vs=new VoirScore(this.player,this.con);
jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(vs);
        vs.show();
// TODO add your handling code here:
    }//GEN-LAST:event_voirscoreActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       EnregistrerScore ES=new EnregistrerScore(this.player,this.con);
          jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(ES);
        ES.show();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

            try
            {
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String st = ("select sum(score.pts) from score where score.id_joueur='"+this.player.getId()+"' and score.verifié=true");
                ResultSet rs = stmt.executeQuery(st);
            ResultSetMetaData metaData = rs.getMetaData();// TODO add your handling code here:
            int progression;
            if (rs.next()) {
            progression= rs.getInt(1);
            JOptionPane.showMessageDialog(null,"votre porgression est: "+progression);}
            else 
              JOptionPane.showMessageDialog(null,"votre progression est nulle");
            }
             catch(SQLException ex)
             {
                 System.out.println("connection problem");
                               JOptionPane.showMessageDialog(null,"problème de connection");

             }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JoueurGagnant j=new JoueurGagnant(this.con);
jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(j);
        j.show();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJoueur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficompetitions;
    private javax.swing.JButton assistcompt;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    public volatile javax.swing.JLabel joueurloginname;
    private javax.swing.JButton voirscore;
    // End of variables declaration//GEN-END:variables
}
