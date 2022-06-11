package personalscoreboard;

import java.util.Scanner;

public class Term {
    private String courseCode;
    private String courseName;
    private int courseNumber;
    private float coursePoint;

    public Term update(Scanner scanner) {
        System.out.print("Tên học phần: ");
        String courseName = scanner.nextLine();
        if (!courseName.equalsIgnoreCase("")) {
            this.courseName = courseName;
        }
        System.out.print("Số tín chỉ: ");
        String courseNumber = scanner.nextLine();
        if (!courseNumber.equalsIgnoreCase("")) {
            this.courseNumber = Integer.parseInt(courseNumber);
        }
        System.out.print("Điểm học phần: ");
        String coursePoint = scanner.nextLine();
        if (!coursePoint.equalsIgnoreCase("")) {
            this.coursePoint = Float.parseFloat(coursePoint);
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-11s    %-30s    %10d    %.2f", courseCode, courseName, courseNumber, coursePoint);
    }

    public Term courseInfor(Scanner scanner) {
        System.out.print("Mã học phần: ");
        courseCode = scanner.nextLine();
        System.out.print("Tên học phần: ");
        courseName = scanner.nextLine();
        System.out.print("Số tín chỉ: ");
        courseNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Điểm học phần: ");
        coursePoint = Float.parseFloat(scanner.nextLine());
        return this;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public float getCoursePoint() {
        return coursePoint;
    }

    public void setCoursePoint(float coursePoint) {
        this.coursePoint = coursePoint;
    }
}
