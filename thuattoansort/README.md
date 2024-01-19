Sắp xếp chọn – Selection Sort
Giới thiệu
Thuật toán sắp xếp chọn – Selection Sort là 1 trong các thuật toán sắp xếp kinh điển, cơ bản và dễ hiện thực, là thuật toán được tiếp cận sớm nhất khi bắt đầu học các giải thuật sắp xếp cơ bản. Trong 1 số trường hợp đơn giản, thuật toán này rất hữu hiệu, chẳng hạn với các mảng dữ liệu nhỏ không đòi hỏi phải tối ưu về thời gian.
Ý tưởng
Chọn phần tử nhỏ nhất đưa về vị trí đầu tiên của mảng hiện tại và không cần quan tâm đến nó nữa. Khi đó mảng chỉ còn lại n – 1 phần tử của mảng ban đầu, tiếp tục xét từ phần tử thứ 2 của mảng.
Lặp lại cho đến khi dãy hiện tại chỉ còn 1 phần tử.
Bước 1: Chọn phần tử đầu tiên trong dãy là min.
Bước 2: So sánh min với phần tử thứ hai. Nếu phần tử thứ hai nhỏ hơn min, đánh dấu phần tử thứ hai là min.
Bước 3: Đổi chỗ a[i] và a[min].
Bước 4: Nếu i < n – 1 thì lặp lại bước 2 với i++ cho đến phần tử cuối cùng của dãy.
Đánh giá thuật toán sắp xếp chèn
Độ phức tạp thuật toán:
Trường hợp tốt: O(n2) (Mảng đã được sắp xếp)
Trung bình: O(n2)
Trường hợp xấu: O(n2) (Mảng bị sắp xếp ngược)
Không gian bộ nhớ sử dụng: O(1)
Tại chỗ (In-place): Có
Cách sử dụng:
Sắp xếp chọn được sử dụng khi:
Dữ liệu đầu vào là 1 dãy nhỏ cần được sắp xếp
Chi phí của việc đổi chỗ không đáng kể
Kiểm tra toàn bộ phần tử trong dãy là cần thiết
Chi phí ghi vào bộ nhớ quan trọng như trong bộ nhớ flash 
(số lần ghi/đổi chỗ là O(n) so với O(n2) của sắp xếp nổi bọt)

Sắp xếp nhanh – Quick Sort
Giới thiệu
Thuật toán Quick Sort (Sắp xếp nhanh) là một trong những thuật toán sắp xếp hiệu quả nhất và dựa trên việc chia một mảng thành các mảng nhỏ hơn. Sắp xếp nhanh có khả năng sắp xếp danh sách các yếu tố dữ liệu nhanh hơn đáng kể so với bất kỳ thuật toán sắp xếp phổ biến nào. Nếu so với các thuật toán sắp xếp phổ biến như Insertion Sort, Selection Sort hay Bubble Sort, thì Quick Sort cho một hiệu năng đáng kể.
Ý tưởng
Giống như Merge Sort, Quick Sort là thuật toán chia để trị (Divide and Conquer). Thuật toán sẽ chọn một phần tử trong chuỗi, mảng để làm điểm đánh dấu (pivot). Sau khi lựa chọn được điểm đánh dấu (pivot), thuật toán sẽ thực hiện chia mảng thành các mảng con, công việc này gọi là phân đoạn (partition). Và lặp đi lặp lại như vậy cho đến khi kết thúc.
Vì thế hiệu suất của Quick Sort phụ thuộc vào các lựa chọn điểm đánh dấu pivot và thuật toán phân đoạn. Nếu lựa chọn pivot tốt thì thuật toán sẽ có tốc độ nhanh hơn. Dưới đây mình sẽ hướng dẫn thế nào là điểm đánh dấu (pivot) và phân đoạn (partition).
Cách lựa chọn Pivot
Trong một mảng, dãy số cho trước, chúng ta có thể lựa chọn pivot bằng các cách sau:
Chọn phần tử đầu tiên của mảng
Chọn phần tử cuối cùng của mảng
Chọn 1 phần tử ngẫu nhiên của mảng
Chọn số trung vị của mảng (Median element)
Thuật toán phân đoạn (Partition)
Quan trọng chính của thuật toán sắp xếp Quick Sort là việc phân đoạn dãy số (Xem hàm partition()).
Công việc chính của việc phân đoạn là:
Cho một mảng và xác định phần tử X là pivot
Đặt X vào đúng vị trí của mảng đã sắp xếp
Di chuyển tất cả các phần tử của mảng nhỏ hơn X sang bên trái và lớn hơn sang bên phải
Khi đó ta sẽ có 2 mảng con: mảng bên trái của X và mảng bên phải của X. Tiếp tục công việc với mỗi mảng con (chọn pivot, phân đoạn) cho tới khi mảng được sắp xếp. Dưới đây là hướng dẫn cụ thể (ở bài này mình chọn điểm đánh dấu pivot là phần tử cuối cùng của mảng):
Đặt pivot là phần tử cuối cùng của mảng arr.
Chúng ta bắt đầu từ phần tử trái nhất của mảng có chỉ số là low và phần tử phải nhất của dãy số có chỉ số là high – 1 (bỏ qua phần tử pivot).
Lặp lại cho đến khi low < high mà arr[low] > pivot và arr[high] < pivot thì đổi chỗ hai phần tử low và high.
Sau cùng, ta đổi chỗ hai phần tử low và pivot cho nhau. Khi đó, phần tử low đã đứng đúng vị trí và chia dãy số làm đôi (bên trái và bên phải).
Đánh giá thuật toán sắp xếp nhanh
Độ phức tạp thuật toán:
Trường hợp tốt: O(n*log(n))
Trung bình: O(n*log(n))
Trường hợp xấu: O(n2)
Không gian bộ nhớ sử dụng: O(log(n))
Ổn định (Stable): Không
Tại chỗ (In-place): Có
Cách sử dụng:
Quick Sort được sử dụng ở mọi nơi mà không cần sự ổn định
Nhiều biến thể của Quick Sort được sử dụng để phân tách k phần tử nhỏ nhất hoặc lớn nhất
Thuật toán chia để trị của Quick Sort cho phép sử dụng song song
Quick Sort là thuật toán sắp xếp khá thân thiện với bộ nhớ đệm vì nó tham chiếu trực tiếp tới mảng mà không cần thêm bộ nhớ để lưu trữ

