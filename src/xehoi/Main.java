package xehoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XeHoi car = new XeHoi();
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Chương trình:");
            System.out.println("1. Tạo xe hơi");
            System.out.println("2. Hiển thị thông tin xe hơi vừa tạo");
            System.out.println("3. Sửa thông tin xe");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    car = new XeHoi
                            ("CAR-01", "VIOS", "Toyota", "Sedan", 250000000, "Jpan");
                    break;
                case 2:
                    System.out.println(car);
                    break;
                case 3:
                    car.suaThongTin(scanner);
                    break;
            }
        } while (opt != 0);

    }
}
