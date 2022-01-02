
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class CustomerDetailsBill extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetailsBill
     */
    public CustomerDetailsBill() {
        initComponents();
        //call simpledateformat class create date object for SimpleDtaeFormat to display date in table
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy/MM/dd");
        //call Calendar class create  object for calender to display date in table
        Calendar cal=Calendar.getInstance();
        //setting calender in textfield1
        jTextField1.setText(myformat.format(cal.getTime()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Details Bill.png"))); // NOI18N
        jLabel1.setText("Customer Details Bill");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 13, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search By CHECK OUT DATE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 87, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 84, 198, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 83, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check IN Dtae", "Room No", "Bed", "Room Type", "Price Per Day", "Days Stayed", "Total Amount", "Check OUT Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Mobile");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Nationality");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Gender");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Email");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("ID Proof");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Address");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Check IN Dtae");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Room No");
            jTable1.getColumnModel().getColumn(10).setHeaderValue("Bed");
            jTable1.getColumnModel().getColumn(11).setHeaderValue("Room Type");
            jTable1.getColumnModel().getColumn(12).setHeaderValue("Price Per Day");
            jTable1.getColumnModel().getColumn(13).setHeaderValue("Days Stayed");
            jTable1.getColumnModel().getColumn(14).setHeaderValue("Total Amount");
            jTable1.getColumnModel().getColumn(15).setHeaderValue("Check OUT Date");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 1240, 360));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("*CLICK ON TABLE ROW TO OPEN BILL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //exit button from Customer Detail Bill form
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //When Search By CHECKOUT DATE given by user  and Search button is pressed from CustomerDetailsBill then CHECKOUT DATE comehere
        //showing data ontable by checkout date when search
       String checkOutDate=jTextField1.getText();
       
          String Query;
        Query="Select * from customer where checkOut ='"+checkOutDate+"' ";
        ResultSet rs=SelectForLogin.getData(Query);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        //removing previous record from table that is jframe component
        model.setRowCount(0);
        
        //adding record for search date
        try
        {
          while(rs.next())
          {
          model.addRow(new Object[] 
          {rs.getString(1) ,
              rs.getString(2),
              rs.getString(3),
               rs.getString(4),
                rs.getString(5),
                 rs.getString(6),
                  rs.getString(7),
                   rs.getString(8),
                    rs.getString(9),
                     rs.getString(10),
                      rs.getString(11),
                       rs.getString(12),
                        rs.getString(13),
                         rs.getString(14),
                          rs.getString(15),
                           rs.getString(16)
          });
          }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // win->nav->eight cklick on jform->event->components->show components
        //showing all data ontable whose out null
        String Query;
        Query="Select * from customer where checkOut is not NULL";
        ResultSet rs=SelectForLogin.getData(Query);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        try
        {
          while(rs.next())
          {
          model.addRow(new Object[] 
          {rs.getString(1) ,
              rs.getString(2),
              rs.getString(3),
               rs.getString(4),
                rs.getString(5),
                 rs.getString(6),
                  rs.getString(7),
                   rs.getString(8),
                    rs.getString(9),
                     rs.getString(10),
                      rs.getString(11),
                       rs.getString(12),
                        rs.getString(13),
                         rs.getString(14),
                          rs.getString(15),
                           rs.getString(16)
          });
          }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // event->mose->mouse clicked event
        int index =jTable1.getSelectedRow();//getting selected row index value
        TableModel model=jTable1.getModel();//getting omdel object for jtable1
        String id=model.getValueAt(index, 0).toString();//getting value at row and column 0,and converting value to string
        try
        {
         int a=JOptionPane.showConfirmDialog(null, "Do you want To Print Bill?","Select",JOptionPane.YES_NO_OPTION);
            while(a==0)
         {
         if((new File("D:\\"+id+".pdf")).exists())
         {
           Process p= Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:\\"+id+".pdf ");
         }
         
         else
         {
         JOptionPane.showMessageDialog(null, "File doesnot exists!");
         }
              }
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
