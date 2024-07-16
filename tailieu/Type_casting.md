# type-cas
Ép kiểu (type casting) trong Java là quá trình chuyển đổi một kiểu dữ liệu sang một kiểu dữ liệu khác, giúp ta có thể sử dụng các giá trị từ một kiểu dữ liệu trong một ngữ cảnh yêu cầu một kiểu dữ liệu khác. Việc ép kiểu có thể xảy ra tự động hoặc thủ công.

Trong Java, chúng ta có hai loại ép kiểu:

## Ép kiểu tự động (implicit casting):
Ép kiểu tự động xảy ra khi ta gán một giá trị có kiểu dữ liệu nhỏ hơn sang một kiểu dữ liệu lớn hơn.

double -> float -> long -> int -> short -> byte
### Ép kiểu tường minh (explicit casting).:
Ép kiểu tường minh  xảy ra khi ta gán một giá trị có kiểu dữ liệu lớn hơn sang một kiểu dữ liệu nhỏ hơn.

byte -> short -> int -> long -> float -> double

-Chỉ được sử dụng cho các kiểu dữ liệu có cùng kiểu nguyên thủy hoặc các kiểu dữ liệu trình bày trong hiệu suất tương đương.

-Khi ép kiểu tường minh, cần chú ý đến việc mất mát dữ liệu có thể xảy ra nếu giá trị của biến hoặc biểu thức được ép kiểu vượt quá giới hạn của kiểu dữ liệu đích. Ví dụ, khi chuyển đổi số thực sang số nguyên, phần thập phân của số thực sẽ bị mất đi.

-Khi ép kiểu tường minh cho biến, cần đảm bảo rằng kiểu dữ liệu đích có độ lớn đủ để lưu trữ giá trị của biến đó. Nếu giá trị của biến vượt quá giới hạn của kiểu dữ liệu đích, thì kết quả sẽ không chính xác.
Example: byte to int, int to long, float to double, etc.

## Phương pháp ép kiểu giữa các lớp

Ép kiểu trong Java giữa các đối tượng và lớp có thể được thực hiện thông qua hai phương pháp 
### Upcasting 

là ép kiểu từ lớp con (subclass) sang lớp cha (superclass). Đây là một phép toán an toàn, tức là nó không gây ra bất kỳ lỗi nào và được thực hiện tự động (ngầm định) bởi trình biên dịch Java.
### Downcasting 

là ép kiểu từ lớp cha (superclass) sang lớp con (subclass). Đây là một phép toán không an toàn, nó có thể gây ra lỗi ClassCastException nếu đối tượng không thuộc kiểu dữ liệu con được chỉ định. Do đó, downcasting phải được thực hiện tường minh bằng cách sử dụng cú pháp ép kiểu, ví dụ: (Subclass) object.