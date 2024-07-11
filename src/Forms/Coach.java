/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import entity.coach_entity;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.main;
import sqlConnection.SQLcon;
import swing.ScrollBar;

/**
 *
 * @author MOHAMED
 */
public class Coach extends javax.swing.JPanel {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean status=false;

    /**
     * Creates new form Coach
     */
    public Coach() {
        initComponents();
        conn = SQLcon.connecrb();
//        populate_table();
     show_coach_entity();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gradientPanel1 = new componant.GradientPanel();
        jTextField_coach_id = new javax.swing.JTextField();
        jTextField_coach_name = new javax.swing.JTextField();
        jTextField_club_id = new javax.swing.JTextField();
        jTextField_age = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addlabel1 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Coach_name_label = new javax.swing.JLabel();
        club_id_label = new javax.swing.JLabel();
        Coach_id_label = new javax.swing.JLabel();
        Coach_age_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "coach_id", "club_id", "age", "coach_name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gradientPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField_coach_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_coach_nameActionPerformed(evt);
            }
        });

        jTextField_club_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_club_idActionPerformed(evt);
            }
        });

        jTextField_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ageActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3.png"))); // NOI18N
        jLabel1.setText("Coach Information");

        addlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-48.png"))); // NOI18N
        addlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabel1MouseClicked(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-available-updates-50.png"))); // NOI18N
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-48.png"))); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Coach_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Coach_name_label.setForeground(new java.awt.Color(255, 255, 255));
        Coach_name_label.setText("Coach Name");

        club_id_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        club_id_label.setForeground(new java.awt.Color(255, 255, 255));
        club_id_label.setText("Club ID");

        Coach_id_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Coach_id_label.setForeground(new java.awt.Color(255, 255, 255));
        Coach_id_label.setText("Coach ID");

        Coach_age_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Coach_age_label.setForeground(new java.awt.Color(255, 255, 255));
        Coach_age_label.setText("Age");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Coach_name_label)
                            .addComponent(Coach_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_coach_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                                .addComponent(Coach_age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                                .addComponent(club_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_club_id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)))
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(addlabel1)
                    .addComponent(Delete))
                .addGap(17, 17, 17))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Coach_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_club_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(club_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_coach_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coach_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coach_age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        String click = jTable1.getModel().getValueAt(r, 0).toString();
        int id = Integer.parseInt(click);
        String sqlquery = "Select * from coach where coach_id=" + id;
        try {
            pst = conn.prepareStatement(sqlquery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String coach_id = rs.getString(1);
                jTextField_coach_id.setText(coach_id);

                String club_id = rs.getString(2);
                jTextField_club_id.setText(club_id);

                String age = rs.getString(3);
                jTextField_age.setText(age);

                String coach_name = rs.getString(4);
                jTextField_coach_name.setText(coach_name);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ageActionPerformed

    private void jTextField_club_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_club_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_club_idActionPerformed

    private void jTextField_coach_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_coach_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_coach_nameActionPerformed

    private void addlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addlabel1MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
          String coach_id_text = jTextField_coach_id.getText();
        int coach_id = Integer.parseInt(coach_id_text);

        String club_id_text = jTextField_club_id.getText();
        int club_id = Integer.parseInt(club_id_text);

        String age_text = jTextField_age.getText();
        int age = Integer.parseInt(age_text);

        String coach_name = jTextField_coach_name.getText();
        String sqlquery = "Update coach SET coach_id=?,club_id=?,age=?,coach_name=? where coach_id='" + coach_id_text + "'";         // TODO add your handling code here:
        try {
            pst = conn.prepareStatement(sqlquery);
            pst.setInt(1, coach_id);
            pst.setInt(2, club_id);
            pst.setInt(3, age);
            pst.setString(4, coach_name);      
            pst.executeUpdate();
            show_coach_entity();
            JOptionPane.showMessageDialog(null, "Record Update Successful");
            jTextField_coach_id.setText("");
            jTextField_club_id.setText("");
            jTextField_age.setText("");
            jTextField_coach_name.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
         try {

            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM coach where coach_id =" + value;
            PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_coach_entity();
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }              
    }//GEN-LAST:event_DeleteMouseClicked

    public ArrayList<coach_entity> coachlist() {
        ArrayList<coach_entity> coachlist = new ArrayList<>();
        String sqlquery = "select * from coach where club_id=1";
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sqlquery);
            coach_entity coach_entity;
            while (rs.next()) {
                coach_entity = new coach_entity(rs.getInt("coach_id"),rs.getInt("club_id"),rs.getInt("age"),rs.getString("coach_name"));
                coachlist.add(coach_entity);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return coachlist;
    }

    public void show_coach_entity() {
        ArrayList<coach_entity> list = coachlist();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCoach_id();
            row[1] = list.get(i).getClub_id();
            row[2] = list.get(i).getAge();
            row[3] = list.get(i).getCoach_name();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coach_age_label;
    private javax.swing.JLabel Coach_id_label;
    private javax.swing.JLabel Coach_name_label;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel addlabel1;
    private javax.swing.JLabel club_id_label;
    private componant.GradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_age;
    private javax.swing.JTextField jTextField_club_id;
    private javax.swing.JTextField jTextField_coach_id;
    private javax.swing.JTextField jTextField_coach_name;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
