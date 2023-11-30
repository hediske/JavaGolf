
package entraineurCrud;

import Classes.entraineur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CalMsa extends javax.swing.JInternalFrame {

    private entraineur e;
    private Connection con;


    public CalMsa() {
        initComponents();
    }
    public CalMsa(entraineur e,Connection con) {
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
                System.out.println("Probleme dans la base de données"+ex);
                return(null);
        }
    }

    private void remplir_tab(){
    String sql;
    sql = ("SELECT id_seance,date_seance,duree_seance,id_joueur,nom_terrain from "
            + "seance_e join terrain on seance_e.id_terrain=terrain.id_terrain where "
            + "seance_e.id_entraineur='"+e.getId()+"' and (date_seance >=CURDATE())");
    ResultSet rs = executercmd(sql);
    DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Suppression");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Suppression");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seance", "Date", "Durée", "Terrain", "Joueur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Veuiller Séléctionner une ligne ! ");

        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount()!=0)
        {
            int row = jTable1.getSelectedRow();
            if (row !=-1)
            {
                String eve = jTable1.getModel().getValueAt(row, 0).toString();
                String sql=("Delete from seance_e where id_seance='"+eve+"'");
                try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Séance supprimé avec succées");
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Veuillez selectionner une ligne");
        }
            else 
                JOptionPane.showMessageDialog(null,"Il n'y a pas de seance");

          }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
