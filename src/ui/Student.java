
package ui;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import src.DB;
public class Student extends javax.swing.JInternalFrame {

    DefaultTableModel dtm;
    String _ID ="";
    public Student() {
        initComponents();
        dtm = (DefaultTableModel)tbl_student.getModel();
        loadData();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_barcode = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_class = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_birthday = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setTitle("Student Manage");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Personal information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Display", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        txt_name.setBackground(new java.awt.Color(0, 0, 0));
        txt_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Barcode");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Class");

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact");

        txt_address.setBackground(new java.awt.Color(0, 0, 0));
        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        txt_barcode.setBackground(new java.awt.Color(0, 0, 0));
        txt_barcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_barcode.setForeground(new java.awt.Color(255, 255, 255));

        txt_contact.setBackground(new java.awt.Color(0, 0, 0));
        txt_contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));

        txt_gender.setBackground(new java.awt.Color(0, 0, 0));
        txt_gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_gender.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jButton1.setText("Add New");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jButton2.setText("Update ");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");

        txt_class.setBackground(new java.awt.Color(0, 0, 0));
        txt_class.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_class.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Birthday");

        txt_birthday.setBackground(new java.awt.Color(0, 0, 0));
        txt_birthday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_birthday.setForeground(new java.awt.Color(255, 255, 255));
        txt_birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_birthdayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STUDENT INFORMATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Display", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        tbl_student.setBackground(new java.awt.Color(0, 51, 51));
        tbl_student.setForeground(new java.awt.Color(255, 255, 255));
        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "BARCODE", "CONTACT", "ADDRESS", "BIRTHDAY", "GENDER", "CLASS"
            }
        ));
        tbl_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_student);

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4550883_glass_loupe_magnifier_magnifying_search_icon.png"))); // NOI18N
        jLabel8.setText("Search :");

        txt_search.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
             DB.getConnection().createStatement().executeUpdate("insert into student(name,barcode,contact,address,birthday,gender,class) values ('"+txt_name.getText()+"','"+txt_barcode.getText()+"','"+txt_contact.getText()+"','"+txt_address.getText()+"','"+txt_birthday.getText()+"','"+txt_gender.getText()+"','"+txt_class.getText()+"')");
            JOptionPane.showMessageDialog(rootPane, "Data Saved Successfuly");
            loadData();
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_birthdayActionPerformed

    private void tbl_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentMouseClicked
        int selected_row = tbl_student.getSelectedRow();
        txt_name.setText(dtm.getValueAt(selected_row,1).toString());
        txt_barcode.setText(dtm.getValueAt(selected_row,2).toString());
        txt_contact.setText(dtm.getValueAt(selected_row,3).toString());
        txt_address.setText(dtm.getValueAt(selected_row,4).toString());
        txt_birthday.setText(dtm.getValueAt(selected_row,5).toString());
        txt_gender.setText(dtm.getValueAt(selected_row,6).toString());
        txt_class.setText(dtm.getValueAt(selected_row,7).toString());
        _ID = dtm.getValueAt(selected_row, 0).toString();
    }//GEN-LAST:event_tbl_studentMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to change student data");
            if (selection==0) {
                DB.getConnection().createStatement().executeUpdate("update student set name='"+txt_name.getText()+"',barcode='"+txt_barcode.getText()+"',contact='"+txt_contact.getText()+"',address='"+txt_address.getText()+"',birthday='"+txt_birthday.getText()+"',gender='"+txt_gender.getText()+"',class='"+txt_class.getText()+"' where id='"+_ID+"'");
            JOptionPane.showMessageDialog(rootPane, "Data update Successfuly");
            loadData();
                
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to delet student data");
            if (selection==0) {
                DB.getConnection().createStatement().executeUpdate("delete from student where id='"+_ID+"'");
            JOptionPane.showMessageDialog(rootPane, "Data Delete Successfuly");
            loadData();
                
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchString=txt_search.getText();
        search(searchString);
    }//GEN-LAST:event_txt_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_barcode;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JTextField txt_class;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
void loadData(){
    try {
        dtm.setRowCount(0);
        ResultSet rs = DB.getConnection().createStatement().executeQuery("select * from student");
        
        while (rs.next()) { 
            Vector v =new Vector();
            v.add(rs.getString("id"));
            v.add(rs.getString("name"));
            v.add(rs.getString("barcode"));
            v.add(rs.getString("contact"));
            v.add(rs.getString("address"));
            v.add(rs.getString("birthday"));
            v.add(rs.getString("gender"));
            v.add(rs.getString("class"));
            dtm.addRow(v);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void search(String str){
    dtm=(DefaultTableModel)tbl_student.getModel();
    TableRowSorter<DefaultTableModel> trs= new TableRowSorter<>(dtm);
    tbl_student.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
}
}
