package nguyentuankiet_23;

import nguyentuankiet_23.utils.Validator;

import static nguyentuankiet_23.utils.View.*;

public class SinhVienCNTT extends SinhVien {
    private double diemToan;
    private double diemTin;
    public double getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }
    public double getDiemTin() {
        return diemTin;
    }
    public void setDiemTin(double diemTin) {
        this.diemTin = diemTin;
    }
    public SinhVienCNTT() {

    }
    public void setSVCNTT(){
        super.setSV();
        NhapDiem("Nhập điểm toán: ",  true);
        NhapDiem("Nhập điểm tin: ",  false);
    }
    private void NhapDiem(String prompt,  boolean checkNegative) {
        boolean flag;
        do {
            try {
                B(prompt);
                String input = sc.nextLine().trim();
                if (checkNegative) {
                    setDiemToan(Validator.Diem(input));
                } else {
                    setDiemTin(Validator.Diem(input));
                }
                flag = false;
            } catch (Exception e) {
                R(e.getMessage());
                flag = true;
            }
        } while (flag);
    }
    public void viewSVCNTT() {
        viewSV();
        Y("Ngành học: Công nghệ thông tin");
        Y("Điểm toán: " + getDiemToan());
        Y("Điểm tin: " + getDiemTin());
        Y("Tổng điểm: " + tongDiem());
    }

    @Override
    public double tongDiem() {
        return getDiemToan() + getDiemTin();
    }
}