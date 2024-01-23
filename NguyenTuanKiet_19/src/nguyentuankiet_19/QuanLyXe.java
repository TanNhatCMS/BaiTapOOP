package nguyentuankiet_19;

import java.util.*;

public class QuanLyXe {
    ArrayList<Xe> arrayList = new ArrayList<Xe>();
    Scanner scanner = new Scanner(System.in);
    void menu(){
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin xe noi thanh");
            System.out.println("2. Nhap thong tin xe ngoai thanh");
            System.out.println("3. Xuất chuyến xe nội thành");
            System.out.println("4. Xuất chuyến xe ngoại thành");
            System.out.println("5. Xuat tất cả chuyến xe");
            System.out.println("6. Xuat tổng doanh thu cho từng loại xe");
            System.out.println("7. Sắp xếp các chuyến xe tăng dần theo doanh thu");
            System.out.println("8. Sắp xếp các chuyến xe ngoại thành giảm dần theo doanh thu");
            System.out.println("9. Xoá xe nội thành có doanh thu thấp nhất");
            System.out.println("10. Sắp xếp các chuyến xe nội thành giảm dần theo họ tên tài xế");
            System.out.println("Moi ban chon: ");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    NoiThanh nt = new NoiThanh();
                    System.out.println("Nhap ma so chuyen: ");
                    nt.setMaChuyen(scanner.nextLine());
                    System.out.println("Nhap ho ten tai xe: ");
                    nt.setHoTen(scanner.nextLine());
                    System.out.println("Nhap so xe: ");
                    nt.setSoXe(scanner.nextLine());
                    System.out.println("Nhap so tuyen: ");
                    nt.setSoTuyen(scanner.nextInt());
                    System.out.println("Nhap so km di duoc: ");
                    nt.setSoKm(scanner.nextInt());
                    System.out.println("Nhap doanh thu: ");
                    nt.setDoanhThu(scanner.nextDouble());
                    scanner.nextLine();
                    arrayList.add(nt);
                    break;
                case 2:
                    NgoaiThanh ngt = new NgoaiThanh();
                    System.out.println("Nhap ma so chuyen: ");
                    ngt.setMaChuyen(scanner.nextLine());
                    System.out.println("Nhap ho ten tai xe: ");
                    ngt.setHoTen(scanner.nextLine());
                    System.out.println("Nhap so xe: ");
                    ngt.setSoXe(scanner.nextLine());
                    System.out.println("Nhap noi den: ");
                    ngt.setNoiDen(scanner.nextLine());
                    System.out.println("Nhap so ngay di duoc: ");
                    ngt.setSoNgay(scanner.nextInt());
                    System.out.println("Nhap doanh thu: ");
                    ngt.setDoanhThu(scanner.nextDouble());
                    scanner.nextLine();
                    arrayList.add(ngt);
                    break;
                case 3:
                    for (Xe xe : arrayList) {
                        if (xe instanceof NoiThanh nt1) {
                            System.out.println(xe.getHoTen());
                            System.out.println(xe.getMaChuyen());
                            System.out.println(xe.getSoXe());
                            System.out.println(xe.getDoanhThu());
                            System.out.println(nt1.getSoTuyen());
                            System.out.println(nt1.getSoKm());
                        }
                    }
                    break;
                case 4:
                    for (Xe xe : arrayList) {
                        if (xe instanceof NgoaiThanh ngt1) {
                            System.out.println(xe.getHoTen());
                            System.out.println(xe.getMaChuyen());
                            System.out.println(xe.getSoXe());
                            System.out.println(xe.getDoanhThu());
                            System.out.println(ngt1.getNoiDen());
                            System.out.println(ngt1.getSoNgay());
                        }
                    }
                    break;
                case 5:
                      for (Xe xe : arrayList) {
                        System.out.println(xe.toString());
                        System.out.println(xe.getHoTen());
                        System.out.println(xe.getSoXe());
                        System.out.println(xe.getDoanhThu());
                        if (xe instanceof NoiThanh nt1) {
                            System.out.println(nt1.getSoTuyen());
                            System.out.println(nt1.getSoKm());
                        } else {
                            NgoaiThanh ngt1 = (NgoaiThanh) xe;
                            System.out.println(ngt1.getNoiDen());
                            System.out.println(ngt1.getSoNgay());
                        }
                    }
                    break;
                case 6:
                    double tongNoiThanh = 0;
                    double tongNgoaiThanh = 0;
                    for (Xe xe : arrayList) {
                        if (xe instanceof NoiThanh nt1) {
                            tongNoiThanh += xe.getDoanhThu();
                        } else {
                            tongNgoaiThanh += xe.getDoanhThu();
                        }
                    }
                    System.out.println("Tong doanh thu xe noi thanh: " + tongNoiThanh);
                    System.out.println("Tong doanh thu xe ngoai thanh: " + tongNgoaiThanh);
                    break;
                case 7:
//                    for (int i = 0; i < arrayList.size() - 1; i++) {
//                        for (int j = i + 1; j < arrayList.size(); j++) {
//                            if (arrayList.get(i).getDoanhThu() > arrayList.get(j).getDoanhThu()) {
//                                Xe xe = arrayList.get(i);
//                                arrayList.set(i, arrayList.get(j));
//                                arrayList.set(j, xe);
//                            }
//                        }
//                    }
                    // Tạo một Comparator cho đối tượng Xe dựa trên doanhThu
                    Comparator<Xe> comparator = (xe1, xe2) -> {
                        // So sánh theo thuộc tính doanhThu
                        return Double.compare(xe1.getDoanhThu(), xe2.getDoanhThu());
                    };
                    // Sắp xếp ArrayList sử dụng Comparator đã tạo
                    arrayList.sort(comparator);
                    break;
                case 8:
//                    for (int i = 0; i < arrayList.size() - 1; i++) {
//                        for (int j = i + 1; j < arrayList.size(); j++) {
//                            if (arrayList.get(i).getDoanhThu() < arrayList.get(j).getDoanhThu() && arrayList.get(i) instanceof NgoaiThanh && arrayList.get(j) instanceof NgoaiThanh) {
//                                Xe xe = arrayList.get(i);
//                                arrayList.set(i, arrayList.get(j));
//                                arrayList.set(j, xe);
//                            }
//                        }
//                    }
                    // Tạo một Comparator cho đối tượng Xe dựa trên doanhThu của NgoaiThanh
                    Comparator<Xe> comparator2 = (xe1, xe2) -> {
                        // Kiểm tra xem cả hai đối tượng có phải là NgoaiThanh hay không
                        // Nếu cả hai đều là NgoaiThanh, so sánh theo thuộc tính doanhThu
                        if (xe1 instanceof NgoaiThanh && xe2 instanceof NgoaiThanh) {
                            return Double.compare(xe1.getDoanhThu(), xe2.getDoanhThu());
                        } else {
                            return 0; // Nếu cả hai đều không phải NgoaiThanh, không cần sắp xếp
                        }
                    };
                    // Sắp xếp ArrayList sử dụng Comparator đã tạo
                    arrayList.sort(comparator2);
                    break;
                case 9:
                    double min = -1;
                    for (Xe value : arrayList) {
                        if (value instanceof NoiThanh) {
                            min = value.getDoanhThu();
                        }
                    }
                    if(min!=-1){
                        for (Xe xe : arrayList) {
                            if (xe instanceof NoiThanh nt1) {
                                if (xe.getDoanhThu() < min) {
                                    min = xe.getDoanhThu();
                                }
                            }
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i).getDoanhThu() == min && arrayList.get(i) instanceof NoiThanh) {
                                System.out.println("Xoa xe thu " + i );
                                arrayList.remove(i);
                                i--;
                            }
                        }
                    }else{
                        System.out.println("Khong co xe noi thanh trong danh sach");
                    }
                    break;
                case 10:
                    /*for (int i = 0; i < arrayList.size() - 1; i++) {
                        for (int j = i + 1; j < arrayList.size(); j++) {
                            if (arrayList.get(i).getHoTen().compareTo(arrayList.get(j).getHoTen()) > 0 && arrayList.get(i) instanceof NoiThanh && arrayList.get(j) instanceof NoiThanh) {
                                Xe xe = arrayList.get(i);
                                arrayList.set(i, arrayList.get(j));
                                arrayList.set(j, xe);
                            }
                        }
                    }*/
                    // Tạo một Comparator cho đối tượng Xe
                    Comparator<Xe> comparator3 = (xe1, xe2) -> {
                        // Kiểm tra xem cả hai đối tượng có phải là NoiThanh hay không
                        // Nếu cả hai đều là NoiThanh, so sánh theo thuộc tính hoTen
                        if (xe1 instanceof NoiThanh && xe2 instanceof NoiThanh) {
                            return xe1.getHoTen().compareTo(xe2.getHoTen());
                        } else {
                            return 0; // Nếu cả hai đều không phải NoiThanh, không cần sắp xếp
                        }
                    };
                    // Sắp xếp ArrayList sử dụng Comparator đã tạo
                    arrayList.sort(comparator3);

                    break;
                default:
                    System.out.println("Nhap sai, moi ban nhap lai");
            }
        }while (chon != 0);
    }

}
