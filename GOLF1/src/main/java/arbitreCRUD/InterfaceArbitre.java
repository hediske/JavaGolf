
package arbitreCRUD;
import inter.*;
import Classes.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InterfaceArbitre extends javax.swing.JFrame {

    private arbitre a;
    private Connection con;

    
    public InterfaceArbitre() {
        
        initComponents();
    }
    public InterfaceArbitre(arbitre a,Connection con) {
        this.a=a;
        this.con=con;
        initComponents();
        String getValue ;
        getValue=jLabel1.getText();
        if (a.getSexe()=='h')
            jLabel1.setText(getValue+" Mr  : "+a.getNom()+"  !");
        else
            jLabel1.setText(getValue+" Mme  : "+a.getNom()+"  !");            

    }

    private boolean existe_compt_aujour(){
        Statement stmt;
        ResultSet rs ;        
        try
        {
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String sql=("select * from competition where id_arbitre='"+a.getId()+"' and date_compt=Curdate()");
            rs=stmt.executeQuery(sql);
            return rs.next();   
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null,"Attention! erreur dans la base de Données"+e); 

        }
        return(false);
    
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        ButSean4 = new javax.swing.JButton();
        ButSeDec = new javax.swing.JButton();
        ButSean2 = new javax.swing.JButton();
        ButSean3 = new javax.swing.JButton();

        jButton3.setText("Supprimer Seance d'entrainement");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Afficher mes joueurs");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue ");

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(97, 113, 169));

        ButSean4.setBackground(new java.awt.Color(72, 87, 190));
        ButSean4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean4.setForeground(new java.awt.Color(255, 255, 255));
        ButSean4.setText("Afficher le classement actuel");
        ButSean4.setActionCommand("");
        ButSean4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSean4ActionPerformed(evt);
            }
        });

        ButSeDec.setBackground(new java.awt.Color(72, 87, 190));
        ButSeDec.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSeDec.setForeground(new java.awt.Color(255, 255, 255));
        ButSeDec.setText("Se déconnecter");
        ButSeDec.setActionCommand("");
        ButSeDec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSeDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSeDecActionPerformed(evt);
            }
        });

        ButSean2.setBackground(new java.awt.Color(72, 87, 190));
        ButSean2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean2.setForeground(new java.awt.Color(255, 255, 255));
        ButSean2.setText("Mes Compétitions prochaines");
        ButSean2.setActionCommand("");
        ButSean2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSean2ActionPerformed(evt);
            }
        });

        ButSean3.setBackground(new java.awt.Color(72, 87, 190));
        ButSean3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean3.setForeground(new java.awt.Color(255, 255, 255));
        ButSean3.setText("Vérifier le Score d'un joueur");
        ButSean3.setActionCommand("");
        ButSean3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSean3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ButSeDec, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButSean2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(ButSean3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButSean4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(ButSean2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButSean3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButSean4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(ButSeDec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(164, 164, 164))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ButSeDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSeDecActionPerformed
    JOptionPane.showMessageDialog(null,"Au revoir !!");
    login ee =new login ();
    ee.setLocationRelativeTo(null);
    this.dispose();
    ee.setVisible(true);
    }//GEN-LAST:event_ButSeDecActionPerformed

    private void ButSean2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSean2ActionPerformed
        CalArb adb=new CalArb(a,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adb);
        adb.show();
        
    }//GEN-LAST:event_ButSean2ActionPerformed

    private void ButSean3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSean3ActionPerformed
        if (existe_compt_aujour())
        {
            VeriSco adb=new VeriSco(a,con);
            jDesktopPane1.removeAll();
            jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
            jDesktopPane1.add(adb);
            adb.show();
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Désolé ! Vous n'avez pas de competition aujourd'hui");
        }
            }//GEN-LAST:event_ButSean3ActionPerformed

    private void ButSean4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSean4ActionPerformed
        if (existe_compt_aujour())
        {
            ShowCl adb=new ShowCl(a,con);
            jDesktopPane1.removeAll();
            jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
            jDesktopPane1.add(adb);
            adb.show();
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Désolé ! Vous n'avez pas de competition aujourd'hui");
        }

    }//GEN-LAST:event_ButSean4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButSeDec;
    private javax.swing.JButton ButSean2;
    private javax.swing.JButton ButSean3;
    private javax.swing.JButton ButSean4;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 
}
