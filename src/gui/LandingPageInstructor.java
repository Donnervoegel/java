/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.*;
import java.awt.event.*;
import types.*;

/**
 *
 * @author Pun
 */
public class LandingPageInstructor extends JPanel {
    private JButton activity_management_button;
    private JButton marking_button;
    private JPanel tasks_panel;
    private Instructor a;

    /**
     * Creates new form LandingPage
     */
    public LandingPageInstructor(Instructor a) {
	this.a = a;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        tasks_panel                = new JPanel();
        marking_button             = new JButton("Marking");
        activity_management_button = new JButton("Activity Management");

        tasks_panel.setBorder(BorderFactory.createTitledBorder("Tasks"));

        marking_button.addActionListener(e -> markingButtonActionPerformed(e));

        activity_management_button
	    .addActionListener(e -> activitManagementButtonActionPerformed(e));

	// Automated layout stuff.
        GroupLayout tasks_panelLayout = new GroupLayout(tasks_panel);
        tasks_panel.setLayout(tasks_panelLayout);
        tasks_panelLayout.setHorizontalGroup(
            tasks_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, tasks_panelLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(tasks_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(activity_management_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marking_button, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        tasks_panelLayout.setVerticalGroup(
            tasks_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(marking_button)
                .addGap(30, 30, 30)
                .addComponent(activity_management_button)
                .addGap(98, 98, 98))
        );

        // GroupLayout layout = new GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
        // layout.setHorizontalGroup(
        //     layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        //     .addComponent(top_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        //     .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        //         .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        //         .addComponent(tasks_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        //         .addGap(89, 89, 89))
        // );
        // layout.setVerticalGroup(
        //     layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        //     .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        //         .addComponent(top_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        //         .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        //         .addComponent(tasks_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        //         .addContainerGap(83, Short.MAX_VALUE))
        // );

	//        setSize(new java.awt.Dimension(655, 492));
    }

    private void markingButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void activitManagementButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
