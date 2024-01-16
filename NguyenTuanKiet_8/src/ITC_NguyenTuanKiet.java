import java.util.ArrayList;
import java.util.Scanner;

public class ITC_NguyenTuanKiet {
    Scanner sc = new Scanner(System.in);

    ArrayList<NhanVien_NguyenTuanKiet> nv = new ArrayList<>();
    public void menu(){
        int chon;
        do{
            System.out.println("1. Nhap nhan vien lap trinh");
            System.out.println("2. Xuat Nhan Vien lap trinh");
            System.out.println("3. Tong Luong Nhan vien lap trinh co tham nien >=5 nam");
            System.out.println("4. Xoa nhan vien lap trinh co luong thap nhat");
            System.out.println("5. Sap xep nhan vien lap trinh theo ho ten tang dan");
            System.out.println("0. Thoat");
            System.out.println("Moi ban chon: ");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    NVLapTrinh_NguyenTuanKiet n = new NVLapTrinh_NguyenTuanKiet();
                    n.Nhap();
                    nv.add(n);
                    break;
                case 2:
                    System.out.println("Danh sach nhan vien lap trinh: ");
                    boolean flag = false;
                    for (NhanVien_NguyenTuanKiet x : nv) {
                    if(x instanceof NVLapTrinh_NguyenTuanKiet){
                       x.Xuat();
                       flag = true;
                   }
                }
                if(!flag){
                    System.out.println("Khong co nhan vien lap trinh");
                }
                break;
                case 3:
                    double tong = 0;
                    for (NhanVien_NguyenTuanKiet x : nv) {
                        if(x instanceof NVLapTrinh_NguyenTuanKiet){
                            if(((NVLapTrinh_NguyenTuanKiet) x).getThamNien() >= 5){
                            tong += x.tinhLuong();
                            }
                        }
                    }
                System.out.println("Tong luong nhan vien lap trinh co tham nien >=5 nam: " + tong);
                break;
                case 4:
                    double min = 0;
                    for (NhanVien_NguyenTuanKiet x : nv) {
                        if (x instanceof NVLapTrinh_NguyenTuanKiet) {
                            min = x.tinhLuong();
                            break;
                        }
                    }
                    for (NhanVien_NguyenTuanKiet nhanVienNguyenTuanKiet : nv) {
                        if (nhanVienNguyenTuanKiet.tinhLuong() < min && nhanVienNguyenTuanKiet instanceof NVLapTrinh_NguyenTuanKiet) {
                            min = nhanVienNguyenTuanKiet.tinhLuong();
                        }
                    }

                    for (int i = 0; i < nv.size(); i++) {
                        if (nv.get(i).tinhLuong() == min && nv.get(i) instanceof NVLapTrinh_NguyenTuanKiet) {
                            nv.remove(i);
                            i--;
                        }
                    }
                    System.out.println("Danh sách sau khi xóa nhan vien lap trinh co luong thap nhat: ");
                    for (NhanVien_NguyenTuanKiet x : nv) {
                        x.Xuat();
                    }
                break;
                case 5:
                    for (int i = 0; i < nv.size() - 1; i++) {
                        for (int j = i + 1; j < nv.size(); j++) {
                            if (nv.get(i).getHoTen().compareTo(nv.get(j).getHoTen()) > 0 && nv.get(i) instanceof NVLapTrinh_NguyenTuanKiet && nv.get(j) instanceof NVLapTrinh_NguyenTuanKiet) {
                                NhanVien_NguyenTuanKiet tam = nv.get(i);
                                nv.set(i, nv.get(j));
                                nv.set(j, tam);
                            }
                        }
                    }
                    System.out.println("Danh sách sap xep nhan vien lap trinh theo ho ten tang dan: ");
                    for (NhanVien_NguyenTuanKiet x : nv) {
                        x.Xuat();
                    }
                    break;
                default:
                System.out.println("Nhap sai moi ban chon lai");
                break;
            }
        }while(chon != 0);
    }

}
