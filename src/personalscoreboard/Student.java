package personalscoreboard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private String studentCode;
    private String fullName;
    private LocalDate birth;
    private String marjors;
    private ArrayList<Term> subjectList = new ArrayList<>();

    public Student updateStudent(Scanner scanner) {
        System.out.println("Cập nhật thông tin sinh viên:");
        System.out.print("Họ và tên: ");
        String fullName = scanner.nextLine();
        if (!fullName.equalsIgnoreCase("")) {
            this.fullName = fullName;
        }
        System.out.print("Ngày sinh");
        String birth = scanner.nextLine();
        if (!birth.equalsIgnoreCase("")) {
            this.birth = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        System.out.print("Ngành: ");
        String marjors = scanner.nextLine();
        if (!marjors.equalsIgnoreCase("")) {
            this.marjors = marjors;
        }
        return this;
    }

    public Student updateSubject(Scanner scanner) {
        System.out.print("Nhập mã học phần muốn sửa: ");
        String code = scanner.nextLine();
        for (Term term :
                subjectList) {
            if (term.getCourseCode().equalsIgnoreCase(code)) {
                term.update(scanner);
                return this;
            }
        }
        System.out.println("không có môn học mã " + code);
        return this;
    }

    public void coursesScoresBelow6() {
        System.out.println("Danh sách các học phần có điểm dưới 6.0:");
        System.out.println("STT    Mã học phần    Tên học phần                      Số tín chỉ    Điểm học phần");
        int count = 1;
        for (Term term :
                subjectList) {
            if (term.getCoursePoint() < 6.0) {
                System.out.printf("%3d    %s\n", count, term);
                count++;
            }
        }
    }

    public ArrayList<Term> sort() {
        Collections.sort(subjectList, new Comparator<Term>() {
            @Override
            public int compare(Term o1, Term o2) {
                String subject1 = o1.getCourseName().trim();
                String subject2 = o2.getCourseName().trim();
                return subject1.compareToIgnoreCase(subject2);
            }
        });
        return subjectList;
    }

    public float finalGrade() {
        float totalScore = 0;
        int totalCredits = 0;
        for (Term subject :
                subjectList) {
            totalScore += subject.getCoursePoint();
            totalCredits += subject.getCourseNumber();
        }
        return totalScore / totalCredits;
    }

    @Override
    public String toString() {
        String str = "BẢNG ĐIỂM CÁ NHÂN\n";
        str += String.format("Mã sinh viên: %-7s                    Họ và tên: %s\n", studentCode, fullName);
        str += String.format("Ngày sinh: %-10s                    Ngành: %s\n",
                birth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), marjors);
        str += "STT    Mã học phần    Tên học phần                      Số tín chỉ    Điểm học phần\n";
        this.sort();
        for (int i = 0; i < subjectList.size(); i++) {
            str += String.format("%3d    %s\n", i + 1, subjectList.get(i));
        }
        str += String.format("                                                       Điểm tổng kêt: %.2f", finalGrade());
        return str;
    }

    public Student create(Scanner scanner) {
        System.out.println("Nhập bảng điểm cho sinh viên:");
        System.out.print("Mã sinh viên: ");
        studentCode = scanner.nextLine();
        System.out.print("Họ và tên: ");
        fullName = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        birth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Ngành: ");
        marjors = scanner.nextLine();
        System.out.println("Danh sách học phần:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".");
            subjectList.add(new Term().courseInfor(scanner));
        }
        return this;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getMarjors() {
        return marjors;
    }

    public void setMarjors(String marjors) {
        this.marjors = marjors;
    }

    public ArrayList<Term> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Term> subjectList) {
        this.subjectList = subjectList;
    }
}
