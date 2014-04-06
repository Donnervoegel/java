/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;


import database.*;
import gui.types.*;
import gui.utils.GUIUtils;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

import types.Activity;

/**
 *
 * @author Jordan Toering, Graeme Smith
 */
public class MarkingPDF extends MSPanel {

    private static final String COLUMN_NAMES[]={"Description", "Grade", "Max Grade"};
    private Object[][] table;
    private int studentID;
    private String courseID, actName, stud_name;
    private Object[] student_list;
    private Activity activity;
	
     public MarkingPDF(final String courseID, final Activity act, final int stud_id, String student_name, Object[] stud_list) {
        super(act.getName(), CANT_NAV);
        initComponents();
        this.student_list = stud_list;
        this.activity = act;
        this.stud_name = student_name;
        
        
        student_name_label.setText(student_name);
        id_label.setText(Integer.toString(stud_id));
        
        grade_field.setEditable(false);
        max_grade_field.setEditable(false);
        
        float max = 0;
        
        this.courseID = courseID;
        this.actName = act.getName();
        this.studentID = stud_id;
        
        String last_indice_check = student_name + " - " + studentID;
        if (last_indice_check.equalsIgnoreCase((String)stud_list[stud_list.length-1]))
                this.next_button.setEnabled(false);
        
        //Some PDF Solution Implemented Below
        SwingController submittedController = new SwingController();
    	SwingViewBuilder submittedPDF = new SwingViewBuilder(submittedController);
    	
    	SwingController solutionController = new SwingController();
    	SwingViewBuilder solutionPDF = new SwingViewBuilder(solutionController);
        
        ComponentKeyBinding.install(submittedController, submitted_panel);
        submittedController.getDocumentViewController().setAnnotationCallback(
        	      new org.icepdf.ri.common.MyAnnotationCallback(
        	             submittedController.getDocumentViewController()));
        
        ComponentKeyBinding.install(solutionController, solution_panel);
        solutionController.getDocumentViewController().setAnnotationCallback(
        	      new org.icepdf.ri.common.MyAnnotationCallback(
        	             solutionController.getDocumentViewController()));
        
        submitted_panel = submittedPDF.buildViewerPanel();
        solution_panel = solutionPDF.buildViewerPanel();
        
        pdf_tabbed_pane.addTab("Submission", submitted_panel);
        pdf_tabbed_pane.addTab("Solution", solution_panel);
        
        String[] paths = CourseAccess.accessSubmissionPath(courseID, act.getName());
        submittedController.openDocument(paths[0] + "/" + stud_id + "/" + act.getName() + ".pdf");
        solutionController.openDocument(paths[1]);
        
        //Populate the Rubric Table code below this:
        grade_field.setText("");
        Object[][] temp = CourseAccess.accessRubricItems(courseID, act.getName());
		if (temp.length != 0) {
			table = new Object[temp.length][3];
			for(int i=0; i<table.length; i++) {
				table[i][0] = temp[i][0];
				table[i][1] = 0;
				table[i][2] = temp[i][1];
				max += (float) temp[i][1];
 			}
			DefaultTableModel tm = new DefaultTableModel(table, COLUMN_NAMES) {
	            public boolean isCellEditable(int row, int column) {
	            	if(column == 0 || column == 2) 
	            		return false;
	            	return true;
	            }
			};;
			tm.addTableModelListener(new javax.swing.event.TableModelListener() {
				public void tableChanged(TableModelEvent e) {
					table_change_actionPerformed(e);
				}
	        });;
			rubric_table.setModel(tm);
		}
		Object[] grades = GradeAccess.accessGrades(courseID, act.getName(), stud_id);
		System.out.println(grades.length);
		if(grades.length != 0) {
			for(int i=0; i<grades.length; i++) {
				table[i][1] = grades[i];
				System.out.println(grades[i]);
			}
			DefaultTableModel tm = new DefaultTableModel(table,COLUMN_NAMES) {
	            public boolean isCellEditable(int row, int column) {
	            	if(column == 0 || column == 2) 
	            		return false;
	            	return true;
	            }
			};;
			tm.addTableModelListener(new javax.swing.event.TableModelListener() {
				public void tableChanged(TableModelEvent e) {
					table_change_actionPerformed(e);
				}
	        });;
			rubric_table.setModel(tm);
			float gradeTotal = 0;
			for (int i = 0; i < rubric_table.getRowCount(); i++)
				gradeTotal += Float.parseFloat(rubric_table.getModel()
						.getValueAt(i, 1).toString());
	    	String currentGrade = "" + gradeTotal;
	    	grade_field.setText(currentGrade);
		}
		String maxField = "" + max;
		max_grade_field.setText(maxField);
		rubric_table.getColumnModel().getColumn(0).setPreferredWidth(500);
	}

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubric_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rubric_table = new javax.swing.JTable();
        max_grade_field = new javax.swing.JTextField();
        grade_field = new javax.swing.JTextField();
        slash_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        student_name_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        student_id_label = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        pdf_tabbed_pane = new javax.swing.JTabbedPane();
        submitted_panel = new javax.swing.JPanel();
        solution_panel = new javax.swing.JPanel();

