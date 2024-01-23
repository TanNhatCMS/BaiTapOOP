public class HangDienMay extends HangHoa{
    int thoiGianBaoHanh;
    double congSuatKW;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
                       int thoiGianBaoHanh, double congSuatKW) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuatKW = congSuatKW;
    }
    @Override
    public void Nhap() {

    }
    @Override
    public void Xuat() {

    }
    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.1;// VAT 10%
    }
}
