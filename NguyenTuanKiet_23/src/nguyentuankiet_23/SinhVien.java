package nguyentuankiet_23;

import nguyentuankiet_23.utils.Validator;
import java.util.Scanner;

import static nguyentuankiet_23.utils.View.*;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    protected int MaSV;
    protected String TenSV;
    public void setMaSV(int maSV) {
        MaSV = maSV;
    }
    public int getMaSV() {
        return MaSV;
    }
    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }
    public String getTenSV() {
        return TenSV;
    }
    public void setSV() {
        NhapThongTin("Nhập mã sinh viên: ",  true);
        NhapThongTin("Nhập Họ và tên: ",  false);
    }
    private void NhapThongTin(String prompt,  boolean checkNegative) {
        boolean flag;
        do {
            try {
                B(prompt);
                String input = sc.nextLine().trim();
                if (checkNegative) {
                    setMaSV(Validator.MaSV(input));
                } else {
                    setTenSV(Validator.Ten(input));
                }
                flag = false;
            } catch (Exception e) {
               R(e.getMessage());
                flag = true;
            }
        } while (flag);
    }
    public void viewSV() {
        Y("Mã sinh viên: " + getMaSV());
        Y("Tên sinh viên: " + getTenSV());
    }
    public  double tongDiem(){
        return 0;
    }
}