/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;
import java.awt.Color;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dell
 */
public class available_veh extends javax.swing.JFrame {
Connection con=null;
int count=0;
int idd;
String namee;
    /**
     * Creates new form available_veh
     */
    public available_veh() {
        initComponents();
        DefaultTableModel model=(DefaultTableModel)abc.getModel();
        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
            String query="select * from veh_details where Veh_status ='Working Not Issued' ;";
            JOptionPane.showMessageDialog(null, "Final Query :"+query);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            int a=0;
            while(rs.next())
            {
                a++;
                model.addRow(new Object[]{rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            if(a==0)
            JOptionPane.showMessageDialog(null, "No record found");
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public available_veh(int id,String name) {
        initComponents();
        
        idd=id;
        namee=name;
        DefaultTableModel model=(DefaultTableModel)abc.getModel();
        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
            String query="select * from veh_details where Veh_status ='Working Not Issued' ;";
            JOptionPane.showMessageDialog(null, "Final Query :"+query);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            int a=0;
            while(rs.next())
            {
                a++;
                model.addRow(new Object[]{rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            if(a==0)
            JOptionPane.showMessageDialog(null, "No record found");
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public available_veh(int c) {
        initComponents();
        count =c;
        DefaultTableModel model=(DefaultTableModel)abc.getModel();
        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
            String query="select * from veh_details where Veh_status ='Working Not Issued' ;";
            JOptionPane.showMessageDialog(null, "Final Query :"+query);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            int a=0;
            while(rs.next())
            {
                a++;
                model.addRow(new Object[]{rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            if(a==0)
            JOptionPane.showMessageDialog(null, "No record found");
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        abc = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        abc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        abc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Company", "Veicle Model", "Vehicle Status", "Seating Capacity", "Price Per day"
            }
        ));
        jScrollPane1.setViewportView(abc);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Vehicles Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(count==0)
        {
            main_page obj=new main_page(idd,namee);
            obj.setVisible(true);
            this.setVisible(false);
        }
        else if(count==4)
        {
            admin_main_menu obj=new admin_main_menu();
            obj.setVisible(true);
            this.setVisible(false);
                    
        }
        else if(count==6)
        {
            staff_main_page obj=new staff_main_page();
            obj.setVisible(true);
            this.setVisible(false);
                    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(available_veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(available_veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(available_veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(available_veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new available_veh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
