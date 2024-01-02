package nguyentuankiet.b22.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Date {
    public static boolean isDate(String DateString) {
        if(DateString == null) {
            return false;
        }
        String[] parts = DateString.split("/");
        // Kiểm tra xem chuỗi ngày có đúng định dạng không
        if (parts.length != 3) {
            return false;
        }
        int ngay, thang, nam;
        try {
            ngay = Integer.parseInt(parts[0]);
            thang = Integer.parseInt(parts[1]);
            nam = Integer.parseInt(parts[2]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Bắt các ngoại lệ khi chuyển đổi từ chuỗi thành số
            return false;
        }
        // Kiểm tra ngày, tháng, năm có hợp lệ không
        if (ngay < 1 || thang < 1 || thang > 12 || nam < 1) {
            return false;
        }
        // Kiểm tra tháng 2 có ngày hợp lệ không
        if (thang == 2) {
            int maxDay = 28 + ((nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) ? 1 : 0);
            if (ngay > maxDay) {
                return false;
            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            // Kiểm tra các tháng 30 ngày
            if (ngay > 30) {
                return false;
            }
        }  else {
            // Kiểm tra các tháng còn lại có 31 ngày
            if (ngay > 31) {
                return false;
            }
        }
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        LocalDate inputDate;

        try {
            // Chuyển đổi chuỗi thành LocalDate
            inputDate = LocalDate.of(nam, thang, ngay);
        } catch (DateTimeParseException e) {
            return false;
        }

        // Kiểm tra ngày nhập vào có nhỏ hơn hoặc bằng ngày hiện tại không
        return !inputDate.isAfter(currentDate);
    }
    public static int DateToMonthNumber(String DateString) {
        String[] parts = DateString.split("/");
        if (parts.length != 3) {
            return 0; // Trả về 0 nếu chuỗi không đúng định dạng
        }
        try {
            return Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return 0; // Trả về 0 nếu không thể chuyển đổi thành số
        }
    }
    public static int DateToYearNumber(String DateString) {
        String[] parts = DateString.split("/");
        if (parts.length != 3) {
            return 0; // Trả về 0 nếu chuỗi không đúng định dạng
        }
        try {
            return Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return 0; // Trả về 0 nếu không thể chuyển đổi thành số
        }
    }
    public static boolean isMonth9Year2013(String DateString) {
        return DateToMonthNumber(DateString) == 9 && DateToYearNumber(DateString) == 2013;
    }
}
