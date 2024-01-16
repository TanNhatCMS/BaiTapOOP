public class NVLapTrinh_NguyenTuanKiet extends NhanVien_NguyenTuanKiet {
    private String loai;
    private double bonus;
    private int thamNien;
    public NVLapTrinh_NguyenTuanKiet(){}
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public void setLoai(String loai){
        this.loai = loai;
        if(loai.equals("A")){
            bonus = 500000;
        }
        else if(loai.equals("B")){
            bonus = 0;
        }
        setBonus(bonus);
    }
    public String getLoai(){
        return loai;
    }
    public void setThamNien(int thamNien){
        this.thamNien = thamNien;
    }
    public int getThamNien(){
        return thamNien;
    }
    public double tinhOvertime(){
        if(getThamNien() > 4){
            return getLuongCanBan()*1.2;
        }else{
            return getLuongCanBan();
        }
    }
    @Override
    public double tinhLuong(){
        return  getLuongCanBan()*getHeSoLuong()+tinhOvertime()+getBonus();
    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap loai nhân viên lập trình(A hoặc B):");
        boolean flag = true;
        do {
            loai = sc.nextLine().toUpperCase();
            if(loai.equals("A") || loai.equals("B")){
                flag = false;
            }
            else{
                System.out.print("Nhap lai loai(A hoặc B):");
            }
        }while (flag);
        setLoai(loai);
        System.out.print("Nhap tham niên:");
        thamNien = sc.nextInt();
        setThamNien(thamNien);
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Loai: "+getLoai());
        System.out.println("Thâm niên: "+getThamNien());
        System.out.println("Lương: "+tinhLuong());
    }
}
