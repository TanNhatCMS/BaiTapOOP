import java.util.Date;

public class ThucPham extends HangHoa{
    Date ngaySanXuat;
    Date ngayHetHan;
    String nhaCungCap;
    public ThucPham() {
        super(0.5);
    }
    public ThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    @Override
    public void Nhap() {

    }

    @Override
    public void Xuat() {

    }
}
