
package entraineurCrud;

import Classes.entraineur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;


public class EntAjo extends javax.swing.JInternalFrame {
    private Date dateauj = java.sql.Date.valueOf(LocalDate.now()); 
    private entraineur e;
    private Connection con;
    public EntAjo() {
        initComponents();
    }
    public EntAjo(entraineur e,Connection con) {
        this.e=e;
        this.con=con;
        initComponents();
    }  

   
    
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
       
    boolean check_joueur(String id)
    {   
        String sql;
        sql=("SELECT * FROM JOUEUR WHERE id_entraineur='"+e.getId()+"' and id_joueur='"+id+"'");
        ResultSet rs=executercmd(sql);
        try{
            return(rs.next());
        }
        catch(SQLException ex){
            return(false);
        }
    }
    
    boolean check_date_dispo(String date)
    {
        String sql;
        sql=("SELECT * FROM seance_e WHERE id_entraineur='"+e.getId()+"' and date_seance='"+date+"'");
        ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
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
    boolean check_joueur_dispo(String date,String id_joueur)
    {
        String sql;
        sql=("SELECT * FROM score join competition on score.id_compt=competition.id_compt WHERE id_joueur='"+id_joueur+"' and "
                + "date_compt='"+date+"'");
        ResultSet rs=executercmd(sql);
        try{
            return(!rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Probleme base de Données");
            return(false);
            
        }        
                    
    }
    
    private int generer_id() throws SQLException
    {   
        int i=0;
        String sql=("select max(id_seance) from seance_e");
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ajouter une séance");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ajouter une Séance");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID joueur");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 min", "30 min", "45 min", "1 h", "1 h et 15 min", "1 h et 30 min", "1 h et 45 min", "2 h" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Durée_séance");

        jLabel5.setText("Date_séance");

        jDateChooser1.setDate(dateauj);
        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Terrain");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "terrain principale", "terrain secondaire", "terrain rough 1", "terrain rough 2", "terrrain fairway", "terrain parkland 1", "terrain parkland 2", "terrain parkland 3", "terrain entrainement 1", "terrain entrainement 2" }));
        jComboBox2.setSelectedIndex(8);

        jButton1.setText("Ajouter une Séance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(233, 233, 233)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(258, 258, 258)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id_joueur=jTextField1.getText();
        int hours=(15+15*jComboBox1.getSelectedIndex())%60;
        int mins=(15+15*jComboBox1.getSelectedIndex())-60*hours;
        Time temps=new Time(hours,mins,0);
        
        
        
        Date datee;
        datee=jDateChooser1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(datee);   
        
        
        
        
        int id_terrain=150+jComboBox2.getSelectedIndex();
        if (date==null)
                JOptionPane.showMessageDialog(null,"Veuiller choisr une date");

        else 
        {
            if (id_joueur.equals(""))
                JOptionPane.showMessageDialog(null,"Veuiller donner le joueur");
            else 
            {
                LocalDate dateObj = LocalDate.now();
                Date aujourdhui ;
                aujourdhui=java.sql.Date.valueOf(dateObj);
                if (!datee.after(aujourdhui))
                        JOptionPane.showMessageDialog(null,"Cette date "+date+" est invalide !! "
                                + "Veuillez choisir une date supereieure a "+aujourdhui);
                else
                {
                    if (check_joueur(id_joueur)==false)
                            JOptionPane.showMessageDialog(null,"Verifier le id du joueur");
                    else
                    {
                        if(check_date_dispo(date)==false)
                                JOptionPane.showMessageDialog(null,"Veuillez choisir une autre date"
                                        + " car vous avez une autre seance ce jour là");
                        else
                        {
                            if(!check_terrain_dispo_seance_e(date,id_terrain)||!check_terrain_dispo_compet(date,id_terrain))
                                        JOptionPane.showMessageDialog(null,"Le terrain n'est pas dispo");
                            else
                            {
                                if(!check_joueur_dispo(date,id_joueur))
                                {
                                    JOptionPane.showMessageDialog(null,"Désolé , Veuillez choisir une autre "
                                            + "date car le joueur que vous avez choisit a une competition ce jour là !");
                                }
                                else
                                {
                                    int id_seance;
                                    try {
                                        id_seance = generer_id();
                                    } catch (SQLException ex) {
                                        id_seance=0;
                                    }
                                    String sql =("INSERT INTO seance_e VALUES('"+id_seance+"','"+date+"','"+temps+"','"+id_joueur+"',"
                                            + "'"+id_terrain+"','"+e.getId()+"')");
                                    try{
                                        Statement stmt = con.createStatement();
                                        stmt.executeUpdate(sql);/// ResultSet rs= stmt.executeQwery();
                                        JOptionPane.showMessageDialog(null,"Données insérés avec succés !!");
                                    }
                                    catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null,"Données non insérés"+ex);
                                    }
                                }
                            }
                        }
                    }
                    
                }
                
                
            }
        }
            
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
