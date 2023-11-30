
package adminCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class modifier extends javax.swing.JInternalFrame {
    private Connection con;
    public modifier() {
        initComponents();
    }

  
    public modifier(Connection con){
        this.con=con;
        initComponents();

  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nouveauabnmt = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        id_ent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modifier membre");

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Modifier ");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setText("Joueur dont l'ID: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("Entraineur dont l'ID: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setText("Arbitre dont l'ID: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setText("*Abonnement : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("*ID entraineur : ");

        nouveauabnmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauabnmtActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_entActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("*Salaire : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel9.setText("*Grade : ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel10.setText("*Salaire : ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nouveauabnmt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(id_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addGap(78, 78, 78)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTextField4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(12, 12, 12)))))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nouveauabnmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(id_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(58, 58, 58))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void nouveauabnmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauabnmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nouveauabnmtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String id=id_ent.getText();
       String sal=jTextField1.getText();
       String query=("select id_entraineur from entraineur where id_entraineur='"+id+"'");
       if(id.equals("")){
           JOptionPane.showMessageDialog(null,"Veuillez remplir l'ID entraineur!!");
       }
       else{
           if(sal.equals("")){
               JOptionPane.showMessageDialog(null,"Veuillez remplir le nouveau salaire!!");
           }
           else{
               if(!check_existence(con,query)){
            JOptionPane.showMessageDialog(null,"ID joueur inexistent!!");
                }
               else{
                   String query2="update entraineur set salaire=? where id_entraineur=?";
                   modify_column(con,query2,sal,id);
                   JOptionPane.showMessageDialog(null,"salaire de l'entraineur dont l'ID="+id+"est modifié avec succées!!");
               }
           }
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_entActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_entActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=jTextField3.getText();
        String sal=jTextField5.getText();
        String grade=jTextField4.getText();
        String query=("select id_arbitre from arbitre where id_arbitre='"+id+"'");
         if(id.equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez remplir l'ID arbitre!!");
        }
         else{
             if(sal.equals("") && grade.equals("")){
                JOptionPane.showMessageDialog(null,"veuillez remplir le champs que vous voulez!!");

             }
             else{
                  if(!check_existence(con,query)){
                    JOptionPane.showMessageDialog(null,"ID arbitre inexistent!!");
                  }
                  else{
                      if(!sal.equals("")){
                        String query1="update arbitre set salaire=? where id_arbitre=?";
               
                        modify_column(con,query1,sal,id);
                        JOptionPane.showMessageDialog(null,"salaire de l'arbitre dont l'ID="+id+"est modifié avec succées!!");
                      }
                      if(!grade.equals("")){
                        String query2="update arbitre set gradee=? where id_arbitre=?";
               
                        modify_column(con,query2,grade,id);
                        JOptionPane.showMessageDialog(null,"grade de l'arbitre dont l'ID="+id+"est modifié avec succées!!");
                      }
                  }
             }
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed
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
         public void modify_column(Connection con, String query,String s, String id){
             try{
                 
            
             PreparedStatement preparedStatement = con.prepareStatement(query);
             preparedStatement.setString(1, s);
             preparedStatement.setString(2, id); 
             preparedStatement.executeUpdate();
                     }
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null,"Erreur d'insertion de données!!");
             }
         }
         
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id=ID.getText();
        String id_entraineur=jTextField2.getText();
        String abon=nouveauabnmt.getText();
        String query=("select id_joueur from joueur where id_joueur='"+id+"'");
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez remplir l'ID joueur!!");
        }
        else{
            if(id_entraineur.equals("") && abon.equals("")){
                JOptionPane.showMessageDialog(null,"veuillez remplir le champs que vous voulez!!");
            }
            else{
        if(!check_existence(con,query)){
            JOptionPane.showMessageDialog(null,"ID joueur inexistent!!");
        }
        else{
            if(!abon.equals("")){
                    String query3="update joueur set abonement=? where id_joueur=?";
               
                    modify_column(con,query3,abon,id);
                    JOptionPane.showMessageDialog(null,"l'abonement de joueur dont l'ID="+id+"est modifié avec succées!!");
                }
           String query1=("select id_entraineur from entraineur where id_entraineur='"+id_entraineur+"'");
            if(!id_entraineur.equals(""))
            
            
                if(!check_existence(con,query1)){
                    
                    JOptionPane.showMessageDialog(null,"ID entraineur inexistent!!");
                }
                    else{
                    
                    String query2="update joueur set id_entraineur=? where id_joueur=?";
                     modify_column(con,query2,id_entraineur,id);
                     JOptionPane.showMessageDialog(null,"l'entraineur de joueur dont l'ID="+id+"est modifié avec succées!!");
                    }
                
               
                
            
            
        }
    }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField id_ent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nouveauabnmt;
    // End of variables declaration//GEN-END:variables
}
