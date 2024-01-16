public class NVQuanLy_NguyenTuanKiet extends NhanVien_NguyenTuanKiet{
    private int soNgayCong;
    public NVQuanLy_NguyenTuanKiet(){

    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    public int getSoNgayCong(){
        return soNgayCong;
    }
    public double tinhThuong(){
        if(soNgayCong >= 24){
            return 2050000;
        }else{
            return 0;
        }
    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = sc.nextInt();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("So ngay cong: " + soNgayCong);
        System.out.println("Thuong: " + tinhThuong());
        System.out.println("Luong: " + tinhLuong());
    }
    @Override
    public double tinhLuong(){
    return getLuongCanBan()*getHeSoLuong()+tinhThuong();
 }
}
