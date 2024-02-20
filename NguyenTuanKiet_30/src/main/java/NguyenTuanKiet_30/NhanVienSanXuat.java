package NguyenTuanKiet_30;

import java.util.Scanner;

public class NhanVienSanXuat implements NhanVienMoi {
    private String ten;
    private double heSoLuong;

    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public NhanVienSanXuat() {

    }
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        setTen(scanner.nextLine());
        System.out.println("Nhập hệ số lương: ");
        setHeSoLuong(scanner.nextDouble());
    }
    @Override
    public void Xuat() {
        System.out.println("Tên nhân viên: " + getTen());
        System.out.println("Hệ số lương: " + getHeSoLuong());
        System.out.println("Lương: " + tinhLuong());
    }
    @Override
    public double tinhLuong() {
        return getHeSoLuong() * LUONG_CO_BAN;
    }
    public static void main(String[] args) {
        NhanVienSanXuat nhanVien = new NhanVienSanXuat();
        nhanVien.Nhap();
        nhanVien.Xuat();
    }
}
