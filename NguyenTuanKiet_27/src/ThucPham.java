import java.util.Date;

public class ThucPham extends HangHoa{
    Date ngaySanXuat;
    Date ngayHetHan;
    String nhaCungCap;

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
