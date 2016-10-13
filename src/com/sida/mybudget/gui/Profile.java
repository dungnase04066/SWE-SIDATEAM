/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.gui;

import com.sida.mybudget.bo.BGToolkit;
import com.sida.mybudget.dao.Data;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AnhDung
 */
public class Profile extends javax.swing.JDialog {

    /**
     * Creates new form Profile
     */
    public Profile() {
        BGToolkit.setBackground(this);
        initComponents();
        setModal(true);
        init();
        setVisible(true);
    }

    private void init() {
        txtUser.setText(Data.getUser().getUser());
        txtName.setText(Data.getUser().getName());
        txtEmail.setText(Data.getUser().getEmail());
        if (Data.getUser().isGender()) {
            rbtMale.setSelected(true);
        } else {
            rbtFemale.setSelected(true);
        };
        txtNewPass.setText("");
        txtReNewPass.setText("");
        txtCurrentPass.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGender = new javax.swing.ButtonGroup();
        lbUser = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNewPass = new javax.swing.JLabel();
        lbReNewPass = new javax.swing.JLabel();
        lbCurrentPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rbtMale = new javax.swing.JRadioButton();
        rbtFemale = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtNewPass = new javax.swing.JPasswordField();
        txtReNewPass = new javax.swing.JPasswordField();
        txtCurrentPass = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Management");
        setResizable(false);

        lbUser.setText("Username");

        lbName.setText("Name");

        lbGender.setText("Gender");

        lbEmail.setText("Email");

        lbNewPass.setText("New password");

        lbReNewPass.setText("Re new password");

        lbCurrentPass.setText("Current password");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 0, 0));
        txtUser.setText("N/a");

        btgGender.add(rbtMale);
        rbtMale.setText("Male");

        btgGender.add(rbtFemale);
        rbtFemale.setText("Female");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/logo.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Account Management");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMouseReleased(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/close1.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUser)
                            .addComponent(lbName)
                            .addComponent(lbEmail)
                            .addComponent(lbNewPass)
                            .addComponent(lbReNewPass)
                            .addComponent(lbCurrentPass))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtMale)
                                .addGap(47, 47, 47)
                                .addComponent(rbtFemale)
                                .addGap(0, 62, Short.MAX_VALUE))
                            .addComponent(txtName)
                            .addComponent(txtEmail)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNewPass)
                            .addComponent(txtReNewPass)
                            .addComponent(txtCurrentPass)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbGender)
                        .addGap(0, 327, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(txtUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender)
                    .addComponent(rbtMale)
                    .addComponent(rbtFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNewPass)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReNewPass)
                    .addComponent(txtReNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCurrentPass)
                    .addComponent(txtCurrentPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = BGToolkit.formatName(txtName.getText().trim());
        String email = txtEmail.getText().trim().toLowerCase();
        String newPass = String.valueOf(txtNewPass.getPassword()).trim();
        String reNewPass = String.valueOf(txtReNewPass.getPassword()).trim();
        String currentPass = String.valueOf(txtCurrentPass.getPassword()).trim();

        if (!BGToolkit.checkName(name)) {
            JOptionPane.showMessageDialog(null, "Please, enter again! Name has only character.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!BGToolkit.checkMail(email)) {
            JOptionPane.showMessageDialog(null, "Please, enter again! Mail format incorrect.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!(newPass.equals("") && reNewPass.equals(""))) {
            if (!BGToolkit.checkPassword(newPass, reNewPass)) {
                JOptionPane.showMessageDialog(null, "Please, enter again! new password has less 6 character and new password, re-newpassword matches", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        boolean gender = rbtMale.isSelected();
        boolean update = false;
        try {
            update = Data.getUser().update(name, email, gender, newPass, currentPass);
        } catch (SQLException ex) {
            btnUpdateActionPerformed(null);
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (update) {
            JOptionPane.showMessageDialog(null, "Your infomation update successful!", "Error", JOptionPane.INFORMATION_MESSAGE);
            init();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Lost!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/update2.png"))); // NOI18N
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseReleased
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/update.png"))); // NOI18N
    }//GEN-LAST:event_btnUpdateMouseReleased

    private void btnCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMousePressed
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/close2.png"))); // NOI18N
    }//GEN-LAST:event_btnCloseMousePressed

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/close1.png"))); // NOI18N
    }//GEN-LAST:event_btnCloseMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGender;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbCurrentPass;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNewPass;
    private javax.swing.JLabel lbReNewPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.JRadioButton rbtMale;
    private javax.swing.JPasswordField txtCurrentPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtReNewPass;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
