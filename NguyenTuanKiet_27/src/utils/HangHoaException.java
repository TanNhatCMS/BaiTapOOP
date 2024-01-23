package utils;
public class HangHoaException extends Exception {
    public static final int LOI_MA_HANG = 1;
    public static final int LOI_TEN_HANG = 2;
    public static final int LOI_SO_LUONG_TON = 3;
    public static final int LOI_DON_GIA = 4;
    public static final int LOI_NGAY_HOP_LE = 5;
    public static final int LOI_THOI_GIAN_BAO_HANH = 6;
    public static final int LOI_CONG_SUAT = 7;
    public static final int LOI_THONG_TIN_THUC_PHAM = 8;
    public static final int LOI_THONG_TIN_DIEN_MAY = 9;
    public static final int LOI_THONG_TIN_SANH_SU = 10;
    private final int errorCode;
    public HangHoaException( int errorCode) {
        super();
        this.errorCode = errorCode;
    }
    public HangHoaException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public HangHoaException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return switch (getErrorCode()) {
            case LOI_MA_HANG -> "Mã hàng không được để trống";
            case LOI_TEN_HANG -> "Tên hàng không được để trống";
            case LOI_SO_LUONG_TON -> "Số lượng tồn phải lớn hơn hoặc bằng 0";
            case LOI_DON_GIA -> "Đơn giá phải lớn hơn 0";
            case LOI_NGAY_HOP_LE -> "Ngày không được là null";
            case LOI_THOI_GIAN_BAO_HANH -> "Thời gian bảo hành phải lớn hơn hoặc bằng 0";
            case LOI_CONG_SUAT -> "Công suất phải lớn hơn 0";
            case LOI_THONG_TIN_THUC_PHAM -> "Ngày sản xuất phải trước ngày hết hạn và nhà cung cấp không được để trống";
            case LOI_THONG_TIN_DIEN_MAY -> "Thời gian bảo hành phải lớn hơn hoặc bằng 0 và công suất phải lớn hơn 0";
            case LOI_THONG_TIN_SANH_SU -> "Nhà sản xuất không được để trống";
            default -> getMessage();
        };
    }
}
