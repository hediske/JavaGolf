
package entraineurCrud;
import java.time.*;
import java.util.*;
import Classes.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class EntAff extends javax.swing.JInternalFrame {

    private entraineur e;
    private Connection con;
    public EntAff() {
        initComponents();
    }
    public EntAff(entraineur e,Connection con) {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Afficher les joueurs");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Age", "Depuis"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setText("Mes Joueurs");

        jButton2.setText("Tous Mes Joueurs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mes  joueurs actuels");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mes anciens joueurs");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql;
        sql = ("SELECT j.id_joueur,nom_joueur,prenom_joueur,date_nai,date_seance from joueur j ,seance_e where j.id_joueur=seance_e.id_joueur and seance_e.id_entraineur='"+e.getId()+"' and date_seance=(SELECT min(date_seance) from seance_e where j.id_joueur=id_joueur and id_entraineur='"+e.getId()+"')");
        ResultSet rs = executercmd(sql);
        try{  
                DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
                while (tb1model.getRowCount()>0)///bech tfaregh el table
                {
                   tb1model.removeRow(0);
                }
        while (rs.next())
            {
                String Id=rs.getString(1);
                String nom=rs.getString(2);
                String prenom=rs.getString(3);
                Date date=rs.getDate(4);
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                String age =Integer.toString(-calendar.get(Calendar.YEAR)+Year.now().getValue());
                date=rs.getDate(5);
                calendar.setTime(date);
                String depuis=Integer.toString(calendar.get(Calendar.YEAR));
                String tbData[]={Id,nom,prenom,age,depuis};
                tb1model.addRow(tbData);                

            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur dans la base de donnees");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql;
        sql = ("SELECT j.id_joueur,nom_joueur,prenom_joueur,date_nai,date_seance from joueur j ,seance_e where j.id_joueur=seance_e.id_joueur and seance_e.id_entraineur='"+e.getId()+"'and j.id_entraineur='"+e.getId()+"' and date_seance=(SELECT min(date_seance) from seance_e where j.id_joueur=id_joueur and id_entraineur='"+e.getId()+"')");
        ResultSet rs = executercmd(sql);
        try{  
                DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
                while (tb1model.getRowCount()>0)///bech tfaregh el table
                {
                   tb1model.removeRow(0);
                }
        while (rs.next())
            {
                String Id=rs.getString(1);
                String nom=rs.getString(2);
                String prenom=rs.getString(3);
                Date date=rs.getDate(4);
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                String age =Integer.toString(-calendar.get(Calendar.YEAR)+Year.now().getValue());
                date=rs.getDate(5);
                calendar.setTime(date);
                String depuis=Integer.toString(calendar.get(Calendar.YEAR));
                String tbData[]={Id,nom,prenom,age,depuis};
                tb1model.addRow(tbData);                

            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur dans la base de donnees");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sql;
        sql = ("SELECT j.id_joueur,nom_joueur,prenom_joueur,date_nai,date_seance from joueur j ,seance_e where j.id_joueur=seance_e.id_joueur and seance_e.id_entraineur='"+e.getId()+"'and j.id_entraineur!='"+e.getId()+"' and date_seance=(SELECT min(date_seance) from seance_e where j.id_joueur=id_joueur and id_entraineur='"+e.getId()+"')");
        ResultSet rs = executercmd(sql);
        try{  
                DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
                while (tb1model.getRowCount()>0)///bech tfaregh el table
                {
                   tb1model.removeRow(0);
                }
        while (rs.next())
            {
                String Id=rs.getString(1);
                String nom=rs.getString(2);
                String prenom=rs.getString(3);
                Date date=rs.getDate(4);
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                String age =Integer.toString(-calendar.get(Calendar.YEAR)+Year.now().getValue());
                date=rs.getDate(5);
                calendar.setTime(date);
                String depuis=Integer.toString(calendar.get(Calendar.YEAR));
                String tbData[]={Id,nom,prenom,age,depuis};
                tb1model.addRow(tbData);                

            }
            jTable1.setModel(tb1model);

        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur dans la base de donnees");
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