        rubric_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Rubric"));
        rubric_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        rubric_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        rubric_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Description", "Grade", "Max Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rubric_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(rubric_table);
        if (rubric_table.getColumnModel().getColumnCount() > 0) {
            rubric_table.getColumnModel().getColumn(1).setResizable(false);
            rubric_table.getColumnModel().getColumn(1).setPreferredWidth(8);
            rubric_table.getColumnModel().getColumn(2).setResizable(false);
            rubric_table.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        max_grade_field.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        max_grade_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        max_grade_field.setText("Max");

        grade_field.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        grade_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_field.setText("Grade");

        slash_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slash_label.setText("/");

        total_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_label.setText("Total:");

        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Name:");

        student_name_label.setText("...");

        id_label.setText("...");

        student_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student_id_label.setText("Student ID:");

        javax.swing.GroupLayout rubric_panelLayout = new javax.swing.GroupLayout(rubric_panel);
        rubric_panel.setLayout(rubric_panelLayout);
        rubric_panelLayout.setHorizontalGroup(
            rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addGroup(rubric_panelLayout.createSequentialGroup()
                .addComponent(total_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grade_field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slash_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(max_grade_field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rubric_panelLayout.createSequentialGroup()
                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rubric_panelLayout.createSequentialGroup()
                .addComponent(student_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rubric_panelLayout.setVerticalGroup(
            rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rubric_panelLayout.createSequentialGroup()
                .addGroup(rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(student_id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(student_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(max_grade_field, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(slash_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grade_field, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        next_button.setText("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        save_button.setText("Save");
        save_button.setMaximumSize(new java.awt.Dimension(57, 25));
        save_button.setMinimumSize(new java.awt.Dimension(57, 25));
        save_button.setPreferredSize(new java.awt.Dimension(57, 25));
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        submitted_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitted_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        submitted_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout submitted_panelLayout = new javax.swing.GroupLayout(submitted_panel);
        submitted_panel.setLayout(submitted_panelLayout);
        submitted_panelLayout.setHorizontalGroup(
            submitted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        submitted_panelLayout.setVerticalGroup(
            submitted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        solution_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        solution_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        solution_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout solution_panelLayout = new javax.swing.GroupLayout(solution_panel);
        solution_panel.setLayout(solution_panelLayout);
        solution_panelLayout.setHorizontalGroup(
            solution_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        solution_panelLayout.setVerticalGroup(
            solution_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rubric_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pdf_tabbed_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pdf_tabbed_pane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rubric_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(next_button, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(save_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        String next_stud = gui.utils.GUIUtils.getNextStudent(stud_name, studentID, student_list);
        
        
        String[] split_array = next_stud.split(" - ");
        String next_name = split_array[0];
        String next_number = split_array[1];
        int next_number_int = Integer.parseInt(next_number);
           
        setOkToNav();
        GUIUtils.getMasterFrame(this).movePage(new MarkingPDF(courseID, activity, next_number_int, next_name, student_list));
        
    }//GEN-LAST:event_next_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        for (int i = 0; i < rubric_table.getColumnCount(); i++) {
			try {
				GradeAccess.enterGrade(studentID, courseID, actName,
						rubric_table.getModel().getValueAt(i, 0).toString(),
						Float.parseFloat(rubric_table.getModel().getValueAt(i, 1)
								.toString()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				GradeAccess.updateGrade(studentID, courseID, actName,
						rubric_table.getModel().getValueAt(i, 0).toString(),
						Float.parseFloat(rubric_table.getModel().getValueAt(i, 1)
								.toString()));
			}
		}
	setOkToNav();	
        JOptionPane.showMessageDialog(this,"Grade saved.");
    }//GEN-LAST:event_save_buttonActionPerformed
    
    private void table_change_actionPerformed(TableModelEvent e) {
    	float grades = 0;
    	for(int i=0; i<rubric_table.getRowCount(); i++)
			grades += Float.parseFloat(rubric_table.getModel()
					.getValueAt(i, e.getColumn()).toString());
    	String currentGrade = "" + grades;
    	grade_field.setText(currentGrade);
	}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField grade_field;
    private javax.swing.JLabel id_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField max_grade_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton next_button;
    private javax.swing.JTabbedPane pdf_tabbed_pane;
    private javax.swing.JPanel rubric_panel;
    private javax.swing.JTable rubric_table;
    private javax.swing.JButton save_button;
    private javax.swing.JLabel slash_label;
    private javax.swing.JPanel solution_panel;
    private javax.swing.JLabel student_id_label;
    private javax.swing.JLabel student_name_label;
    private javax.swing.JPanel submitted_panel;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
