
package entraineurCrud;

import Classes.entraineur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import com.toedter.calendar.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CalAff extends javax.swing.JInternalFrame {   
    private Date date = java.sql.Date.valueOf(LocalDate.now()); 
    private entraineur e;
    private Connection con;
    List<Date> totalDates = new ArrayList<>();


    public CalAff() {
        initComponents();
    }


    public CalAff(entraineur e,Connection con) {
        this.e=e;
        this.con=con;
        initComponents();
        remplir_tab();
        modifier_calendrier();
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
    sql = ("SELECT id_joueur,date_seance,nom_terrain from seance_e join terrain on seance_e.id_terrain=terrain.id_terrain"
            + " where seance_e.id_entraineur='"+e.getId()+"' and (date_seance >=CURDATE())");
    ResultSet rs = executercmd(sql);
    DefaultTableModel tb1model=(DefaultTableModel)jTable1.getModel();//taati modele lel table (default)
    try
    {
        while (rs.next())
            {
                String Id=rs.getString(1);
                String terrain=rs.getString(3);
                Date datee=rs.getDate(2);
                totalDates.add(datee);
                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = format1.format(datee);  
                String tbData[]={Id,date1,terrain};
                tb1model.addRow(tbData);                

            }    
        rs.close();
    }        
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erreur dans la base de donnees");
            System.out.print(ex);
    }
    }
  
    
    
    private void modifier_calendrier()
    {
        IDateEvaluator dateEvaluator = new IDateEvaluator() {
            @Override
            public boolean isSpecial(Date date) {

                return totalDates.contains(date);
            }

            @Override
            public Color getSpecialForegroundColor() {
                return null;
            }

            @Override
            public Color getSpecialBackroundColor() {
                return Color.YELLOW;
            }

            @Override
            public String getSpecialTooltip() {
                return null;
            }

            @Override
            public boolean isInvalid(Date date) {
                return false;
            }

            @Override
            public Color getInvalidForegroundColor() {
                return null;
            }

            @Override
            public Color getInvalidBackroundColor() {
                return null;
            }

            @Override
            public String getInvalidTooltip() {
                return null;
            }
        };

        // Add the DateEvaluator to the JCalendar's day chooser
        jCalendar1.getDayChooser().addDateEvaluator(dateEvaluator);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel1.setText("Mes Joueurs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Afficher mon Calendrier ");
        setPreferredSize(new java.awt.Dimension(760, 410));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jCalendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCalendar1.setDate(date);
        jCalendar1.setFont(new java.awt.Font("Redressed", 0, 12)); // NOI18N
        jCalendar1.setMinSelectableDate(date);
        jCalendar1.setWeekOfYearVisible(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Mon Calendrier");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date", "Terrain"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setBackground(java.awt.Color.yellow);
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Séance");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
