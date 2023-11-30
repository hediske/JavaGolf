
package entraineurCrud;

import Classes.entraineur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CalMod extends javax.swing.JInternalFrame {

    private entraineur e;
    private Connection con;

    public CalMod () {
        initComponents();
    }
    public CalMod(entraineur e,Connection con) {

        this.e=e;
        this.con=con;
        initComponents();
        remplir_tab();
    } 

    private ResultSet executercmd(String sql)
    {
        try{
            
            Statement stm=con.createStatement();
            return(stm.executeQuery(sql));
            
        }
        catch (SQLException ex) {
                System.out.println("Probleme dans la base de données 66"+ex);
                return(null);
        }
    }

    private void remplir_tab(){
    String sql;
    
    sql = ("SELECT id_seance,date_seance,duree_seance,id_joueur,nom_terrain from seance_e join terrain on seance_e.id_terrain=terrain.id_terrain where seance_e.id_entraineur='"+e.getId()+"' and (date_seance >=CURDATE())");
    ResultSet rs = executercmd(sql);
    DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
                    while (tb1model.getRowCount()>0)///bech tfaregh el table
                {
                   tb1model.removeRow(0);
                }
    try
    {
        while (rs.next())
            {
                String Id=rs.getString(1);               
                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                String date = format1.format(rs.getDate(2)); 
                String duree=rs.getString(3);                               
                String terrain=rs.getString(5);                
                String Joueur=rs.getString(4);
                String tbData[]={Id,date,duree,terrain,Joueur};
                tb1model.addRow(tbData);                
            }    
        rs.close();
    }        
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erreur dans la base de donnees");
            System.out.print(ex);
    }
    }

 
            


    boolean check_date_dispo(String date,String id)
    {
        String sql;
        sql=("SELECT * FROM seance_e WHERE id_entraineur='"+e.getId()+"' and date_seance='"+date+"' and id_seance !='"+id+"'");
        ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données 11");
            return(false);
            
        }
    }
    boolean check_terrain_dispo_seance_e(String date,int id_terrain)
    {
        String sql;
            sql=("SELECT * FROM seance_e WHERE id_terrain='"+id_terrain+"' and date_seance='"+date+"'");
            ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données 22");
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
            JOptionPane.showMessageDialog(null,"Probleme base de Données 33");
            return(false);
            
        }        
            
    }   
    boolean check_joueur_dispo(String date,String id_joueur)
    {
        String sql;
        sql=("SELECT * FROM score join competition on score.id_compt=competition.id_compt WHERE id_joueur='"+id_joueur+"' and date_compt='"+date+"'");
        ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données 44");
            return(false);
            
        }        
                    
    }
    int trouver_id(String tr)
    {
        String sql;
        sql=("SELECT id_terrain FROM terrain WHERE nom_terrain='"+tr+"'");
        ResultSet rs=executercmd(sql);
        try{
            rs.next();
            return(rs.getInt(1));
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données 55"+ex);
            return(0);
            
        }        
                    
    }







    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modification");
        setPreferredSize(new java.awt.Dimension(730, 413));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seance", "Date", "Durée", "Terrain", "Joueur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = jTable1.getSelectedRow();
                    if (selectedRow != -1) {

                        jPanel1.setVisible(true);                    }
                }
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modification");

        jLabel2.setText("Nouvelle date :");

        jLabel3.setText("Nouvel terrain :");

        jButton1.setText("Confirmer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Rien Séléctioné-", "terrain principale", "terrain secondaire", "terrain rough 1", "terrain rough 2", "terrrain fairway", "terrain parkland 1", "terrain parkland 2", "terrain parkland 3", "terrain entrainement 1", "terrain entrainement 2", " " }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel1.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int row = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(row, 0).toString();
        String date_s = jTable1.getModel().getValueAt(row, 1).toString();
        int terrain_s = trouver_id(jTable1.getModel().getValueAt(row, 3).toString());
        String id_joueur=jTable1.getModel().getValueAt(row, 4).toString();
        
        
        Date datee;
        datee=jDateChooser1.getDate();
        String date ;
        date=date_s;
        if (datee!=null)
        {    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             date = sdf.format(datee);
        }
        
        
        int id_terr=149+jComboBox2.getSelectedIndex();

        if (datee==null && jComboBox2.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(null,"Rien a modifier!");
        else 
        {   
             if (id_terr==149)
                 id_terr=terrain_s;
             if (datee==null)                 
                 date=date_s;
             
             if(check_date_dispo(date,id)==false)
                JOptionPane.showMessageDialog(null,"Veuillez choisir une autre date "
                        + "car vous avez une autre seance ce jour là");
             else
             {
                 if(!check_terrain_dispo_seance_e(date,id_terr)||!check_terrain_dispo_compet(date,id_terr))
                       JOptionPane.showMessageDialog(null,"Le terrain n'est pas dispo");
                 else
                 {
                      if(!check_joueur_dispo(date,id_joueur))
                      {
                        JOptionPane.showMessageDialog(null,"Désolé , Veuillez choisir"
                                + " une autre date car le joueur que vous avez choisit a une competition ce jour là !");
                      } 
                      else
                      {
                            String sql=("update seance_e set date_seance='"+date+"',id_terrain='"+id_terr+"'where "
                                    + "id_seance='"+id+"'") ;
                                    try{
                                        Statement stmt = con.createStatement();
                                        stmt.executeUpdate(sql);/// ResultSet rs= stmt.executeQwery();
                                        
                                        JOptionPane.showMessageDialog(null,"Données modifiéss avec succés !!");
                                        remplir_tab();
                                        jPanel1.setVisible(false);
                                    }
                            catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null,"Données non modifiées "+ex);
                                    }   
                          
                      }
                     
                 }
                 }     
        }             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jDateChooser1.setDate(null);
    jComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}


