/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CourseAndStudent.Student;
import StudentHasA.CourseInfoForStudent;
import SystemClassesAndMain.CourseSys;
import SystemClassesAndMain.StudentSys;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Aizaz Hassan<Aizaz.Hassan>
 */
public class AddStudentCoursesFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddCoursesFrame
     */
    UndergraduateStudentFrame usf;
    Student student;
    GraduateStudentFrame gsf;
    GoToStudentFrame ssf;

    public AddStudentCoursesFrame(Student s) {
        initComponents();
        this.student = s;
        setComboBox(s);
    }

    public AddStudentCoursesFrame(Student s, GraduateStudentFrame gsf) {
        this(s);
        this.gsf = gsf;
    }

    public AddStudentCoursesFrame(Student s, UndergraduateStudentFrame usf) {
        this(s);
        this.usf = usf;
    }

    public AddStudentCoursesFrame(Student s, GoToStudentFrame ssf) {
        this(s);
        this.ssf = ssf;
    }

    public void clear() {
        cbCourse.setSelectedIndex(0);
        cbGrade.setSelectedIndex(0);
    }

   public void setComboBox(Student s) {
        cbCourse.setModel(new DefaultComboBoxModel<>(StudentSys.getCourseCodesNotTakenByStudent(s)));
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
        jLabel2 = new javax.swing.JLabel();
        cbCourse = new javax.swing.JComboBox<>();
        labelAlert = new javax.swing.JLabel();
        btnAddCourse = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        cbGrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Courses");

        jLabel1.setText("Course:");

        jLabel2.setText("Grade:");

        cbCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbCourseKeyPressed(evt);
            }
        });

        btnAddCourse.setText("ADD COURSE");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        cbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F" }));
        cbGrade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbGradeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCourse)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        String code = (String) cbCourse.getSelectedItem();
        int credit = CourseSys.getCourseCredit(Integer.parseInt(code));
        CourseInfoForStudent course = new CourseInfoForStudent(code, credit,
                (String) cbGrade.getSelectedItem());
        student.addCourse(course);
        labelAlert.setText("CTIS " + (String) cbCourse.getSelectedItem() + " added");
        setComboBox(student);
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
        if (usf != null) {
            usf.setVisible(true);
            student.calcGPA();
        } else if (gsf != null) {
            gsf.setVisible(true);
            student.calcGPA();
        } else {
            ssf.setVisible(true);
            ssf.setTextArea(StudentSys.searchStudent(Integer.parseInt((String) ssf.getCbID().getSelectedItem())).toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbGradeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbGradeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String code = (String) cbCourse.getSelectedItem();
            int credit = CourseSys.getCourseCredit(Integer.parseInt(code));
            CourseInfoForStudent course = new CourseInfoForStudent(code, credit,
                    (String) cbGrade.getSelectedItem());
            student.addCourse(course);
            labelAlert.setText("CTIS " + (String) cbCourse.getSelectedItem() + " added");
            setComboBox(student);
            clear();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGradeKeyPressed

    private void cbCourseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCourseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String code = (String) cbCourse.getSelectedItem();
            int credit = CourseSys.getCourseCredit(Integer.parseInt(code));
            CourseInfoForStudent course = new CourseInfoForStudent(code, credit,
                    (String) cbGrade.getSelectedItem());
            student.addCourse(course);
            labelAlert.setText("CTIS " + (String) cbCourse.getSelectedItem() + " added");
            setComboBox(student);
            clear();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_cbCourseKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAlert;
    // End of variables declaration//GEN-END:variables
}
