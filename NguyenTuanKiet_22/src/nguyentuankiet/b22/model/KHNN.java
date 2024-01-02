package nguyentuankiet.b22.model;

public class KHNN extends KhachHang{
    private String quocTich;
    public KHNN() {
    }
    public String getQuocTich() {
        return this.quocTich;
    }
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    @Override
    public String toString() {
        return "{" +
            " maKH='" + getMaKH() + "'" +
            ", tenKH='" + getTenKH() + "'" +
            ", ngayRaHoaDon='" + getNgayRaHoaDon() + "'" +
            ", quocTich='" + getQuocTich() + "'" +
            "}";
    }
    @Override
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia();
    }
    private void nhapQuocTich() {
        System.out.print("Nhap quoc tich: ");
        setQuocTich(sc.nextLine());
    }
    @Override
    public void Nhap() {
        super.Nhap();
        nhapQuocTich();
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Quoc tich: " + getQuocTich());
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("--------------------------------------------------");
    }
}
