abstract class HangHoa {
    private String maHang = "";
    private String tenHang = "";
    private int soLuongTon = 0;
    private double donGia = 0;
    private double tienVAT =0;
    public HangHoa() {
    }
    public HangHoa(double tienVAT) {
        this.tienVAT = tienVAT;
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia, double tienVAT) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.tienVAT = 0;
    }

    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public abstract void Nhap();
    public abstract void Xuat();

}