
package adminCrud;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AjouterCompetition extends javax.swing.JInternalFrame {

    private Connection con;
    public AjouterCompetition() {
        initComponents();
    }
    public AjouterCompetition(Connection con) {
        this.con=con;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ajouter compétition");
        setToolTipText("");
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Ajouter Compétition ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Nom : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("ID Type :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Date : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("ID terrain : ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("ID arbitre : ");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private ResultSet executercmd(String sql)
    {
        try{
            
            Statement stm=con.createStatement();
            return(stm.executeQuery(sql));
            
        }
        catch (SQLException ex) {
                System.out.println("Probleme dans la base de données"+ex);
                return(null);
        }
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    boolean check_terrain_dispo_seance_e(String date,int id_terrain)
    {
        String sql;
            sql=("SELECT * FROM seance_e WHERE id_terrain='"+id_terrain+"' and date_seance='"+date+"'");
            ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
            return(false);
            
        }        
            
    }    
    boolean check_terrain_dispo_compet(String date,int id_terrain)
    {
        String sql;
            sql=("SELECT * FROM competition WHERE id_terrain='"+id_terrain+"' and date_compt='"+date+"'");
            ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
            return(false);
            
        }        
            
    }   
    boolean check_terrain_dispo_reser(String date,int id_terrain)
    {
        String sql;
            sql=("SELECT * FROM reservation WHERE id_terrain='"+id_terrain+"' and date_reser='"+date+"'");
            ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
            return(false);
            
        }        
            
    } 
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

      private int generer_id() throws SQLException
    {   
        int i=0;
        String sql=("select max(id_compt) from competition");
        ResultSet rs = executercmd(sql);
        try{
            while(rs.next())
                i=rs.getInt(1);
            return(i+1); 
        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
            return(0);////cas d'une table vide
        }
            
    }
      
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        //(id_compt,id_type,id_terrain,nom_compt,date_compt,id_arbitre) 
        int id=0;
        try {
            id =100+generer_id();
        } catch (SQLException ex) {
            Logger.getLogger(AjouterCompetition.class.getName()).log(Level.SEVERE, null, ex);
        }
        String type=jTextField4.getText();
        int terrain=Integer.parseInt(jTextField3.getText());
                
        String nom=jTextField2.getText();
        Date date=jDateChooser1.getDate();
        String arbitre=jTextField1.getText();
        java.sql.Date sqlDate1 = new java.sql.Date(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String datee = sdf.format(date);
        String sql="insert into competition (id_compt,id_type,id_terrain,nom_compt,date_compt,id_arbitre) values (?,?,?,?,?,?)";
        
        if(nom.equals(""))
            JOptionPane.showMessageDialog(null,"Veuillez remplir le nom !!!");
        
        else
        {
          
                            String query;
                            query = ("select id_type from type_compt where id_type='"+type+"'");
                            
            if(!check_existence(con,query))
                JOptionPane.showMessageDialog(null,"L'ID type saisi est invalide!!");
        
        
            else{
                
                 LocalDate dateObj = LocalDate.now();
                Date aujourdhui ;
                aujourdhui=java.sql.Date.valueOf(dateObj);
                if (!date.after(aujourdhui))
                        JOptionPane.showMessageDialog(null,"Cette date "+date+" est invalide !! Veuillez choisir une date supereieure a "+aujourdhui);
                else{
                   
                    if(!check_terrain_dispo_seance_e(datee,terrain)||!check_terrain_dispo_compet(datee,terrain)||!check_terrain_dispo_reser(datee,terrain))
                                        JOptionPane.showMessageDialog(null,"Le terrain n'est pas dispo");
                    else{
                
                    
                        String query1;
                            query1 = ("select id_terrain from terrain where id_terrain='"+terrain+"'");
                            if(!check_existence(con,query1)){
                                JOptionPane.showMessageDialog(null,"L'ID terrain saisi est invalide!!");
                            }
                            else{
                                String query3=("select id_arbitre from arbitre where id_arbitre='"+arbitre+"'");
                                if(!check_existence(con,query3))
                                    JOptionPane.showMessageDialog(null,"L'ID arbitre saisi est invalide!!");
                                else{
                                    String query2=("select id_compt from competition where id_compt='"+arbitre+"'");
                                    if(check_existence(con,query2))
                                        JOptionPane.showMessageDialog(null,"L'ID competirion est déjà existant!!!");
                                    else{
                                        try{
                                             
                                            PreparedStatement stmt=con.prepareStatement(sql);
                                            stmt.setInt(1, id);
                                            stmt.setString(2,type);
                                            stmt.setInt(3, terrain);
                                            stmt.setString(4, nom);
                                            stmt.setDate(5, sqlDate1);
                                            stmt.setString(6, arbitre);

                                            stmt.execute();
                                            JOptionPane.showMessageDialog(null,"Données insérés avec succés !!");
                                        }
                                        catch(HeadlessException | SQLException e){
                                            JOptionPane.showMessageDialog(null,"il y a une erreur en base de données !!");
                                        }
                                        
                                    }
                                }
                            }
                }
                    
                    
                    
        
           
                          
                }
        
        
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c= evt.getKeyChar();
        if (!Character.isDigit(c));
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
