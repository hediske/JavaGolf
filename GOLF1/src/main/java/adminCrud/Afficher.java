/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package adminCrud;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Admin
 */
public class Afficher extends javax.swing.JInternalFrame {

    private Connection con;
 
    public Afficher() {
        initComponents();
    }

  
        public Afficher(Connection con) {
        this.con=con;
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(150, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel1.setText("Afficher");

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton1.setText("Les joueurs");
        jButton1.setMinimumSize(new java.awt.Dimension(150, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton2.setText("Les entraineurs");
        jButton2.setMinimumSize(new java.awt.Dimension(150, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton3.setText("Les arbitres");
        jButton3.setMinimumSize(new java.awt.Dimension(150, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton5.setText("Les compétitions");
        jButton5.setMinimumSize(new java.awt.Dimension(150, 100));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

          try
            {
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String st = ("SELECT * FROM joueur");
                ResultSet rs = stmt.executeQuery(st);
                DefaultTableModel tableModel = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
                
            
            }
            
            JTable table = new JTable(tableModel);
           
            String title= "Liste des joueurs";
            JScrollPane tableSP = new JScrollPane(table);
            table.setRowHeight(30);
	    table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
 
            for (int column = 0; column < table.getColumnCount(); column++)
            {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++)
                {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    //  We've exceeded the maximum width, no need to check other rows

                    if (preferredWidth >= maxWidth)
                    {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth( preferredWidth );
            }

                 //table.getColumn(1).setPreferredWidth(10);
                 
                
           
            // Create a JTable and display the data
           
            JOptionPane.showMessageDialog(null, tableSP, "Database Results", JOptionPane.PLAIN_MESSAGE);

            // Close the connection and resources
            rs.close();
            stmt.close();
            
            
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Probleme dans la base de données");
            }
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try
            {
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String st = ("SELECT * FROM competition");
                ResultSet rs = stmt.executeQuery(st);
                DefaultTableModel tableModel = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
                
           
            }
               
                String title= "Liste des compétitions";
            // Create a JTable and display the data
            JTable table = new JTable(tableModel);
            table.setRowHeight(30);
            table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
 
            for (int column = 0; column < table.getColumnCount(); column++)
            {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++)
                {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    //  We've exceeded the maximum width, no need to check other rows

                    if (preferredWidth >= maxWidth)
                    {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth( preferredWidth );
            }
	   
            JOptionPane.showMessageDialog(null, new JScrollPane(table), "Database Results", JOptionPane.PLAIN_MESSAGE);
             
            // Close the connection and resources
            rs.close();
            stmt.close();
           
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Probleme dans la base de données");
            }
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
            {
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String st = ("SELECT * FROM entraineur");
                ResultSet rs = stmt.executeQuery(st);
                DefaultTableModel tableModel = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
                
           
            }
               
                String title= "Liste des entraineurs";
            // Create a JTable and display the data
            JTable table = new JTable(tableModel);
            //table.setRowHeight(30);
           // table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
             table.setRowHeight(30);
	    table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
            for (int column = 0; column < table.getColumnCount(); column++)
            {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++)
                {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    //  We've exceeded the maximum width, no need to check other rows

                    if (preferredWidth >= maxWidth)
                    {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth( preferredWidth );
            }
	   
            JOptionPane.showMessageDialog(null, new JScrollPane(table), "Database Results", JOptionPane.PLAIN_MESSAGE);
             
            // Close the connection and resources
            rs.close();
            stmt.close();
            
            
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Probleme dans la base de données");
            }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try
            {
             try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)) {
                 String st = ("SELECT * FROM arbitre");
                 ResultSet rs = stmt.executeQuery(st);
                 DefaultTableModel tableModel = new DefaultTableModel();
                 ResultSetMetaData metaData = rs.getMetaData();
                 int columnCount = metaData.getColumnCount();
                 for (int i = 1; i <= columnCount; i++) {
                     tableModel.addColumn(metaData.getColumnName(i));
                 }
                 while (rs.next()) {
                     Object[] row = new Object[columnCount];
                     for (int i = 1; i <= columnCount; i++) {
                         row[i - 1] = rs.getObject(i);
                     }
                     tableModel.addRow(row);
                     
                     
                 }
                 
                 String title= "Liste des arbitres";
                 // Create a JTable and display the data
                 JTable table = new JTable(tableModel);
                 table.setRowHeight(30);
                 table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
                 
                 for (int column = 0; column < table.getColumnCount(); column++)
                 {
                     TableColumn tableColumn = table.getColumnModel().getColumn(column);
                     int preferredWidth = tableColumn.getMinWidth();
                     int maxWidth = tableColumn.getMaxWidth();
                     
                     for (int row = 0; row < table.getRowCount(); row++)
                     {
                         TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                         Component c = table.prepareRenderer(cellRenderer, row, column);
                         int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                         preferredWidth = Math.max(preferredWidth, width);
                         
                         //  We've exceeded the maximum width, no need to check other rows
                         
                         if (preferredWidth >= maxWidth)
                         {
                             preferredWidth = maxWidth;
                             break;
                         }
                     }
                     
                     tableColumn.setPreferredWidth( preferredWidth );
                 }
                 
                 JOptionPane.showMessageDialog(null, new JScrollPane(table), "Database Results", JOptionPane.PLAIN_MESSAGE);
                 
                 // Close the connection and resources
                 rs.close();
             }
        
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Probleme dans la base de données"+ex);
            }
            
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
