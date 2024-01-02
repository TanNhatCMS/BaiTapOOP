# Bài Tập 22
## Xây dựng chương trình quản lý danh sách hoá đơn tiền điện của khách hàng. 
### Thông tin bao gồm các loại khách hàng:
-  Khách hàng Việt Nam: 
    + mã khách hàng
    + họ tên
    + ngày ra hoá đơn (ngày, tháng,năm)
    + đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất):
    + số lượng (số KW tiêu thụ)
    + đơn giá
    + định mức
    + Thành tiền được tính như sau:
        - Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
        - Ngược lại thì: thành tiền = số lượng * đơn giá * định mức + số lượng KW vượt định mức * Đơn giá * 2.5.
-  Khách hàng nước ngoài: 
    + mã khách hàng
    + họ tên
    + ngày ra hoá đơn (ngày, tháng,năm theo định dạng dd/mm/yyyy)
    + quốc tịch
    + số lượng
    + đơn giá.
    + Thành tiền được tính = số lượng * đơn giá.
## Thực hiện các yêu cầu sau:
- a) Xây dựng các lớp với chức năng thừa kế thể hiện tính đa hình.
- b) Nhập xuất danh sách các hóa đơn khách hàng.
- c) Tính tổng số lượng cho từng loại khách hàng.
- d) Tính trung bình thành tiền của khách hàng người nước ngoài.
- e) Xuất ra các hoá đơn trong tháng 09 năm 2013 (của cả 2 loại khách hàng).
- f) Xóa khách hàng ra khỏi danh sách
