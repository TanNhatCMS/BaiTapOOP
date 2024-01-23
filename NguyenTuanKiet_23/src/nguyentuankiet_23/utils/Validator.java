package nguyentuankiet_23.utils;

import java.util.InputMismatchException;

public class Validator {
    public static String Ten(String ten) {
        if(ten.isEmpty() ){
            throw new InputMismatchException("Tên không được để trống");
        }else if(ten.split(" ").length < 2){
            throw new InputMismatchException("Tên không hợp lệ");
        }
        return ten;
    }
    public static int MaSV(String str) {
        if (str.isEmpty()) {
            throw new InputMismatchException("Mã sinh viên không được để trống");
        }
        int i=0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Mã sinh viên phải là số nguyên dương");
        }
        if(i < 0){
            throw new InputMismatchException("Mã sinh viên phải là số nguyên dương");
        }
        return i;
    }
    public static int soSV(String str) {
        if (str.isEmpty()) {
            throw new InputMismatchException("số lượng sinh viên không được để trống");
        }
        int i=0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("số lượng sinh viên phải là số nguyên dương");
        }
        if(i < 0){
            throw new InputMismatchException("số lượng sinh viên phải là số nguyên dương");
        }
        return i;
    }
    public static double Diem(String str) {
        if (str.isEmpty()) {
            throw new InputMismatchException("Điểm không được để trống");
        }
        double d = 0;
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Điểm phải là số thực");
        }
        if(d < 0 || d > 10){
            throw new InputMismatchException("Điểm phải là số thực trong khoảng 0 đến 10");
        }
        return d;
    }
}
