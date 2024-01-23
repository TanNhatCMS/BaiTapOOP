package nguyentuankiet_19;

public class NoiThanh extends Xe{
    private int soTuyen;
    private double soKm;
    public NoiThanh() {
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
    public int getSoTuyen() {
        return soTuyen;
    }
    public double getSoKm() {
        return soKm;
    }
    @Override
    public String toString() {
        String s = "";
        s+= getSoTuyen()+"\n";
        s+= getSoKm()+"\n";
        return s;
    }
}
