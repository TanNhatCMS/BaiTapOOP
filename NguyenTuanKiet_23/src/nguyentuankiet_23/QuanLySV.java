package nguyentuankiet_23;

import java.util.ArrayList;
import java.util.Scanner;
import nguyentuankiet_23.utils.QuickSort;
import nguyentuankiet_23.utils.Validator;

import static nguyentuankiet_23.utils.View.*;

public class QuanLySV {
    ArrayList<SinhVien> sv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void menu() {
        int chon = -1;
        do {
            B("----------------- Quản Lý Sinh Viên -----------------------");
            G("1. Nhập danh sách sinh viên");
            G("2. Xuất danh sách sinh viên");
            G("3. Xuất danh sách sinh viên có tổng điểm lớn hơn 10");
            G("4. Xuất danh sách sinh viên có tổng điểm nhỏ hơn 5");
            G("5. Xuất danh sách sinh viên có điểm toán lớn nhất");
            G("6. Sắp xếp danh sách sinh viên theo mã sinh viên");
            R("0. Thoát");
            B("Chọn chức năng: ");
            try {
                chon = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                R("Chọn chức năng không hợp lệ");
                continue;
            }
            switch (chon) {
                case 1:
                    B("Nhập danh sách sinh viên");
                    Nhap();
                    break;
                case 2:
                    B("Xuất danh sách sinh viên");
                    Xuat();
                    break;
                case 3:
                    B("Xuất danh sách sinh viên có tổng điểm lớn hơn 10");
                    this.XuatSVTongLonHon10();
                    break;
                case 4:
                    B("Xuất danh sách sinh viên có tổng điểm nhỏ hơn 5");
                    this.XuatSVTongNhoHon5();
                    break;
                case 5:
                    B("Xuất danh sách sinh viên có điểm toán lớn nhất");
                    this.XuatSVDiemToanLonNhat();
                    break;
                case 6:
                    B("Sắp xếp danh sách sinh viên theo mã sinh viên");
                    this.SapXepSVTheoMaSV();
                    break;
                    case 0:
                    R("Thoát");
                    break;
                default:
                    R("Chọn chức năng không hợp lệ");
            }

        } while (chon != 0) ;
    }
    public void Nhap(){
        int n;
        boolean flag = true;
        do {
            B("Nhập số lượng sinh viên: ");
            try {
                n = Validator.soSV(sc.nextLine());
            }catch (Exception e){
                R(e.getMessage());
                continue;
            }
            flag = false;
            for (int i = 0; i < n; i++){
                B("Nhập thông tin sinh viên thứ " + (i + 1));
                SinhVienCNTT svCNTT = new SinhVienCNTT();
                svCNTT.setSVCNTT();
                sv.add(svCNTT);
            }
        }while (flag);
    }
    public void Xuat(){
        for (SinhVien sinhVien : sv) {
            ((SinhVienCNTT) sinhVien).viewSVCNTT();
        }
    }
   public void XuatSVTongLonHon10(){
        for (SinhVien sinhVien : sv) {
            if(sinhVien.tongDiem() > 10){
                ((SinhVienCNTT) sinhVien).viewSVCNTT();
            }
        }
    }
    public void XuatSVTongNhoHon5(){
        for (SinhVien sinhVien : sv) {
            if(sinhVien.tongDiem() < 5){
                ((SinhVienCNTT) sinhVien).viewSVCNTT();
            }
        }
    }
    public void XuatSVDiemToanLonNhat(){
        if(sv.isEmpty()){
            R("Danh sách sinh viên rỗng");
            return;
        }
        double max = 0;
        SinhVienCNTT svWithMaxDtoan = null;
        for (SinhVien sinhvien : sv) {
            SinhVienCNTT svCNTT = (SinhVienCNTT) sinhvien;
            double dtoan = svCNTT.getDiemToan();
            if (dtoan > max) {
                max = dtoan;
                svWithMaxDtoan = svCNTT;
            }
        }
        if (svWithMaxDtoan != null) {
            G("Sinh viên có điểm toán cao nhất:");
            svWithMaxDtoan.viewSVCNTT();
        } else {
            R("Không có sinh viên CNTT trong danh sách.");
        }
    }
    public void SapXepSVTheoMaSV(){
        if(sv.isEmpty()){
            R("Danh sách sinh viên rỗng");
            return;
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(sv, 0, sv.size() - 1);
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo mã sinh viên:");
        Xuat();
    }
}
