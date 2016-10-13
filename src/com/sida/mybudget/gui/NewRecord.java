/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.gui;

import com.sida.mybudget.bo.BGToolkit;
import com.sida.mybudget.dao.RecordDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fzzf
 */
public class NewRecord extends javax.swing.JDialog {

    /**
     * Creates new form NewRecords
     */
    public NewRecord() {
        BGToolkit.setBackground(this);
        initComponents();
        setModal(true);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgType = new javax.swing.ButtonGroup();
        lbLogo = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        lbType = new javax.swing.JLabel();
        lbNote = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtNote = new javax.swing.JTextField();
        rbtIncome = new javax.swing.JRadioButton();
        rbtExpense = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbDateFormat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Record");
        setResizable(false);

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/logo.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Add New Record");

        lbDate.setText("Date");

        lbAmount.setText("Amount");

        lbType.setText("Type");

        lbNote.setText("Note");

        btgType.add(rbtIncome);
        rbtIncome.setSelected(true);
        rbtIncome.setText("Income");

        btgType.add(rbtExpense);
        rbtExpense.setText("Expense");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/add1.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddMouseReleased(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/cancel1.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lbDateFormat.setText("YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDate)
                                    .addComponent(lbNote)
                                    .addComponent(lbAmount)
                                    .addComponent(lbType))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rbtIncome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtExpense))
                                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNote))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDateFormat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lbLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDateFormat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtIncome)
                            .addComponent(rbtExpense)
                            .addComponent(lbType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNote))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        double amount = 0;
        String date = txtDate.getText().trim();
        int type = rbtIncome.isSelected() ? 1 : 0;
        String note = txtNote.getText().trim();

        if (!BGToolkit.checkDate(date)) {
            JOptionPane.showMessageDialog(null, "Date format incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /**
         * format date: yyyy-MM-dd to database
         */
        date = BGToolkit.convertToServer(date);
        System.out.println(date);
        /**
         * format amount
         */
        try {
            amount = Double.parseDouble(txtAmount.getText());
            if(!txtAmount.getText().matches("[0-9.]+")){
             JOptionPane.showMessageDialog(null, "Amount must be number ", "Error", JOptionPane.ERROR_MESSAGE);
             return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Amount is only number and less 2 billion", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!BGToolkit.checkAmount(amount)) {
            JOptionPane.showMessageDialog(null, "Amount is only number and less 2 billion ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean add = false;
        try {
            add = RecordDAO.addNew(date, amount, type, note);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            btnAddActionPerformed(null);
            return;
        }
        if (add) {
            JOptionPane.showMessageDialog(null, "Add records successful!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Some thing wrong!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
       btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/add2.png"))); // NOI18N
    }//GEN-LAST:event_btnAddMousePressed

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/add1.png"))); // NOI18N
    }//GEN-LAST:event_btnAddMouseReleased

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/cancel2.png"))); // NOI18N
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/cancel1.png"))); // NOI18N
    }//GEN-LAST:event_btnCancelMouseReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgType;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDateFormat;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNote;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbType;
    private javax.swing.JRadioButton rbtExpense;
    private javax.swing.JRadioButton rbtIncome;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNote;
    // End of variables declaration//GEN-END:variables
}
