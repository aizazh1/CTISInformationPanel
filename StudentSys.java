package SystemClassesAndMain;

import CourseAndStudent.Course;
import java.util.LinkedHashSet;
import CourseAndStudent.Student;
import StudentHasA.CourseInfoForStudent;
import StudentIsA.UndergraduateStudent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentSys {

    private static LinkedHashSet<Student> students = new LinkedHashSet<>();
    private static final String STUDENT_FILENAME = "students.dat";

    public static LinkedHashSet<Student> getStudents() {
        return students;
    }

    public static String getStudentsWhoTakeGivenCourse(String code) {
        String str = "";
        for (Student s : students) {
            for (CourseInfoForStudent c : s.getStudentCourses()) {
                if (c.getCode() == Integer.parseInt(code)) {
                    str += s.toString();
                }
            }
        }
        return str;
    }

    public static void addStudent(Student s) {
        students.add(s);
    }

    public static void writeToFile() {
        if (!students.isEmpty()) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STUDENT_FILENAME));
                oos.writeObject(students);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentSys.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StudentSys.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public static void readFromFile() {
        try {
            File file = new File(STUDENT_FILENAME);
            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                students.addAll((LinkedHashSet<Student>) ois.readObject());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentSys.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String displayAll() {
        String str = "";
        for (Student s : students) {
            str += s.toString() + "\n";
        }
        return str;
    }

    public static boolean deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s == null) {
            return false;
        }
        students.remove(s);
        return true;
    }

    public static String[] getStudentIDs() {
        String[] arr = new String[students.size()];
        int i = 0;
        TreeSet<Student> ts = new TreeSet<>();
        ts.addAll(students);
        for (Student s : ts) {
            arr[i++] = String.valueOf(s.getId());
        }
        return arr;
    }

    public static String[] getCourseCodesNotTakenByStudent(Student s) {
        ArrayList<String> courseCodes = new ArrayList<>();
        
            for (Course c : CourseSys.getCourses()) {
                courseCodes.add(c.getCourseCode() + "");
        }
        String[] arr = s.getStudentCourseCodes();
        for (String str : arr) {
            courseCodes.remove(str);
        }
        String[] cArr = new String[courseCodes.size()];
        int i = 0;
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(courseCodes);
        for (String str : ts) {
            cArr[i++] = str;
        }
        return cArr;
    }
}
