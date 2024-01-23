import utils.HangHoaException;
import utils.KiemTraDuLieu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class QuanLyHangHoa {
    private ArrayList<HangHoa> listHangHoa;

    public QuanLyHangHoa() {
        this.listHangHoa = new ArrayList<>();
    }

    public void themHangHoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại hàng hóa (1. Thực phẩm / 2. Điện máy / 3. Sành sứ): ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // Đọc bỏ dòng newline
        String maHang;
        String finalMaHang = maHang;
        do {
            System.out.println("Nhập mã hàng: ");
            maHang = scanner.nextLine();
        } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraMaHang(finalMaHang), "Mã hàng không được để trống"));

        String tenHang;
        do {
            System.out.println("Nhập tên hàng: ");
            tenHang = scanner.nextLine();
        } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraTenHang(tenHang), "Tên hàng không được để trống"));

        int soLuongTon;
        do {
            System.out.println("Nhập số lượng tồn: ");
            soLuongTon = scanner.nextInt();
        } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraSoLuongTon(soLuongTon), "Số lượng tồn phải lớn hơn hoặc bằng 0"));

        double donGia;
        do {
            System.out.println("Nhập đơn giá: ");
            donGia = scanner.nextDouble();
        } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraDonGia(donGia), "Đơn giá phải lớn hơn 0"));

        switch (choice) {
            case 1:
                LocalDate ngaySanXuat, ngayHetHan;
                String nhaCungCap;
                do {
                    System.out.println("Nhập ngày sản xuất (dd/MM/yyyy): ");
                    String ngaySanXuatStr = scanner.next();
                    ngaySanXuat = LocalDate.parse(ngaySanXuatStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.println("Nhập ngày hết hạn (dd/MM/yyyy): ");
                    String ngayHetHanStr = scanner.next();
                    ngayHetHan = LocalDate.parse(ngayHetHanStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.println("Nhập nhà cung cấp: ");
                    nhaCungCap = scanner.next();
                } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraThongTinThucPham(ngaySanXuat, ngayHetHan, nhaCungCap),
                        "Ngày sản xuất phải trước ngày hết hạn và nhà cung cấp không được để trống"));

                listHangHoa.add(new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap));
                break;
            case 2:
                int thoiGianBaoHanh;
                double congSuatKW;
                do {
                    System.out.println("Nhập thời gian bảo hành (tháng): ");
                    thoiGianBaoHanh = scanner.nextInt();

                    System.out.println("Nhập công suất (KW): ");
                    congSuatKW = scanner.nextDouble();
                } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraThongTinDienMay(thoiGianBaoHanh, congSuatKW),
                        "Thời gian bảo hành phải lớn hơn hoặc bằng 0 và công suất phải lớn hơn 0"));

                listHangHoa.add(new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuatKW));
                break;
            case 3:
                String nhaSanXuat;
                LocalDate ngayNhapKho;
                do {
                    System.out.println("Nhập nhà sản xuất: ");
                    nhaSanXuat = scanner.next();

                    System.out.println("Nhập ngày nhập kho (dd/MM/yyyy): ");
                    String ngayNhapKhoStr = scanner.next();
                    ngayNhapKho = LocalDate.parse(ngayNhapKhoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                } while (!kiemTraNhapLai(() -> KiemTraDuLieu.kiemTraThongTinSanhSu(nhaSanXuat),
                        "Nhà sản xuất không được để trống"));

                listHangHoa.add(new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private boolean kiemTraNhapLai(Runnable action, String errorMessage) {
        try {
            action.run();
            return true;
        } catch (HangHoaException e) {
            System.out.println("Lỗi: " + e.getMessage());
            System.out.println(errorMessage);
            return false;
        }
    }




    public void inDanhSachHangHoa() {
        for (HangHoa hangHoa : listHangHoa) {
            System.out.println(hangHoa.toString());
        }
    }
}