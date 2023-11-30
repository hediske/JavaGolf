
package arbitreCRUD;

import Classes.arbitre;
import Classes.competition;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ShowCl extends javax.swing.JInternalFrame {

    private Connection con;
    private arbitre a;
    private competition c;
    
    public ShowCl() {
        initComponents();
    }
    
    public ShowCl(arbitre a,Connection con) {
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
            while (tb1model.getRowCount()>0)///bech tfaregh el table
                {
                   tb1model.removeRow(0);
                }                 
            String sql=("Select id_joueur,pts from score where id_compt='"+c.getId()+"' and (verifié='1' or verifié is null) order by pts desc");
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
            sql=("Select id_joueur from score where id_compt='"+c.getId()+"' and verifié='0' ");
            rs=executercmd(sql);
            try
            {
                while (rs.next())
                {
                    String Id_joueur=rs.getString(1);
                    String data[]={Id_joueur,"0"};
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Classement Temporaire");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Joueur", "PTS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Compétition: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("CLASSEMENT");

        jButton1.setText("TOP 3");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
            DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)             
            int rowCount=jTable1.getRowCount();

            for (int i = rowCount - 1; i >= 3; i--) {
                    tb1model.removeRow(i);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
