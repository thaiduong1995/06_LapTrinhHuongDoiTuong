package salesmanager;

import xehoi.XeHoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vouches vouches = new Vouches();
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Chương trình:");
            System.out.println("1. Tạo phiếu mua hàng");
            System.out.println("2. Hiển thị thông tin phiếu");
            System.out.println("3. Sửa thông tin khách hàng");
            System.out.println("4. Sửa thông tin mặt hàng");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("1. Tạo phiếu mua hàng");
                    vouches.createVochoes(scanner);
                    break;
                case 2:
                    System.out.println("2. Hiển thị thông tin phiếu");
                    System.out.println(vouches);
                    break;
                case 3:
                    System.out.println("3. Sửa thông tin khách hàng");
                    vouches.updateCustomer(scanner);
                    break;
                case 4:
                    System.out.println("4. Sửa thông tin mặt hàng");
                    vouches.updateGoods(scanner);
                    break;
            }
        } while (opt != 0);

    }
}
