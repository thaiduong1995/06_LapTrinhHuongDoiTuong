package salesmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Vouches {
    private String couponCode;
    private String customerName;
    private String numberPhone;
    private String adress;
    private ArrayList<Goods> listItems = new ArrayList<>();

    public Vouches createVochoes(Scanner scanner) {
        System.out.println("Nhập thông tin phiếu mua hàng:");
        System.out.print("Mã phiếu: ");
        couponCode = scanner.nextLine();
        System.out.print("Họ tên khách: ");
        customerName = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        numberPhone = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        adress = scanner.nextLine();
        System.out.println("Danh sách mặt hàng:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".");
            listItems.add(new Goods().inforItem(scanner));
        }
        return this;
    }

    public long totalMoney() {
        long result = 0;
        for (Goods goods :
                listItems) {
            result += goods.moneyItem();
        }
        return result;
    }

    @Override
    public String toString() {
        String str = "========================================================";
        str += "Phiếu mua hàng:\n";
        str += String.format("Mã phiếu: %s\nHọ tên khách: %s\nSố điện thoại: %s\nĐịa chỉ: %s\nDanh sách mặt hàng:\n",
                couponCode, customerName, numberPhone, adress);
        str += "STT\tMã hàng\tTên hàng            \tSố lượng\tĐơn giá  \tThành tiền\n";
        for (int i = 0; i < listItems.size(); i++) {
            str += String.format("%3d\t%s\n", i + 1, listItems.get(i));
        }
        str += String.format("Tổng tiền:\t\t\t\t                                     %,d", totalMoney());
        return str;
    }

    public Vouches updateCustomer(Scanner scanner) {
        System.out.println("Sửa thông tin phiếu mua hàng:");
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            customerName = name;
        }
        System.out.print("Điện thoại: ");
        String phone = scanner.nextLine();
        if (!phone.equals("")) {
            numberPhone = phone;
        }
        System.out.print("Địa chỉ: ");
        String adress = scanner.nextLine();
        if (!adress.equals("")) {
            this.adress = adress;
        }
        return this;
    }

    public Vouches updateGoods(Scanner scanner) {
        System.out.print("Nhập mã hàng cần sửa: ");
        String code = scanner.nextLine();
        boolean flag = true;
        for (Goods goods :
                listItems) {
            if (goods.getCodeItem().equalsIgnoreCase(code)) {
                flag = false;
                goods.update(scanner);
                break;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy mặt hàng có mã " + code);
        }
        return this;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Goods> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<Goods> listItems) {
        this.listItems = listItems;
    }
}
