package salesmanager;

import java.util.Scanner;

public class Goods {
    private String codeItem;
    private String nameItem;
    private float amountItem;
    private long unitPrice;

    public long moneyItem() {
        return (long) amountItem * unitPrice;
    }

    public Goods inforItem(Scanner scanner) {
        System.out.print("Mã hàng: ");
        codeItem = scanner.nextLine();
        System.out.print("Tên hàng: ");
        nameItem = scanner.nextLine();
        System.out.print("Số lượng: ");
        amountItem = Float.parseFloat(scanner.nextLine());
        System.out.print("Đơn giá: ");
        unitPrice = Long.parseLong(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-7s\t%-20s\t%8.2f\t%9d\t%,d", codeItem, nameItem, amountItem, unitPrice, moneyItem());
    }

    public Goods update(Scanner scanner) {
        System.out.print("Tên hàng: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            nameItem = name;
        }
        System.out.print("Số lượng: ");
        String amount = scanner.nextLine();
        if (!amount.equals("")) {
            amountItem = Float.parseFloat(amount);
        }
        System.out.print("Đơn giá: ");
        String price = scanner.nextLine();
        if (!price.equals("")) {
            unitPrice = Long.parseLong(price);
        }
        return this;
    }

    public String getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(String codeItem) {
        this.codeItem = codeItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public float getAmountItem() {
        return amountItem;
    }

    public void setAmountItem(float amountItem) {
        this.amountItem = amountItem;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }
}
