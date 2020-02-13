package SystemClassesAndMain;

import GUI.MainFrame;
public class Main {

    public static void main(String[] args) {
        CourseSys.readCoursesFromFile();
        StudentSys.readFromFile();
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }

}
