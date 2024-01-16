import java.util.Scanner;

public class NhanVien_NguyenTuanKiet {
    private String maNV;
    private String hoTen;
    private double luongCanBan;
    private double heSoLuong;
    Scanner sc = new Scanner(System.in);
    public NhanVien_NguyenTuanKiet() {
        setLuongCanBan(1030000);
    }


    public String getMaNV() {
        return this.maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCanBan() {
        return this.luongCanBan;
    }
    public void setLuongCanBan(double luongCanBan) {
        this.luongCanBan = luongCanBan;
    }
    public double getHeSoLuong() {
        return this.heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void Nhap() {
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
    }
    public void Xuat(){
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten nhan vien: " + hoTen);
        System.out.println("He so luong: " + heSoLuong);
    }
    public double tinhLuong() {
        return 0;
    }
}


