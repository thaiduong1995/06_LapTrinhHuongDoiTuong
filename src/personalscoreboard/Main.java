package personalscoreboard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Chương trình:");
            System.out.println("1. Tạo bảng điểm");
            System.out.println("2. Hiển thị bảng điểm");
            System.out.println("3. Danh sách các học phần có điểm dưới 6.0");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Cập nhật thông tin môn học");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("1. Tạo bảng điểm");
                    student.create(scanner);
                    break;
                case 2:
                    System.out.println("2. Hiển thị bảng điểm");
                    System.out.println(student);
                    break;
                case 3:
                    System.out.println("3. Danh sách các học phần có điểm dưới 6.0");
                    student.coursesScoresBelow6();
                    break;
                case 4:
                    System.out.println("4. Cập nhật thông tin sinh viên");
                    student.updateStudent(scanner);
                    break;
                case 5:
                    System.out.println("4. Cập nhật thông tin môn học");
                    student.updateSubject(scanner);
                    break;
            }
        } while (opt != 0);

    }
}
