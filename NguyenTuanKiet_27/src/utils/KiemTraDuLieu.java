package utils;

import java.util.Date;

public class KiemTraDuLieu {
    public static boolean kiemTraMaHang(String maHang) throws HangHoaException {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new HangHoaException(HangHoaException.LOI_MA_HANG);
        }
        return true;
    }

    public static boolean kiemTraTenHang(String tenHang) throws HangHoaException {
        if (tenHang == null || tenHang.trim().isEmpty()) {
            throw new HangHoaException( HangHoaException.LOI_TEN_HANG);
        }
        return true;
    }

    public static boolean kiemTraSoLuongTon(int soLuongTon) throws HangHoaException {
        if (soLuongTon < 0) {
            throw new HangHoaException(HangHoaException.LOI_SO_LUONG_TON);
        }
        return true;
    }

    public static boolean kiemTraDonGia(double donGia) throws HangHoaException {
        if (donGia <= 0) {
            throw new HangHoaException(HangHoaException.LOI_DON_GIA);
        }
        return true;
    }

    public static boolean kiemTraNgayHopLe(Date ngay) throws HangHoaException {
        if (ngay == null) {
            throw new HangHoaException( HangHoaException.LOI_NGAY_HOP_LE);
        }
        return true;
    }

    public static boolean kiemTraThoiGianBaoHanh(int thoiGianBaoHanh) throws HangHoaException {
        if (thoiGianBaoHanh < 0) {
            throw new HangHoaException( HangHoaException.LOI_THOI_GIAN_BAO_HANH);
        }
        return true;
    }

    public static boolean kiemTraCongSuat(double congSuat) throws HangHoaException {
        if (congSuat <= 0) {
            throw new HangHoaException( HangHoaException.LOI_CONG_SUAT);
        }
        return true;
    }

    public static boolean kiemTraThongTinThucPham(Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) throws HangHoaException {
        if (!ngaySanXuat.before(ngayHetHan) || nhaCungCap.isEmpty()) {
            throw new HangHoaException(HangHoaException.LOI_THONG_TIN_THUC_PHAM);
        }
        return true;
    }

    public static boolean kiemTraThongTinDienMay(int thoiGianBaoHanh, double congSuat) throws HangHoaException {
        if (thoiGianBaoHanh < 0 || congSuat <= 0) {
            throw new HangHoaException( HangHoaException.LOI_THONG_TIN_DIEN_MAY);
        }
        return true;
    }

    public static boolean kiemTraThongTinSanhSu(String nhaSanXuat) throws HangHoaException {
        if (nhaSanXuat.isEmpty()) {
            throw new HangHoaException( HangHoaException.LOI_THONG_TIN_SANH_SU);
        }
        return true;
    }
}
