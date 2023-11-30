
package entraineurCrud;
import inter.*;
import Classes.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class InterfaceEntraineur extends javax.swing.JFrame {

    private entraineur e;
    private Connection con;
    private String Trouver_message(entraineur e)
    {
            Statement stmt;
            ResultSet rs ;
            try{
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);                
                String s=("SELECT * FROM seance_e WHERE (id_entraineur='"+e.getId()+"') AND (date_seance >=CURDATE()) And (date_seance < DATE_ADD(curdate(), INTERVAL 7 DAY)) order by date_seance" );
                rs=stmt.executeQuery(s);
                if(rs.next())
                {
                    rs.first();
                    System.out.println(rs.getDate(2));
                    return("Votre prochaine seance cette semaine est le " +rs.getDate(2)+"  !!!");  
                }
                else 
                    return("Pas de seance cette semaine pour vous!");
            }
            catch(SQLException ex)
            {
                System.out.println("Probleme dans la base de données"+ex);
                return("");
            }
    }
    
    public InterfaceEntraineur() {
        
        initComponents();
    }
    public InterfaceEntraineur(entraineur e,Connection con) {
        this.e=e;
        this.con=con;
        initComponents();
        String getValue ;
        getValue=jLabel1.getText();
        if (e.getSexe()=='h')
            jLabel1.setText(getValue+" Mr  : "+e.getNom()+"  !");
        else
            jLabel1.setText(getValue+" Mme  : "+e.getNom()+"  !");            
        getValue=jLabel3.getText();
        jLabel3.setText(getValue+ Trouver_message(e));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        ButSean = new javax.swing.JButton();
        ButSeDec = new javax.swing.JButton();
        butsh = new javax.swing.JButton();
        butcal = new javax.swing.JButton();
        ButSean2 = new javax.swing.JButton();
        ButSean1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("Actuellement , ");

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(97, 113, 169));

        ButSean.setBackground(new java.awt.Color(72, 87, 190));
        ButSean.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean.setForeground(new java.awt.Color(255, 255, 255));
        ButSean.setText("Ajouter Seance d'entrainement");
        ButSean.setActionCommand("");
        ButSean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButSean.setPreferredSize(new java.awt.Dimension(163, 63));
        ButSean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSeanActionPerformed(evt);
            }
        });

        ButSeDec.setBackground(new java.awt.Color(72, 87, 190));
        ButSeDec.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSeDec.setForeground(new java.awt.Color(255, 255, 255));
        ButSeDec.setText("Se déconnecter");
        ButSeDec.setActionCommand("");
        ButSeDec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSeDec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButSeDec.setPreferredSize(new java.awt.Dimension(163, 63));
        ButSeDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSeDecActionPerformed(evt);
            }
        });

        butsh.setBackground(new java.awt.Color(72, 87, 190));
        butsh.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        butsh.setForeground(new java.awt.Color(255, 255, 255));
        butsh.setText("Afficher mes joueurs");
        butsh.setActionCommand("");
        butsh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butsh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butsh.setPreferredSize(new java.awt.Dimension(163, 63));
        butsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butshActionPerformed(evt);
            }
        });

        butcal.setBackground(new java.awt.Color(72, 87, 190));
        butcal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        butcal.setForeground(new java.awt.Color(255, 255, 255));
        butcal.setText("Afficher mon Calendrier");
        butcal.setActionCommand("");
        butcal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butcal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butcal.setPreferredSize(new java.awt.Dimension(163, 63));
        butcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcalActionPerformed(evt);
            }
        });

        ButSean2.setBackground(new java.awt.Color(72, 87, 190));
        ButSean2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean2.setForeground(new java.awt.Color(255, 255, 255));
        ButSean2.setText("Modifier Seance d'entrainement");
        ButSean2.setActionCommand("");
        ButSean2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButSean2.setPreferredSize(new java.awt.Dimension(163, 63));
        ButSean2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSean2ActionPerformed(evt);
            }
        });

        ButSean1.setBackground(new java.awt.Color(72, 87, 190));
        ButSean1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButSean1.setForeground(new java.awt.Color(255, 255, 255));
        ButSean1.setText("Supprimer Seance d'entrainement");
        ButSean1.setActionCommand("");
        ButSean1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButSean1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButSean1.setPreferredSize(new java.awt.Dimension(163, 63));
        ButSean1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSean1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButSean2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButSean1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButSean, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butcal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butsh, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(ButSeDec, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(butsh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butcal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButSean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButSean1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButSean2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(ButSeDec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
                        .addGap(251, 251, 251))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
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

    private void ButSeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSeanActionPerformed
        EntAjo ada=new EntAjo(e,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(ada);
        ada.show();
            }//GEN-LAST:event_ButSeanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void butshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butshActionPerformed
        EntAff adb=new EntAff(e,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adb);
        adb.show();
        
    }//GEN-LAST:event_butshActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void butcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcalActionPerformed
        CalAff adc=new CalAff(e,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_butcalActionPerformed

    private void ButSeDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSeDecActionPerformed
    JOptionPane.showMessageDialog(null,"Au revoir !!");
    login ee =new login ();
    ee.setLocationRelativeTo(null);
    this.dispose();
    ee.setVisible(true);
    }//GEN-LAST:event_ButSeDecActionPerformed

    private void ButSean1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSean1ActionPerformed
        CalMsa ams=new CalMsa(e,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(ams);
        ams.show();
    }//GEN-LAST:event_ButSean1ActionPerformed

    private void ButSean2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSean2ActionPerformed
        CalMod ams=new CalMod(e,con);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(ams);
        ams.show();    }//GEN-LAST:event_ButSean2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButSeDec;
    private javax.swing.JButton ButSean;
    private javax.swing.JButton ButSean1;
    private javax.swing.JButton ButSean2;
    private javax.swing.JButton butcal;
    private javax.swing.JButton butsh;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

 
}
