/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.gui;

import com.sida.mybudget.bo.BGToolkit;
import com.sida.mybudget.dao.RecordDAO;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fzzf
 */
public class Report extends javax.swing.JDialog {

    /**
     * Creates new form Report
     */
    public Report() {
        BGToolkit.setBackground(this);
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
        initTypeView();
        initTable();
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

        lbViewBy = new javax.swing.JLabel();
        lbTypeViewBy = new javax.swing.JLabel();
        cbViewBy = new javax.swing.JComboBox<>();
        cbTypeViewBy = new javax.swing.JComboBox<>();
        lbTotal = new javax.swing.JLabel();
        lbIncome = new javax.swing.JLabel();
        lbExpense = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbIncome = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jScrollPane2 = new javax.swing.JScrollPane();
        tbExpense = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 420));

        lbViewBy.setText("View by");

        lbTypeViewBy.setText("Month");

        cbViewBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Year" }));
        cbViewBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbViewByItemStateChanged(evt);
            }
        });

        cbTypeViewBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypeViewByItemStateChanged(evt);
            }
        });

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbTotal.setText("Total:");

        lbIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbIncome.setForeground(new java.awt.Color(51, 204, 0));
        lbIncome.setText("Income: ");

        lbExpense.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbExpense.setForeground(new java.awt.Color(255, 204, 0));
        lbExpense.setText("Expense:");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sida/mybudget/asset/logo.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Report");

        tbIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbIncome);

        tbExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbExpense);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addComponent(lbExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(lbTypeViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbTypeViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbViewBy)
                    .addComponent(cbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTypeViewBy)
                    .addComponent(cbTypeViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initTypeView() {
        Vector<String> v = new Vector<>();
        try {
            v = RecordDAO.getViewTime(cbViewBy.getSelectedIndex());
        } catch (SQLException ex) {
            
        }
        cbTypeViewBy.setModel(new DefaultComboBoxModel<>(v));
    }

    private void initTable() {
        Vector<String> col;
        Vector<Vector> rowIn;
        Vector<Vector> rowEx;
        double in = 0,ex = 0,total = 0;
        col = new Vector<>();
        col.add("Date");
        col.add("Amount");
        col.add("Note");

        rowIn = new Vector<>();
        rowEx = new Vector<>();
        Vector<Vector> v = new Vector<>();
        try {
            v = RecordDAO.getStatistics((String) cbTypeViewBy.getSelectedItem(), cbViewBy.getSelectedIndex());
        } catch (SQLException e) {
            
        }
        if (v != null) {
            for (Vector vector : v) {
                Vector temp = new Vector();
                if ((boolean) vector.get(3)) {
                    temp.add(vector.get(4));
                    temp.add(vector.get(2));
                    temp.add(vector.get(5));
                    rowIn.add(temp);
                    in += (double) vector.get(2);
                } else {
                    temp.add(vector.get(4));
                    temp.add(-(double) vector.get(2));
                    temp.add(vector.get(5));
                    rowEx.add(temp);
                    ex += (double) vector.get(2);
                }
            }
        }
        total = in-ex;
        lbTotal.setText(String.format("Total: $%.2f", total));
        lbIncome.setText(String.format("Income: $%.2f", in));
        lbExpense.setText(String.format("Expense: $%.2f", ex));
        tbIncome.setModel(new DefaultTableModel(rowIn, col));
        tbExpense.setModel(new DefaultTableModel(rowEx, col));
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbViewByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbViewByItemStateChanged
        initTypeView();
        initTable();
    }//GEN-LAST:event_cbViewByItemStateChanged

    private void cbTypeViewByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypeViewByItemStateChanged
        initTable();
    }//GEN-LAST:event_cbTypeViewByItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cbTypeViewBy;
    private javax.swing.JComboBox<String> cbViewBy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbExpense;
    private javax.swing.JLabel lbIncome;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTypeViewBy;
    private javax.swing.JLabel lbViewBy;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tbExpense;
    private javax.swing.JTable tbIncome;
    // End of variables declaration//GEN-END:variables
}
