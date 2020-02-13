/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SystemClassesAndMain.StudentSys;

/**
 *
 * @author Aizaz Hassan<Aizaz.Hassan>
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnDisplayCourses = new javax.swing.JButton();
        btnGoToStudent = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        rbUndergrad = new javax.swing.JRadioButton();
        rbGrad = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CTIS Information Panel");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("           CTIS INFORMATION PANEL");

        btnDisplayCourses.setText("DISPLAY COURSES");
        btnDisplayCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayCoursesActionPerformed(evt);
            }
        });

        btnGoToStudent.setText("GO TO STUDENT");
        btnGoToStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToStudentActionPerformed(evt);
            }
        });

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbUndergrad);
        rbUndergrad.setSelected(true);
        rbUndergrad.setText("UNDERGRADUATE STUDENT");

        buttonGroup1.add(rbGrad);
        rbGrad.setText("GRADUATE STUDENT");

        jButton1.setText("ADD STUDENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoToStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(btnDisplayCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rbUndergrad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGrad)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisplayCourses)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUndergrad)
                    .addComponent(rbGrad)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addComponent(btnGoToStudent)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToStudentActionPerformed
        GoToStudentFrame s=new GoToStudentFrame(this);
        s.setVisible(true);
        setVisible(false);
        if(StudentSys.getStudents().isEmpty()){
            s.setTextArea("Please add a student!");
            s.setAddCourseButtonDisabled();
            s.setDeleteStudentButtonDisabled();
        }else{
            s.setTextArea(StudentSys.searchStudent(Integer.parseInt((String)s.getCbID().getSelectedItem())).toString());   
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToStudentActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        StudentSys.writeToFile();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDisplayCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayCoursesActionPerformed
        DisplayCoursesFrame d=new DisplayCoursesFrame(this);
        d.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnDisplayCoursesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rbGrad.isSelected()){
            GraduateStudentFrame g=new GraduateStudentFrame(this);
            g.setVisible(true);
        }else{
            UndergraduateStudentFrame u=new UndergraduateStudentFrame(this);
            u.setVisible(true);
        }
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDisplayCourses;
    private javax.swing.JButton btnGoToStudent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbGrad;
    private javax.swing.JRadioButton rbUndergrad;
    // End of variables declaration//GEN-END:variables
}
