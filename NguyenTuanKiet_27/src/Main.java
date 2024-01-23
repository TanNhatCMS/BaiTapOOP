import utils.HangHoaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHangHoa quanLy = new QuanLyHangHoa();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm hàng hóa");
            System.out.println("2. In danh sách hàng hóa");
            System.out.println("0. Thoát");
            System.out.println("================");

            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        quanLy.themHangHoa();
                        break;
                    case 2:
                        quanLy.inDanhSachHangHoa();
                        break;
                    case 0:
                        System.out.println("Kết thúc chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
        } while (choice != 0);
    }
}