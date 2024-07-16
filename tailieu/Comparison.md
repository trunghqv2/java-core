# Comparison 

In Java, there are various ways to compare values and objects. These include comparing primitive values, strings, and objects.

##  So sánh số nguyên và kiểu dữ liệu nguyên thủy khác

Các kiểu dữ liệu nguyên thủy như int, float, double, char có thể được so sánh trực tiếp bằng các toán tử so sánh như ==, !=, <, >, <=, >=.
##  So sánh chuỗi (String)

Trong Java, String là một lớp đặc biệt và không thể so sánh trực tiếp bằng toán tử == để kiểm tra nội dung của chuỗi. Thay vào đó, sử dụng phương thức equals hoặc compareTo.
equals(): Compares the content of two strings.
compareTo(): Compares two strings lexicographically.

##  So sánh đối tượng (Object)

Để so sánh các đối tượng tùy chỉnh, cần ghi đè phương thức equals và hashCode. Thêm vào đó, có thể sử dụng giao diện Comparable hoặc Comparator để so sánh đối tượng.


Sử dụng == để so sánh các kiểu nguyên thủy và so sánh tham chiếu.
Sử dụng equals để so sánh nội dung chuỗi và các đối tượng.
Ghi đè compareTo hoặc sử dụng Comparator để định nghĩa thứ tự sắp xếp cho các đối tượng tùy chỉnh.