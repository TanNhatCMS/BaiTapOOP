package NguyenTuanKiet_31;

import java.util.ArrayList;
import java.util.Scanner;

public class Yamaha {
    Scanner scanner = new Scanner(System.in);
    ArrayList<MyMotor> arr = new ArrayList<>();

    void Menu() {
        int choice;
        do {
            System.out.println("1. Nhập thông tin xe Exciter");
            System.out.println("2. Nhập thông tin xe Sirius");
            System.out.println("3. Hiển thị thông tin xe Exciter");
            System.out.println("4. Hiển thị thông tin xe Sirius");
            System.out.println("5. Tìm kiếm xe Exciter");
            System.out.println("6. Tìm kiếm xe Sirius");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                case 1:
                    Exciter exciter = new Exciter();
                    exciter.code = NhapCode();
                    exciter.InputInfo();
                    arr.add(exciter);
                    break;
                case 2:
                    Sirius sirius = new Sirius();
                    sirius.code = NhapCode();
                    sirius.InputInfo();
                    arr.add(sirius);
                    break;
                case 3:
                    for (MyMotor myMotor : arr) {
                        if (myMotor instanceof Exciter) {
                            System.out.println("Danh sách xe Exciter: ");
                            System.out.println("Code-Name-Capacity-Type-Warranty");
                            System.out.print(myMotor.code + "-");
                            myMotor.DisplayInfo();
                        }
                    }
                    break;
                case 4:
                    for (MyMotor myMotor : arr) {
                        if (myMotor instanceof Sirius) {
                            System.out.println("Danh sách xe Sirius: ");
                            System.out.println("Code-Name-Capacity-Type-Color");
                            System.out.print(myMotor.code + "-");
                            myMotor.DisplayInfo();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập mã code cần tìm: ");
                    String code = scanner.nextLine();
                    boolean flag = false;
                    for (MyMotor myMotor : arr) {
                        if (myMotor instanceof Exciter) {
                            if (myMotor.code.equalsIgnoreCase(code)) {
                                System.out.println("Tìm thấy xe Exciter có mã code " + code);
                                System.out.println("Code-Name-Capacity-Type");
                                System.out.print(myMotor.code + "-");
                                myMotor.DisplayInfo();
                                flag = true;
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Không tìm thấy xe Exciter có mã code " + code);
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã code cần tìm: ");
                    code = scanner.nextLine();
                    flag = false;
                    for (MyMotor myMotor : arr) {
                        if (myMotor instanceof Sirius) {
                            if (myMotor.code.equalsIgnoreCase(code)) {
                                System.out.println("Tìm thấy xe Sirius có mã code " + code);
                                System.out.println("Code-Name-Capacity-Type-Color");
                                System.out.print(myMotor.code + "-");
                                myMotor.DisplayInfo();
                                flag = true;
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Không tìm thấy xe Sirius có mã code " + code);
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }

    public String NhapCode() {
        String code;
        boolean flag;
        do {
            flag = false;
            System.out.println("Nhập mã code (tối thiểu 4 ký tự và không trùng): ");
            code = scanner.nextLine();
            if (code.length() < 4) {
                System.out.println("Mã code phải có ít nhất 4 ký tự.");
                flag = true;
            } else {
                for (MyMotor myMotor : arr) {
                    if (myMotor.code.equalsIgnoreCase(code)) {
                        System.out.println("Mã code đã tồn tại.");
                        flag = true;
                    } else {
                        break;
                    }
                }
            }
        } while (flag);
        return code;
    }

    public static void main(String[] args) {
        Yamaha yamaha = new Yamaha();
        yamaha.Menu();
    }
}
