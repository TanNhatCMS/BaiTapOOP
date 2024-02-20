package NguyenTuanKiet_31;

import java.util.Scanner;

public class Exciter extends MyMotor {
    private int warranty;
    public Exciter() {
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        boolean flag;
        do {
            flag = false;
            System.out.print("Nhập thời gian bảo hành: ");
            try {
                int warranty = scanner.nextInt();
                if (warranty >= 1) {
                    setWarranty(warranty);
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Thời gian bảo hành phải lớn hơn hoặc bằng 1 năm.");
                scanner.nextLine();
                flag = true;
            }
        } while (flag);
        scanner.nextLine();
    }
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("-" + getWarranty());
    }
//    public static void main(String[] args) {
//        Exciter exciter = new Exciter();
//        exciter.InputInfo();
//        exciter.DisplayInfo();
//    }
}
