/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package adminCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ajouterEntraineur extends javax.swing.JInternalFrame {

    private Connection con;
    
    public ajouterEntraineur (){
        initComponents();
    }
    public ajouterEntraineur (Connection con) {
        this.con=con;
               
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prenom = new javax.swing.JTextField();
        sexe = new javax.swing.JComboBox<>();
        ajoutjoueur = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        salaire = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        motdepasse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ajouter Entraineur");

        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "homme", "femme" }));

        ajoutjoueur.setText("Ajouter");
        ajoutjoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutjoueurActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Salaire : ");

        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cinKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinKeyTyped(evt);
            }
        });

        salaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaireActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Sexe:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Nom : ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Mot de passe :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Date de naissance: ");

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Prénom : ");

        motdepasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motdepasseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Email : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Cin : ");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setText("Ajouter Entraineur ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("ID : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(ajoutjoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel12)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(46, 46, 46)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(72, 72, 72)
                                .addComponent(salaire, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addComponent(ajoutjoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed
    public boolean check_existence(Connection con , String query){
                        
                            try{
                                
                            
                            Statement st=con.createStatement();
                            
                            ResultSet rs=st.executeQuery(query);
                            int value=0;
                            while(rs.next()){
                                value++;
                            }
                                return value >= 1;
                    }
                          catch(SQLException e){
                              JOptionPane.showMessageDialog(null,"error en bd!!");

                                  }
                        return false;
                    
                        
                   }
      public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
      }
    private void ajoutjoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutjoueurActionPerformed
        String id=ID.getText();
        String nomm=nom.getText();
        String cinn=cin.getText();
        String prenomm=prenom.getText();
        String saliree=salaire.getText();
         char sexee=((String) sexe.getSelectedItem()).charAt(0);
        String Email=email.getText();
        String mdp=motdepasse.getText();
        Date date=jDateChooser1.getDate();
        java.sql.Date sqlDate1 = new java.sql.Date(date.getTime());
        LocalDate dateObj = LocalDate.now();
        java.sql.Date date_insc = java.sql.Date.valueOf(dateObj);
        java.sql.Date sqlDate = new java.sql.Date(date_insc.getTime());
        String sql="insert into entraineur(id_entraineur,nom_entraineur,prenom_entraineur,mdp_entraineur,date_nai,email_entraineur,cin_entraineur,date_ins_entraineur,salaire,sexe) values (?,?,?,?,?,?,?,?,?,?)";
         if(nomm.equals("") | prenomm.equals("")  | saliree.equals("")  | date.toString().equals("") | date_insc.toString().equals("") ){
                JOptionPane.showMessageDialog(null,"Veuiller remplir tous les champs !!!");
            }
            else{
                if(id.equals("")){
                    JOptionPane.showMessageDialog(null,"Veuiller remplir l'ID !!!");
                }
                else{
                    if(mdp.equals("")){
                        JOptionPane.showMessageDialog(null,"Veuiller remplir le mot de passe !!!");
                    }
                    else{
                        String query = ("select id_entraineur from entraineur where id_entraineur='"+id+"'");
                        if(check_existence(con,query))
                            JOptionPane.showMessageDialog(null,"ID entraineur déjà existant !!!");
                        else {
                            if(!isValidEmailAddress(Email)){
                                JOptionPane.showMessageDialog(null,"Email invalide  !!!");
                            }
                            else{
                           try{
                                PreparedStatement stmt = con.prepareStatement(sql);



                                            stmt.setString(1, id);
                                            stmt.setString(2, nomm);
                                            stmt.setString(3,prenomm);
                                            stmt.setString(4,mdp);
                                            stmt.setDate(5,sqlDate1);
                                            stmt.setString(6,Email);
                                            stmt.setString(7,cinn);
                                            stmt.setDate(8,sqlDate);
                                            stmt.setString(9,saliree);
                                            stmt.setString(10,String.valueOf(sexee));
                                            stmt.execute(); 
                                            JOptionPane.showMessageDialog(null,"Entraineur inséré avec succés!!!");
                                       }
                           catch(SQLException e){
                               JOptionPane.showMessageDialog(null,"Erreur au niveau l'insertion  !!!"+e);
                           }
                        }
                        }
                        
                    }
                }
            }
        
    }//GEN-LAST:event_ajoutjoueurActionPerformed

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void salaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaireActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void motdepasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motdepasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motdepasseActionPerformed

    private void cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        if (!Character.isDigit(c));
        {
            evt.consume();
        }
    }//GEN-LAST:event_cinKeyTyped

    private void cinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cinKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton ajoutjoueur;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField email;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField motdepasse;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField salaire;
    private javax.swing.JComboBox<String> sexe;
    // End of variables declaration//GEN-END:variables
}

