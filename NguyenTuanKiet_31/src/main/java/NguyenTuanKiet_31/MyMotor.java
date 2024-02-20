package NguyenTuanKiet_31;

import java.util.Scanner;

public class MyMotor implements IMotor {
    public String code;
    public String name;
    public int capacity;
    public String type;
    Scanner scanner = new Scanner(System.in);
    public MyMotor() {
    }
    @Override
    public void InputInfo() {
        do {
            System.out.print("Nhập tên (tối thiểu 6 ký tự): ");
            this.name = scanner.nextLine();
            if(this.name.length() < 6) {
                System.out.println("Tên phải có ít nhất 6 ký tự.");
            }
            else {
                break;
            }
        } while (this.name.length() < 6);
        boolean flag;
        do {
            flag = false;
            System.out.print("Nhập capacity (capacity >= 50): ");
            try{
                int capacity = scanner.nextInt();
                if(capacity < 50) {
                    throw new Exception();
                }else{
                    this.capacity = capacity;
                }
            } catch (Exception e) {
                System.out.println("capacity phải là số nguyên  >= 50.");
                scanner.nextLine();
                flag = true;
            }
        } while (flag);
        scanner.nextLine();
        boolean flag1;
        do {
            flag1 = false;
            System.out.print("Nhập loại xe (1=Xe số hoặc 2=xe ga): ");
            try {
                int type = scanner.nextInt();
                if(type == 1) {
                    this.type = "Xe số";
                    flag1 = true;
                }
                else if(type == 2) {
                    this.type = "Xe ga";
                    flag1 = true;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai vui lòng nhập lại.");
                scanner.nextLine();
            }
        } while (!flag1);
        scanner.nextLine();
    }
    @Override
    public void DisplayInfo() {
        System.out.print(this.name + "-" + this.capacity + "-" + this.type);
    }
//    public static void main(String[] args) {
//        MyMotor myMotor = new MyMotor();
//        myMotor.InputInfo();
//        myMotor.DisplayInfo();
//    }
}
