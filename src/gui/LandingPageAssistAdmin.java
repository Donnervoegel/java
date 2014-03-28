/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.*;
import gui.utils.*;
import types.*;

/**
 *
 * @author Normal
 */
public class LandingPageAssistAdmin extends JPanel {
    private AssistantAdmin a;

    /**
     * Creates new form LandingPageAssistAdmin1
     */
    public LandingPageAssistAdmin(AssistantAdmin a) {
	this.a = a;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        course_selection_header = new javax.swing.JPanel();
        create_course_button = new javax.swing.JButton();
        modify_course_button = new javax.swing.JButton();
        delete_course_button = new javax.swing.JButton();

        course_selection_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Management"));
        course_selection_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course_selection_header.setName(""); // NOI18N

        create_course_button.setText("Create New Course");
        create_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_course_buttonActionPerformed(evt);
            }
        });

        modify_course_button.setText("Modify Existing Course");
        modify_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_course_buttonActionPerformed(evt);
            }
        });

        delete_course_button.setText("Delete a Course");
        delete_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_course_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout course_selection_headerLayout = new javax.swing.GroupLayout(course_selection_header);
        course_selection_header.setLayout(course_selection_headerLayout);
        course_selection_headerLayout.setHorizontalGroup(
            course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, course_selection_headerLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(course_selection_headerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(create_course_button))
                    .addGroup(course_selection_headerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(delete_course_button))
                    .addComponent(modify_course_button))
                .addGap(169, 169, 169))
        );
        course_selection_headerLayout.setVerticalGroup(
            course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(course_selection_headerLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(create_course_button)
                .addGap(18, 18, 18)
                .addComponent(modify_course_button)
                .addGap(18, 18, 18)
                .addComponent(delete_course_button)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(course_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(course_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void create_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_course_buttonActionPerformed
        GUIUtils.getMasterFrame(this).movePage(new CreateCourse());
    }//GEN-LAST:event_create_course_buttonActionPerformed

    private void modify_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_course_buttonActionPerformed
        GUIUtils.getMasterFrame(this).movePage(new CourseSelection(true));
    }//GEN-LAST:event_modify_course_buttonActionPerformed

    private void delete_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_course_buttonActionPerformed
        GUIUtils.getMasterFrame(this).movePage(new CourseSelection(false));
    }//GEN-LAST:event_delete_course_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel course_selection_header;
    private javax.swing.JButton create_course_button;
    private javax.swing.JButton delete_course_button;
    private javax.swing.JButton modify_course_button;
    // End of variables declaration//GEN-END:variables
}
