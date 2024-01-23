public class DienMay extends HangHoa{
    int thoiGianBaoHanh;
    double congSuat;
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
