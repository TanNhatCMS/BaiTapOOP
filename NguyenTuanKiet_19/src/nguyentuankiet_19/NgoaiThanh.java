package nguyentuankiet_19;

public class NgoaiThanh extends Xe {
    private String NoiDen;
    private int SoNgay;

    public NgoaiThanh() {
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }
    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }
    public String getNoiDen() {
        return NoiDen;
    }
    public int getSoNgay() {
        return SoNgay;
    }
    @Override
    public String toString() {
        String s = "";
        s+= getNoiDen()+"\n";
        s+= getSoNgay()+"\n";
        return s;
    }
}
