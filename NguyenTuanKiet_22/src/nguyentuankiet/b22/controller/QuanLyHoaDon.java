package nguyentuankiet.b22.controller;

import nguyentuankiet.b22.model.KHNN;
import nguyentuankiet.b22.model.KHVN;
import nguyentuankiet.b22.model.KhachHang;
import java.util.ArrayList;
import java.util.Scanner;
import static nguyentuankiet.b22.utils.Date.isMonth9Year2013;
public class QuanLyHoaDon {
    ArrayList<KhachHang> dsKH = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void menu() {
        while (true) {
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("CHUONG TRINH QUAN LY HOA DON");
                System.out.println("--------------------------------------------------");
                System.out.println("0. Thoat chuong trinh");
                System.out.println("1. Nhap thong tin khach hang");
                System.out.println("2. Xuat thong tin khach hang");
                System.out.println("3. Tinh tong tien khach hang");
                System.out.println("4. Tinh trung binh thanh tien cua khach hang nuoc ngoai");
                System.out.println("5. Xuat danh sach hoa don trong thang 9/2013");
                System.out.println("6. Xoa khach hang ra khoi danh sach");
                System.out.print("Lua chon: ");
                int luaChon = sc.nextInt();
                sc.nextLine();
                switch (luaChon) {
                    case 0:
                        System.out.println("Ket thuc chuong trinh");
                        return;
                    case 1:
                        nhapThongTinKH();
                        break;
                    case 2:
                        xuatThongTinKH();
                        break;
                    case 3:
                        tinhTongTienKH();
                        break;
                    case 4:
                        tinhTrungBinhThanhTienKHNN();
                        break;
                    case 5:
                        xuatDanhSachHoaDonThang9_2013();
                        break;
                    case 6:
                        xoaKhachHangRaKhoiDanhSach();
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    private void nhapThongTinKH() {
        System.out.println("--------------------------------------------------");
        System.out.println("NHAP THONG TIN KHACH HANG");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Nhap thong tin khach hang Viet Nam");
        System.out.println("2. Nhap thong tin khach hang nuoc ngoai");
        System.out.print("Lua chon: ");
        int luaChon = sc.nextInt();
        sc.nextLine();
        switch (luaChon) {
            case 1:
                nhapThongTinKHVN();
                break;
            case 2:
                nhapThongTinKHNN();
                break;
            default:
                System.out.println("Lua chon khong hop le");
                break;
        }
    }
    private void nhapThongTinKHVN() {
        System.out.println("--------------------------------------------------");
        System.out.println("NHAP THONG TIN KHACH HANG VIET NAM");
        System.out.println("--------------------------------------------------");
        KhachHang kh = new KHVN();
        kh.Nhap();
        dsKH.add(kh);
    }
    private void nhapThongTinKHNN() {
        System.out.println("--------------------------------------------------");
        System.out.println("NHAP THONG TIN KHACH HANG NUOC NGOAI");
        System.out.println("--------------------------------------------------");
        KhachHang kh = new KHNN();
        kh.Nhap();
        dsKH.add(kh);
    }
    private void xuatThongTinKH() {
        System.out.println("--------------------------------------------------");
        System.out.println("XUAT THONG TIN KHACH HANG");
        System.out.println("--------------------------------------------------");
        for (KhachHang kh : dsKH) {
            kh.Xuat();
        }
    }
    private void tinhTongTienKH() {
        System.out.println("--------------------------------------------------");
        System.out.println("TINH TONG TIEN KHACH HANG");
        System.out.println("--------------------------------------------------");
        double tongTien = 0;
        for (KhachHang kh : dsKH) {
            tongTien += kh.tinhThanhTien();
        }
        System.out.println("Tong tien khach hang: " + tongTien);
    }
    private void tinhTrungBinhThanhTienKHNN() {
        System.out.println("--------------------------------------------------");
        System.out.println("TINH TRUNG BINH THANH TIEN KHACH HANG NUOC NGOAI");
        System.out.println("--------------------------------------------------");
        double tongTien = 0;
        int soLuongKHNN = 0;
        for (KhachHang kh : dsKH) {
            if (kh instanceof KHNN) {
                tongTien += kh.tinhThanhTien();
                soLuongKHNN++;
            }
        }
        System.out.println("Trung binh thanh tien khach hang nuoc ngoai: " + tongTien / soLuongKHNN);
    }
    private void xuatDanhSachHoaDonThang9_2013() {
        System.out.println("--------------------------------------------------");
        System.out.println("XUAT DANH SACH HOA DON TRONG THANG 9/2013");
        System.out.println("--------------------------------------------------");
        for (KhachHang kh : dsKH) {
            if (isMonth9Year2013(kh.getNgayRaHoaDon())) {
                kh.Xuat();
            }
        }
    }
    private void xoaKhachHangRaKhoiDanhSach() {
        System.out.println("--------------------------------------------------");
        System.out.println("XOA KHACH HANG RA KHOI DANH SACH");
        System.out.println("--------------------------------------------------");
        System.out.print("Nhap ma khach hang can xoa: ");
        String maKH = sc.nextLine();
        for (KhachHang kh : dsKH) {
            if (kh.getMaKH().equals(maKH)) {
                dsKH.remove(kh);
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang co ma " + maKH);
    }

}
