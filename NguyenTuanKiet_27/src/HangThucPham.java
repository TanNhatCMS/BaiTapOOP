import java.time.LocalDate;

public class HangThucPham extends HangHoa{
    LocalDate ngaySanXuat;
    LocalDate ngayHetHan;
    String nhaCungCap;
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    @Override
    public double tinhTienVAT() {
        return  donGia * soLuongTon * 0.05;// VAT 5%
    }

    @Override
    public void Nhap() {

    }

    @Override
    public void Xuat() {

    }
}
