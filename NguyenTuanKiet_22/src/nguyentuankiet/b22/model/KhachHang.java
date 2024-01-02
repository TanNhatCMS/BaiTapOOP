package nguyentuankiet.b22.model;
import java.util.Scanner;
import static nguyentuankiet.b22.utils.Date.isDate;
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String ngayRaHoaDon;
    private double soLuong;
    private double donGia;
    Scanner sc = new Scanner(System.in);
    public KhachHang() {
    }
    public String getMaKH() {
        return this.maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String getTenKH() {
        return this.tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getNgayRaHoaDon() {
        return this.ngayRaHoaDon;
    }
    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }
    public double getSoLuong() {
        return this.soLuong;
    }
    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return this.donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "{" + " maKH='" + getMaKH() + "'" + ", tenKH='" + getTenKH() + "'" + ", ngayRaHoaDon='"
                + getNgayRaHoaDon() + "'" + "}";
    }
    public String nhapNgayRaHoaDon() {
        String ngay = null;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Nhap ngay ra hoa don (dd/mm/yyyy): ");
            ngay = sc.nextLine().trim();
            validInput = isDate(ngay);
            if (!validInput) {
                System.out.println("Bạn đã nhập sai dinh dang ngày. Vui lòng nhập lại.");
            }
        }
        return ngay;
    }
    public double tinhThanhTien() {
        return 0;
    }
    public void Nhap() {
        System.out.println("Nhap ma khach hang: ");
        setMaKH(sc.nextLine());
        System.out.println("Nhap ten khach hang: ");
        setTenKH(sc.nextLine());
        setNgayRaHoaDon(nhapNgayRaHoaDon());
        System.out.println("Nhap so luong: ");
        setSoLuong(sc.nextDouble());
        System.out.println("Nhap don gia: ");
        setDonGia(sc.nextDouble());
        sc.nextLine();
    }
    public void Xuat() {
        System.out.println("Ma khach hang: " + getMaKH());
        System.out.println("Ten khach hang: " + getTenKH());
        System.out.println("Ngay ra hoa don: " + getNgayRaHoaDon());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("Don gia: " + getDonGia());
    }
}
