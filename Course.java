package CourseAndStudent;

public class Course implements Comparable<Course>{
    private int courseCode;
    private int credit;
    private String CourseName;

    public Course(String CourseCode, String credit, String CourseName) {
        this.courseCode = Integer.parseInt(CourseCode);
        this.credit = Integer.parseInt(credit);
        this.CourseName = CourseName;
    }

    @Override
    public String toString() {
        return "Course" + "\nCourseCode=" + courseCode + "\ncredit=" + credit + 
                "\nCourseName=" + CourseName + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.courseCode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode) {
            return false;
        }
        return true;
    }

    public int getCredit() {
        return credit;
    }
    
    public int getCourseCode() {
        return courseCode;
    }

    @Override
    public int compareTo(Course t) {
        return this.courseCode-t.getCourseCode();
    }
}