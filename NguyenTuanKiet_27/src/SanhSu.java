import java.util.Date;

public class SanhSu extends  HangHoa {
    String nhaSanXuat;
    Date ngayNhapKho;

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
