package nguyentuankiet_19;

public class Xe {
     protected String MaChuyen;
     protected String HoTen;
     protected String SoXe;
     protected double DoanhThu;
     public void setMaChuyen(String MaChuyen) {
         this.MaChuyen = MaChuyen;
     }
     public void setHoTen(String HoTen) {
         this.HoTen = HoTen;
     }
     public void setSoXe(String SoXe) {
         this.SoXe = SoXe;
     }
     d
     public void setDoanhThu(double DoanhThu) {
         this.DoanhThu = DoanhThu;
     }
     public String getMaChuyen() {
        return MaChuyen;
     }
     public String getHoTen() {
         return HoTen;
     }
     public String getSoXe() {
         return SoXe;
     }
     public double getDoanhThu() {
         return DoanhThu;
     }
     public Xe() {
     }
     public String toString() {
        String s = "";
        s+= getMaChuyen()+"\n";
        s+= getHoTen()+"\n";
        s+= getSoXe()+"\n";
        s+= getDoanhThu()+"\n";
        return s;
    }
}
