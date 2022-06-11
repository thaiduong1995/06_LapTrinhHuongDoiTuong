package xehoi;

import java.util.Scanner;

public class XeHoi {
    private String maXe;
    private String nhanHieu;
    private String hangSX;
    private String kieuDang;
    private long gia;
    private String xuatSu;

    public XeHoi suaThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin cần sửa cho xe hơi");
        System.out.print("Nhãn hiệu: ");
        String nhanHieu1 = scanner.nextLine();
        if (nhanHieu1 != "") {
            nhanHieu = nhanHieu1;
        }System.out.print("Hãng sản xuất: ");
        String hangSX1 = scanner.nextLine();
        if (hangSX1 != "") {
            hangSX = hangSX1;
        }System.out.print("Kiểu dáng: ");
        String kieuDang1 = scanner.nextLine();
        if (kieuDang1 != "") {
            kieuDang = kieuDang1;
        }System.out.print("Giá: ");
        String gia1 = scanner.nextLine();
        if (gia1 != "") {
            gia = Long.parseLong(gia1);
        }System.out.print("Xuất xứ: ");
        String xuatSu1 = scanner.nextLine();
        if (xuatSu1 != "") {
            xuatSu = xuatSu1;
        }
        return this;
    }
    @Override
    public String toString() {
        return String.format("Thông tin xe:\n " +
                "Mã xe: %s\nNhãn hiệu: %s\nHãng sản xuất: %s\nKiểu dáng: %s\nGiá tiền: %,d\nXuất sứ: %s",
                maXe, nhanHieu, hangSX, kieuDang, gia, xuatSu);
    }

    public XeHoi() {
    }

    public XeHoi(String maXe, String nhanHieu, String hangSX, String kieuDang, long gia, String xuatSu) {
        this.maXe = maXe;
        this.nhanHieu = nhanHieu;
        this.hangSX = hangSX;
        this.kieuDang = kieuDang;
        this.gia = gia;
        this.xuatSu = xuatSu;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }
}
