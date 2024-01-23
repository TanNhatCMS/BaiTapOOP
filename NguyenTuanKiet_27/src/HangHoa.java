abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;
    public HangHoa() {
    }
    public abstract double tinhTienVAT();

    public abstract void Nhap();
    public abstract void Xuat();

}