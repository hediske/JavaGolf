
package inter;
import entraineurCrud.InterfaceEntraineur;
import JoueurCrud.InterfaceJoueur;
import java.sql.*;
import ig.Connecteur;
import Classes.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import arbitreCRUD.InterfaceArbitre;
public class loginMembre extends javax.swing.JFrame {

    /**
     * Creates new form loginMembre
     */
    public loginMembre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Identifiant");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 16));

        jButton1.setText("Se connecter en tant que admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");
        jLabel2.setPreferredSize(null);

        jToggleButton1.setText("Se Connecter");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Reset");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(92, 92, 92)
                        .addComponent(jToggleButton2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();//tsakker
        loginAdmin mb =new loginAdmin();//thel wahda jdida
        mb.setLocationRelativeTo(null);
        mb.setVisible(true);//tkhaliha todhher
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            Connecteur connect=new Connecteur();
            Connection con = connect.connecttodb();
            Statement stmt;
            ResultSet rs ;
            String st;
            
        String username=user.getText();///getText() :takhou text men zone de texte
        String password=new String(pass.getPassword());///getText() :zone text men zone de texte w thotoo fi string

        if (username.equals(""))
        JOptionPane.showMessageDialog(null,"Donner un nom d'utilisateur sil vous plait!!");///taa3mel frame jdidia khater hatit null
        else if(password.equals("")) //If password is null
        {
            JOptionPane.showMessageDialog(null,"Donner un mot de passe sil vous plait!!"); //Display dialog box with the message
        }
        else {

            try
            {   
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);                
                st = ("SELECT * FROM Joueur WHERE id_joueur='"+username+"' AND mdp_joueur='"+password+"'");
                rs = stmt.executeQuery(st);
                if (rs.next())///nestaamlo next bech nemchiu el 9oddem wenthabtou mahich fergha
                {
                    rs.first();///narj3ou 9bal khater 3malna next
                    joueur j = new joueur(rs.getString(1),rs.getString(4),rs.getString(2),rs.getString(3),rs.getDate(5),rs.getString(6),rs.getLong(7),rs.getString(12).charAt(0),rs.getString(10).charAt(0),rs.getString(9));
                    JOptionPane.showMessageDialog(null,"Bienvenue....."); //Display mot de passe svp!!) dialog box with the message                    
                    this.dispose();///tsaker el frame hathi ken thab wahda okhra frame 3ana tsamiha x.dispose()                    
                    InterfaceJoueur ij =new InterfaceJoueur (j,con);
                    ij.setLocationRelativeTo(null);
                    ij.setVisible(true);

                }
                else 
                {   
                    st = ("SELECT * FROM Entraineur WHERE id_entraineur='"+username+"' AND mdp_entraineur='"+password+"'");
                    rs = stmt.executeQuery(st );
                    if (rs.next())///nestaamlo next bech nemchiu el 9oddem wenthabtou mahich fergha
                    {
                        rs.first();///narj3ou 9bal khater 3malna next
                        entraineur e = new entraineur(rs.getString(1),rs.getString(4),rs.getString(2),rs.getString(3),rs.getDate(5),rs.getString(6),rs.getLong(7),rs.getString(10).charAt(0),rs.getFloat(9));
                        JOptionPane.showMessageDialog(null,"Bienvenue....."); //Display mot de passe svp!!) dialog box with the message                    
                        this.dispose();///tsaker el frame hathi ken thab wahda okhra frame 3ana tsamiha x.dispose()                           
                        InterfaceEntraineur ie =new InterfaceEntraineur (e,con);
                        ie.setLocationRelativeTo(null);
                        ie.setVisible(true);
                    }                    
                    else 
                    {   
                        st = ("SELECT * FROM Arbitre WHERE id_arbitre='"+username+"' AND mdp_arbitre='"+password+"'");
                        rs = stmt.executeQuery(st);
                        if (rs.next())///nestaamlo next bech nemchiu el 9oddem wenthabtou mahich fergha
                        {
                            rs.first();///narj3ou 9bal khater 3malna next
                            JOptionPane.showMessageDialog(null,"Bienvenue....."); //Display mot de passe svp!!) dialog box with the message                    
                            this.dispose();///tsaker el frame hathi ken thab wahda okhra frame 3ana tsamiha x.dispose()                               
                            arbitre a = new arbitre(rs.getString(1),rs.getString(4),rs.getString(2),rs.getString(3),rs.getDate(5),rs.getString(6),rs.getLong(7),rs.getString(11).charAt(0),rs.getFloat(9),rs.getString(10));
                            InterfaceArbitre iar =new InterfaceArbitre (a,con);
                            iar.setLocationRelativeTo(null);
                            iar.setVisible(true);

                        }
                        else
                        {
                            System.out.println("utilisateur / mot de passe incorrecte");  
                            JOptionPane.showMessageDialog(null,"utilisateur / mot de passe incorrecte!"); //affichier dialogue w kel 3ada null
                        }

                    }

            }

            } catch (SQLException ex) {
                System.out.println("Probleme dans la base de données"+ex);
            }
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        user.setText("");
        pass.setText("");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(loginMembre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginMembre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginMembre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginMembre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginMembre().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
