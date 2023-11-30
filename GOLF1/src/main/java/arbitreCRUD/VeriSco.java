
package arbitreCRUD;

import Classes.arbitre;
import Classes.competition;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VeriSco extends javax.swing.JInternalFrame {
        
    private Connection con;
    private arbitre a;
    private competition c;
    
    public VeriSco() {
        initComponents();
    }
    
    public VeriSco(arbitre a,Connection con) {
        this.con=con;
        this.a=a;
        c=donner_comp();
        initComponents();
        remplir_tab();
        String getValue=jLabel1.getText();
        jLabel1.setText(getValue+c.getNom());
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
        private competition donner_comp()
    {
        String sql="select id_compt,nom_compt,nom_type,date_compt from competition join type_compt on (competition.id_type=type_compt.id_type) where id_arbitre='"+a.getId()+"' and date_compt=Curdate()";
        ResultSet rs=executercmd(sql);
        try 
        {   
            rs.next();            
            int id=rs.getInt(1);
            String nom=rs.getString(2);
            String type=rs.getString(3);
            Date date=rs.getDate(4);
            return(new competition(id,nom,type,date));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Attention! erreur dans la base de Données"+ex); 
            return(null);
        }
                
    }
    private void  remplir_tab()
        {   
            DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)            
            String sql=("Select id_joueur,pts from score where id_compt='"+c.getId()+"' and verifié=FALSE");
            ResultSet rs=executercmd(sql);
            try
            {
                while (rs.next())
                {
                    String Id_joueur=rs.getString(1);
                    String PTS=Integer.toString(rs.getInt(2));
                    String data[]={Id_joueur,PTS};
                    tb1model.addRow(data);
                }
                rs.close();
            }
            catch(SQLException e)
            {
            JOptionPane.showMessageDialog(null, "Desole Il ya une erreur dans l'affichage retourner Ultérieurement! \n"+e);
            }
            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        OUI = new javax.swing.JButton();
        NON = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Verification et Décision Finale");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Joueur", "PTS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Compétition: ");

        OUI.setText("OUI");
        OUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OUIActionPerformed(evt);
            }
        });

        NON.setText("NON");
        NON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NONActionPerformed(evt);
            }
        });

        jLabel2.setText("Veuiller s'il vous plait choisir un score a accepter :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(OUI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NON, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OUI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NON, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OUIActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount()!=0)
        {
            int row = jTable1.getSelectedRow();
            if (row !=-1)
            {
                String IDJ = jTable1.getModel().getValueAt(row, 0).toString();
                String sql=("update score set verifié=TRUE where id_joueur='"+IDJ+"' and id_compt='"+c.getId()+"'");
                try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Score Accepté");
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Veuillez selectionner une ligne");
        }
            else 
                JOptionPane.showMessageDialog(null,"Il n'y a pas de scores");

           
    }//GEN-LAST:event_OUIActionPerformed

    private void NONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NONActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount()!=0)
        {
            int row = jTable1.getSelectedRow();
            if (row !=-1)
            {
                String IDJ = jTable1.getModel().getValueAt(row, 0).toString();
                String sql=("update score set verifié = null , pts='0' where id_joueur='"+IDJ+"' and id_compt='"+c.getId()+"'");
                try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Score Non accepté");
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Veuillez selectionner une ligne");
        }
            else 
                JOptionPane.showMessageDialog(null,"Il n'y a pas de scores");

      
    }//GEN-LAST:event_NONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NON;
    private javax.swing.JButton OUI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
