import java.time.LocalDate;

public class HangSanhSu extends  HangHoa {
    String nhaSanXuat;
    LocalDate ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia,
                      String nhaSanXuat, LocalDate ngayNhapKho) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public void Nhap() {

    }
    @Override
    public void Xuat() {

    }
    @Override
    public double tinhTienVAT() {
        return  donGia * soLuongTon * 0.1;// VAT 10%
    }
}