Sắp xếp trộn – Merge Sort
Giới thiệu
Thuật toán sắp xếp Merge Sort là một trong những thuật toán có độ phức tạp ở mức trung bình và cùng sử dụng phương pháp chia để trị giống thuật toán sắp xếp nhanh Quicksort rồi gọi đệ quy chính nó trên các phân vùng đã chia.
Thuật toán này không chỉ áp dụng trong sắp xếp mà còn ở nhiều bài toán khác. 
Sự khác biệt chính là Quicksort là thuật toán sắp xếp nội (internal), tại chỗ (in-place) trong khi đó Merge Sort lại là thuật toán sắp xếp ngoại (external), không tại chỗ (not-in-place).
Thuật toán này chia mảng cần sắp xếp thành 2 nửa. Với phương thức mergeSort(), tiếp tục lặp lại việc này ở các nửa mảng đã chia cho đến khi chỉ còn 1 phần tử. Sau cùng gộp lại thành mảng đã sắp xếp. Phương thức merge() là tiến trình quan trọng nhất, được sử dụng để gộp hai nửa mảng thành 1 mảng duy nhất đã được sắp xếp.
Khởi đầu với phương thức mergeSort():
Phần này khá đơn giản, chúng ta có 1 mảng cần được sắp xếp, các con trỏ ở vị trí đầu và cuối. Nếu con trỏ ở vị trí cuối nhỏ hơn hoặc bằng vị trí con trỏ ở đầu thì trả về.
Mặt khác, chúng ta sẽ phân vùng mảng thành 2 nửa, gọi phương thức mergeSort() từ đầu đến giữa và từ giữa đến cuối.
Cuối cùng, gọi phương thức merge() để hợp nhất các kết quả thành một mảng đã được sắp xếp.
Đánh giá thuật toán sắp xếp trộn
Độ phức tạp thuật toán:
Trường hợp tốt: O(n*log(n))
Trung bình: O(n*log(n))
Trường hợp xấu: O(n*log(n))
Không gian bộ nhớ sử dụng: O(n)
Ổn định (Stable): Có
Tại chỗ (In-place): Không
Cách sử dụng:
Merge Sort rất phù hợp để sắp xếp danh sách liên kết (Linked lists) trong thời gian O(n*log(n))
Đếm ngược trong một mảng
Sắp xếp ngoại

Sắp xếp chèn – Insertion Sort
Giới thiệu
Sắp xếp chèn (Insertion sort) là một thuật toán sắp xếp in-place, bắt chước cách sắp xếp quân bài của những người chơi bài. Muốn sắp một bộ bài theo trật tự người chơi bài rút lần lượt từ quân thứ 2, so với các quân đứng trước nó để chèn vào vị trí thích hợp.
Với cấu trúc dữ liệu mảng, hãy tưởng tượng nó gồm hai phần: một danh sách con đã được sắp xếp và phần khác là các phần tử không có thứ tự chưa được sắp xếp. 
Giải thuật sắp xếp chèn sẽ thực hiện việc tìm kiếm liên tiếp qua mảng đó, và các phần tử không có thứ tự sẽ được di chuyển và được chèn vào vị trí thích hợp trong danh sách con (của cùng mảng đó).
Đánh giá thuật toán sắp xếp chèn
Độ phức tạp thuật toán:

Trường hợp tốt: O(n)
Trung bình: O(n2)
Trường hợp xấu: O(n2) (Khi mảng đầu vào sắp xếp ngược)
Không gian bộ nhớ sử dụng: O(1)
Ổn định (Stable): Có
Tại chỗ (In-place): Có
Cách sử dụng: Sắp xếp chèn được sử dụng khi số lượng phần tử nhỏ, nó có thể hữu ích khi mảng đầu vào gần như đã được sắp xếp, chỉ một vài phần tử bị đặt sai trong mảng lớn hoàn chỉnh.
