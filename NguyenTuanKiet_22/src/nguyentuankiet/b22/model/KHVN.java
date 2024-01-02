package nguyentuankiet.b22.model;

public class KHVN extends KhachHang {
    private String doiTuongKH;
    private double dinhMuc;
    public KHVN() {
    }
    public String getDoiTuongKH() {
        return this.doiTuongKH;
    }
    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }
    public double getDinhMuc() {
        return this.dinhMuc;
    }
    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    @Override
    public String toString() {
        return "{" + " maKH='" + getMaKH() + "'" + ", tenKH='" + getTenKH() + "'" + ", ngayRaHoaDon='"
                + getNgayRaHoaDon() + "'" + ", doiTuongKH='" + getDoiTuongKH() + "'" + ", dinhMuc='" + getDinhMuc()
                + "'" + "}";
    }
    @Override
    public double tinhThanhTien() {
        double thanhTien = 0;
        if (getSoLuong() <= getDinhMuc()) {
            thanhTien = getSoLuong() * getDonGia();
        } else {
            thanhTien = getDinhMuc() * getDonGia() + (getSoLuong() - getDinhMuc()) * getDonGia() * 2.5;
        }
        return thanhTien;
    }
    private String NhapDoiTuongKH() {
        String doiTuongKH = null;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Nhap doi tuong khach hang: ");
            System.out.println("1. Sinh hoat");
            System.out.println("2. Kinh doanh");
            System.out.println("3. San xuat");
            System.out.print("Lua chon: ");
            int luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    doiTuongKH = "sinh hoat";
                    validInput = true;
                    break;
                case 2:
                    doiTuongKH = "kinh doanh";
                    validInput = true;
                    break;
                case 3:
                    doiTuongKH = "san xuat";
                    validInput = true;
                    break;
                default:
                    System.out.println("Doi tuong khach hang khong hop le!");
            }
        }
        return doiTuongKH;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        setDoiTuongKH(NhapDoiTuongKH());
        System.out.print("Nhap dinh muc: ");
        setDinhMuc(sc.nextDouble());
        sc.nextLine();
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Doi tuong khach hang: " + doiTuongKH);
        System.out.println("Dinh muc: " + dinhMuc);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("--------------------------------------------------");

    }
}
