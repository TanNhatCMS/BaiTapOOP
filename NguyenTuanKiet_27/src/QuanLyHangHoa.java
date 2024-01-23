import java.util.ArrayList;

public class QuanLyHangHoa {
    private ArrayList<HangHoa> listHangHoa;

    public QuanLyHangHoa() {
        this.listHangHoa = new ArrayList<>();
    }

    public void themHangHoa(HangHoa hangHoa) {
        // Kiểm tra trùng mã hàng
        if (!listHangHoa.contains(hangHoa)) {
            listHangHoa.add(hangHoa);
            System.out.println("Thêm hàng hóa thành công.");
        } else {
            System.out.println("Mã hàng đã tồn tại. Không thể thêm.");
        }
    }

    public void inDanhSachHangHoa() {
        for (HangHoa hangHoa : listHangHoa) {
            System.out.println(hangHoa.toString());
        }
    }
}
